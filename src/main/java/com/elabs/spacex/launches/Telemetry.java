package com.elabs.spacex.launches;

public class Telemetry {
	 private String flight_club;


	 // Getter Methods 

	 public String getFlight_club() {
	  return flight_club;
	 }

	 // Setter Methods 

	 public void setFlight_club(String flight_club) {
	  this.flight_club = flight_club;
	 }

	@Override
	public String toString() {
		return "Telemetry: flight_club=" + flight_club + " ";
	}
}
