package com.elabs.spacex.rocket;

public class Diameter {
	private double meters;
    private double feet;
    
	@Override
	public String toString() {
		return "Diameter [meters=" + meters + ", feet=" + feet + "]";
	}
	/**
	 * @return the meters
	 */
	public double getMeters() {
		return meters;
	}
	/**
	 * @param meters the meters to set
	 */
	public void setMeters(double meters) {
		this.meters = meters;
	}
	/**
	 * @return the feet
	 */
	public double getFeet() {
		return feet;
	}
	/**
	 * @param feet the feet to set
	 */
	public void setFeet(double feet) {
		this.feet = feet;
	}
}
