package com.elabs.spacex;

import java.util.ArrayList;

import com.elabs.spacex.launches.LaunchRocket;
import com.elabs.spacex.launches.Launch_site;
import com.elabs.spacex.launches.Links;
import com.elabs.spacex.launches.Telemetry;
import com.elabs.spacex.launches.Timeline;

public class Launch {
	 private float flight_number;
	 private String mission_name;
	 ArrayList<String> mission_id = new ArrayList<String>();
	 private String launch_year;
	 private float launch_date_unix;
	 private String launch_date_utc;
	 private String launch_date_local;
	 private boolean is_tentative;
	 private String tentative_max_precision;
	 private boolean tbd;
	 private float launch_window;
	 LaunchRocket LaunchRocket;
	 ArrayList < String > ships = new ArrayList < String > ();
	 Telemetry TelemetryObject;
	 Launch_site Launch_siteObject;
	 private boolean launch_success;
	 Links LinksObject;
	 private String details;
	 private boolean upcoming;
	 
	 @Override
	public String toString() {
		return "Launch [flight_number=" + flight_number + ", mission_name=" + mission_name + ", mission_id="
				+ mission_id + ", launch_year=" + launch_year + ", launch_date_unix=" + launch_date_unix
				+ ", launch_date_utc=" + launch_date_utc + ", launch_date_local=" + launch_date_local
				+ ", is_tentative=" + is_tentative + ", tentative_max_precision=" + tentative_max_precision + ", tbd="
				+ tbd + ", launch_window=" + launch_window + ", RocketObject=" + LaunchRocket + ", ships=" + ships
				+ ", TelemetryObject=" + TelemetryObject + ", Launch_siteObject=" + Launch_siteObject
				+ ", launch_success=" + launch_success + ", LinksObject=" + LinksObject + ", details=" + details
				+ ", upcoming=" + upcoming + ", static_fire_date_utc=" + static_fire_date_utc
				+ ", static_fire_date_unix=" + static_fire_date_unix + ", TimelineObject=" + TimelineObject + "]";
	}

	private String static_fire_date_utc;
	 private float static_fire_date_unix;
	 Timeline TimelineObject;


	 // Getter Methods 

	 public float getFlight_number() {
	  return flight_number;
	 }

	 public String getMission_name() {
	  return mission_name;
	 }

	 public String getLaunch_year() {
	  return launch_year;
	 }

	 public float getLaunch_date_unix() {
	  return launch_date_unix;
	 }

	 public String getLaunch_date_utc() {
	  return launch_date_utc;
	 }

	 public String getLaunch_date_local() {
	  return launch_date_local;
	 }

	 public boolean getIs_tentative() {
	  return is_tentative;
	 }

	 public String getTentative_max_precision() {
	  return tentative_max_precision;
	 }

	 public boolean getTbd() {
	  return tbd;
	 }

	 public float getLaunch_window() {
	  return launch_window;
	 }

	 public LaunchRocket getLaunchRocket() {
	  return LaunchRocket;
	 }

	 public Telemetry getTelemetry() {
	  return TelemetryObject;
	 }

	 public Launch_site getLaunch_site() {
	  return Launch_siteObject;
	 }

	 public boolean getLaunch_success() {
	  return launch_success;
	 }

	 public Links getLinks() {
	  return LinksObject;
	 }

	 public String getDetails() {
	  return details;
	 }

	 public boolean getUpcoming() {
	  return upcoming;
	 }

	 public String getStatic_fire_date_utc() {
	  return static_fire_date_utc;
	 }

	 public float getStatic_fire_date_unix() {
	  return static_fire_date_unix;
	 }

	 public Timeline getTimeline() {
	  return TimelineObject;
	 }

	 // Setter Methods 

	 public void setFlight_number(float flight_number) {
	  this.flight_number = flight_number;
	 }

	 public void setMission_name(String mission_name) {
	  this.mission_name = mission_name;
	 }

	 public void setLaunch_year(String launch_year) {
	  this.launch_year = launch_year;
	 }

	 public void setLaunch_date_unix(float launch_date_unix) {
	  this.launch_date_unix = launch_date_unix;
	 }

	 public void setLaunch_date_utc(String launch_date_utc) {
	  this.launch_date_utc = launch_date_utc;
	 }

	 public void setLaunch_date_local(String launch_date_local) {
	  this.launch_date_local = launch_date_local;
	 }

	 public void setIs_tentative(boolean is_tentative) {
	  this.is_tentative = is_tentative;
	 }

	 public void setTentative_max_precision(String tentative_max_precision) {
	  this.tentative_max_precision = tentative_max_precision;
	 }

	 public void setTbd(boolean tbd) {
	  this.tbd = tbd;
	 }

	 public void setLaunch_window(float launch_window) {
	  this.launch_window = launch_window;
	 }

	 public void setRocket(LaunchRocket launchRocket) {
	  this.LaunchRocket = launchRocket;
	 }

	 public void setTelemetry(Telemetry telemetryObject) {
	  this.TelemetryObject = telemetryObject;
	 }

	 public void setLaunch_site(Launch_site launch_siteObject) {
	  this.Launch_siteObject = launch_siteObject;
	 }

	 public void setLaunch_success(boolean launch_success) {
	  this.launch_success = launch_success;
	 }

	 public void setLinks(Links linksObject) {
	  this.LinksObject = linksObject;
	 }

	 public void setDetails(String details) {
	  this.details = details;
	 }

	 public void setUpcoming(boolean upcoming) {
	  this.upcoming = upcoming;
	 }

	 public void setStatic_fire_date_utc(String static_fire_date_utc) {
	  this.static_fire_date_utc = static_fire_date_utc;
	 }

	 public void setStatic_fire_date_unix(float static_fire_date_unix) {
	  this.static_fire_date_unix = static_fire_date_unix;
	 }

	 public void setTimeline(Timeline timelineObject) {
	  this.TimelineObject = timelineObject;
	 }

	public ArrayList<String> getMission_id() {
		return this.mission_id;
	}

	public void setMission_id(ArrayList<String> mission_id) {
		this.mission_id = mission_id;
	}

	public ArrayList<String> getShips() {
		return ships;
	}

	public void setShips(ArrayList<String> ships) {
		this.ships = ships;
	}

	public Telemetry getTelemetryObject() {
		return TelemetryObject;
	}

	public void setTelemetryObject(Telemetry telemetryObject) {
		TelemetryObject = telemetryObject;
	}

	public Launch_site getLaunch_siteObject() {
		return Launch_siteObject;
	}

	public void setLaunch_siteObject(Launch_site launch_siteObject) {
		Launch_siteObject = launch_siteObject;
	}

	public Links getLinksObject() {
		return LinksObject;
	}

	public void setLinksObject(Links linksObject) {
		LinksObject = linksObject;
	}

	public Timeline getTimelineObject() {
		return TimelineObject;
	}

	public void setTimelineObject(Timeline timelineObject) {
		TimelineObject = timelineObject;
	}

	public void setLaunchRocket(LaunchRocket launchRocket) {
		LaunchRocket = launchRocket;
	}
	}
