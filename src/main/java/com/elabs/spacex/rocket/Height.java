package com.elabs.spacex.rocket;

public class Height {
	private String meters;
	private String feet;
	
	@Override
	public String toString() {
		return "Height [meters=" + meters + ", feet=" + feet + "]";
	}
	/**
	 * @return the meters
	 */
	public String getMeters() {
		return meters;
	}
	/**
	 * @param meters the meters to set
	 */
	public void setMeters(String meters) {
		this.meters = meters;
	}
	/**
	 * @return the feet
	 */
	public String getFeet() {
		return feet;
	}
	/**
	 * @param feet the feet to set
	 */
	public void setFeet(String feet) {
		this.feet = feet;
	}
}
