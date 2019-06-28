package com.movieflix.bean;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


/**
 * POJO mapped to asset json.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Asset {
	long asset_id;
	long userrating_average;
	long orders_buy;
	String poster_url;
	long episode_number;
	long season_number;
	long price_rent;
	long userrating_count_four_star;
	long orders_subscription;
	long production_year_min;
	long production_year;
	long production_year_max;
	long _version_;
	long erotic_specifier;
	long price_buy;
	long userrating_count_three_star;
	long generation;
	long object_type;
	long userrating_count_two_star;
	long userrating_count_total;
	long userrating_count_five_star;
	long userrating_count_one_star;
	long orders_rent;

	String timeframe_start;
	String title;
	String description_short;
	String active_license_endtime;
	String active_license_starttime;
	String timeframe_end;

	String editorial_hlong;
	String trailer_object;
	String cover_url;
	String object_class;
	String copyright;
	String change_date;
	String description_teaser;

	String id;
	String timestamp;
	String cover_big_url;
	String full_object;
	String description_long;

	List<String> director_list_facet;
	List<String> production_year_list_facet;
	List<String> media_usage_list;
	List<String> marking_display_list;
	List<String> language_list_facet;
	List<String> child_id_list;
	List<String> fsk_level_list_facet;

	List<String> channel_list_facet;
	List<String> actor_list_facet;
	List<String> author_list_facet;
	List<String> videocontainer_format_list;
	List<String> marking_list;
	List<String> language_piff_list_facet;

	List<String> tag_list_facet;
	List<String> country_list;

	public long getAsset_id() {
		return asset_id;
	}

	public void setAsset_id(long asset_id) {
		this.asset_id = asset_id;
	}

	public long getUserrating_average() {
		return userrating_average;
	}

	public void setUserrating_average(long userrating_average) {
		this.userrating_average = userrating_average;
	}

	public long getOrders_buy() {
		return orders_buy;
	}

	public void setOrders_buy(long orders_buy) {
		this.orders_buy = orders_buy;
	}

	public String getPoster_url() {
		return poster_url;
	}

	public void setPoster_url(String poster_url) {
		this.poster_url = poster_url;
	}

	public long getEpisode_number() {
		return episode_number;
	}

	public void setEpisode_number(long episode_number) {
		this.episode_number = episode_number;
	}

	public long getSeason_number() {
		return season_number;
	}

	public void setSeason_number(long season_number) {
		this.season_number = season_number;
	}

	public long getPrice_rent() {
		return price_rent;
	}

	public void setPrice_rent(long price_rent) {
		this.price_rent = price_rent;
	}

	public long getUserrating_count_four_star() {
		return userrating_count_four_star;
	}

	public void setUserrating_count_four_star(long userrating_count_four_star) {
		this.userrating_count_four_star = userrating_count_four_star;
	}

	public long getOrders_subscription() {
		return orders_subscription;
	}

	public void setOrders_subscription(long orders_subscription) {
		this.orders_subscription = orders_subscription;
	}

	public long getProduction_year_min() {
		return production_year_min;
	}

	public void setProduction_year_min(long production_year_min) {
		this.production_year_min = production_year_min;
	}

	public long getProduction_year() {
		return production_year;
	}

	public void setProduction_year(long production_year) {
		this.production_year = production_year;
	}

	public long getProduction_year_max() {
		return production_year_max;
	}

	public void setProduction_year_max(long production_year_max) {
		this.production_year_max = production_year_max;
	}

	public long get_version_() {
		return _version_;
	}

	public void set_version_(long _version_) {
		this._version_ = _version_;
	}

	public long getErotic_specifier() {
		return erotic_specifier;
	}

	public void setErotic_specifier(long erotic_specifier) {
		this.erotic_specifier = erotic_specifier;
	}

	public long getPrice_buy() {
		return price_buy;
	}

	public void setPrice_buy(long price_buy) {
		this.price_buy = price_buy;
	}

	public long getUserrating_count_three_star() {
		return userrating_count_three_star;
	}

	public void setUserrating_count_three_star(long userrating_count_three_star) {
		this.userrating_count_three_star = userrating_count_three_star;
	}

	public long getGeneration() {
		return generation;
	}

	public void setGeneration(long generation) {
		this.generation = generation;
	}

	public long getObject_type() {
		return object_type;
	}

	public void setObject_type(long object_type) {
		this.object_type = object_type;
	}

	public long getUserrating_count_two_star() {
		return userrating_count_two_star;
	}

	public void setUserrating_count_two_star(long userrating_count_two_star) {
		this.userrating_count_two_star = userrating_count_two_star;
	}

	public long getUserrating_count_total() {
		return userrating_count_total;
	}

	public void setUserrating_count_total(long userrating_count_total) {
		this.userrating_count_total = userrating_count_total;
	}

	public long getUserrating_count_five_star() {
		return userrating_count_five_star;
	}

	public void setUserrating_count_five_star(long userrating_count_five_star) {
		this.userrating_count_five_star = userrating_count_five_star;
	}

	public long getUserrating_count_one_star() {
		return userrating_count_one_star;
	}

	public void setUserrating_count_one_star(long userrating_count_one_star) {
		this.userrating_count_one_star = userrating_count_one_star;
	}

	public long getOrders_rent() {
		return orders_rent;
	}

	public void setOrders_rent(long orders_rent) {
		this.orders_rent = orders_rent;
	}

	public String getTimeframe_start() {
		return timeframe_start;
	}

	public void setTimeframe_start(String timeframe_start) {
		this.timeframe_start = timeframe_start;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription_short() {
		return description_short;
	}

	public void setDescription_short(String description_short) {
		this.description_short = description_short;
	}

	public String getActive_license_endtime() {
		return active_license_endtime;
	}

	public void setActive_license_endtime(String active_license_endtime) {
		this.active_license_endtime = active_license_endtime;
	}

	public String getActive_license_starttime() {
		return active_license_starttime;
	}

	public void setActive_license_starttime(String active_license_starttime) {
		this.active_license_starttime = active_license_starttime;
	}

	public String getTimeframe_end() {
		return timeframe_end;
	}

	public void setTimeframe_end(String timeframe_end) {
		this.timeframe_end = timeframe_end;
	}

	public String getEditorial_hlong() {
		return editorial_hlong;
	}

	public void setEditorial_hlong(String editorial_hlong) {
		this.editorial_hlong = editorial_hlong;
	}

	public String getTrailer_object() {
		return trailer_object;
	}

	public void setTrailer_object(String trailer_object) {
		this.trailer_object = trailer_object;
	}

	public String getCover_url() {
		return cover_url;
	}

	public void setCover_url(String cover_url) {
		this.cover_url = cover_url;
	}

	public String getObject_class() {
		return object_class;
	}

	public void setObject_class(String object_class) {
		this.object_class = object_class;
	}

	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public String getChange_date() {
		return change_date;
	}

	public void setChange_date(String change_date) {
		this.change_date = change_date;
	}

	public String getDescription_teaser() {
		return description_teaser;
	}

	public void setDescription_teaser(String description_teaser) {
		this.description_teaser = description_teaser;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getCover_big_url() {
		return cover_big_url;
	}

	public void setCover_big_url(String cover_big_url) {
		this.cover_big_url = cover_big_url;
	}

	public String getFull_object() {
		return full_object;
	}

	public void setFull_object(String full_object) {
		this.full_object = full_object;
	}

	public String getDescription_long() {
		return description_long;
	}

	public void setDescription_long(String description_long) {
		this.description_long = description_long;
	}

	public List<String> getDirector_list_facet() {
		return director_list_facet;
	}

	public void setDirector_list_facet(List<String> director_list_facet) {
		this.director_list_facet = director_list_facet;
	}

	public List<String> getProduction_year_list_facet() {
		return production_year_list_facet;
	}

	public void setProduction_year_list_facet(List<String> production_year_list_facet) {
		this.production_year_list_facet = production_year_list_facet;
	}

	public List<String> getMedia_usage_list() {
		return media_usage_list;
	}

	public void setMedia_usage_list(List<String> media_usage_list) {
		this.media_usage_list = media_usage_list;
	}

	public List<String> getMarking_display_list() {
		return marking_display_list;
	}

	public void setMarking_display_list(List<String> marking_display_list) {
		this.marking_display_list = marking_display_list;
	}

	public List<String> getLanguage_list_facet() {
		return language_list_facet;
	}

	public void setLanguage_list_facet(List<String> language_list_facet) {
		this.language_list_facet = language_list_facet;
	}

	public List<String> getChild_id_list() {
		return child_id_list;
	}

	public void setChild_id_list(List<String> child_id_list) {
		this.child_id_list = child_id_list;
	}

	public List<String> getFsk_level_list_facet() {
		return fsk_level_list_facet;
	}

	public void setFsk_level_list_facet(List<String> fsk_level_list_facet) {
		this.fsk_level_list_facet = fsk_level_list_facet;
	}

	public List<String> getChannel_list_facet() {
		return channel_list_facet;
	}

	public void setChannel_list_facet(List<String> channel_list_facet) {
		this.channel_list_facet = channel_list_facet;
	}

	public List<String> getActor_list_facet() {
		return actor_list_facet;
	}

	public void setActor_list_facet(List<String> actor_list_facet) {
		this.actor_list_facet = actor_list_facet;
	}

	public List<String> getAuthor_list_facet() {
		return author_list_facet;
	}

	public void setAuthor_list_facet(List<String> author_list_facet) {
		this.author_list_facet = author_list_facet;
	}

	public List<String> getVideocontainer_format_list() {
		return videocontainer_format_list;
	}

	public void setVideocontainer_format_list(List<String> videocontainer_format_list) {
		this.videocontainer_format_list = videocontainer_format_list;
	}

	public List<String> getMarking_list() {
		return marking_list;
	}

	public void setMarking_list(List<String> marking_list) {
		this.marking_list = marking_list;
	}

	public List<String> getLanguage_piff_list_facet() {
		return language_piff_list_facet;
	}

	public void setLanguage_piff_list_facet(List<String> language_piff_list_facet) {
		this.language_piff_list_facet = language_piff_list_facet;
	}

	public List<String> getTag_list_facet() {
		return tag_list_facet;
	}

	public void setTag_list_facet(List<String> tag_list_facet) {
		this.tag_list_facet = tag_list_facet;
	}

	public List<String> getCountry_list() {
		return country_list;
	}

	public void setCountry_list(List<String> country_list) {
		this.country_list = country_list;
	}

}
