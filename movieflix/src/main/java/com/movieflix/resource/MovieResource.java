package com.movieflix.resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movieflix.bean.Movie;
import com.movieflix.service.MovieRetrievalService;
import com.movieflix.util.AppConstant;

/**
 * Movie resource to handle movie based operations.
 */
@RestController
@RequestMapping("/api/movies")
public class MovieResource {

	@Autowired
	MovieRetrievalService movieRetrievalService;
	//
	// public MovieResource(MovieRetrievalService movieRetrievalService) {
	// this.movieRetrievalService = movieRetrievalService;
	// }

	/**
	 * This api generates a json file containing movies grouped by age-Rating.
	 * 
	 * @return
	 */
	@GetMapping("/sort/age-rating")
	public ResponseEntity<Map<String, ArrayList<Movie>>> getMoviesSortByAgeRating() {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		Map<String, ArrayList<Movie>> movieMap = new HashMap<String, ArrayList<Movie>>();

		try {
			movieMap = movieRetrievalService.readData();
			return new ResponseEntity<>(movieMap, httpHeaders, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(movieMap, httpHeaders, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
