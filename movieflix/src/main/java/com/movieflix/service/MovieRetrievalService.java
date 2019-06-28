package com.movieflix.service;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.movieflix.bean.Asset;
import com.movieflix.bean.Movie;
import com.movieflix.util.AppConstant;

/**
 * Service class to manage movies.
 */
@Service
public class MovieRetrievalService {

	private static final Logger logger = LoggerFactory.getLogger(MovieRetrievalService.class);
	private final String fileName;

	public MovieRetrievalService(@Value("${assetFile}") String fileName) {
		this.fileName = fileName;
	}

	/*
	 * Method to filter assets as per movies and thereby group by age rating
	 * "Fsk_level_list_facet". The result is written to json file .
	 * 
	 * @returns Success for success scenario and failure for exception
	 * 
	 */
	
	public Map<String, ArrayList<Movie>> readData() throws Exception {
		Map<String, ArrayList<Movie>> outputData = new HashMap<String, ArrayList<Movie>>();
		try {
			byte[] inputData = Files.readAllBytes(Paths.get(ClassLoader.getSystemResource(fileName).toURI()));
			ObjectMapper objtMapper = new ObjectMapper();
			ArrayList<Asset> assetList = objtMapper.readValue(inputData, new TypeReference<ArrayList<Asset>>() {
			});
			
			for (Asset record : assetList) {
				String genre = record.getObject_class();
				if (genre.equalsIgnoreCase(AppConstant.MOVIE_STR)) {
					String fskVal = record.getFsk_level_list_facet().get(0);
					if (outputData.get(fskVal) != null) {
						ArrayList<Movie> existingMovieList = outputData.get(fskVal);
						populateMovieInfo(outputData, record, fskVal, existingMovieList);
					} else {
						populateMovieInfo(outputData, record, fskVal, new ArrayList<Movie>());
					}

				}

			}

			objtMapper.writeValue(new File("src/main/resources/output.json"), outputData);
		} catch (IOException e) {
			logger.error(e.getMessage());
			throw new Exception(e);
		} catch (URISyntaxException e) {
			logger.error(e.getMessage());
			throw new Exception(e);
		}

		return outputData;

	}

	/**
	 * Creating movie object
	 * 
	 * @param outputData
	 *            - data to be written in json file.
	 * @param record
	 *            - a single asset object read from json file.
	 * @param fskVal
	 *            - age rating
	 * @param movieList
	 *            - Movie object to be added in this list.
	 */
	private void populateMovieInfo(Map<String, ArrayList<Movie>> outputData, Asset record, String fskVal,
			ArrayList<Movie> movieList) {
		Movie movieObjt = new Movie();
		movieObjt.setId(record.getId());
		movieObjt.setTitle(record.getTitle());
		movieObjt.setYear(record.getProduction_year());
		movieList.add(movieObjt);
		outputData.put(fskVal, movieList);
	}


}
