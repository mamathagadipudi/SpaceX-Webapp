package com.elabs.spacex.rocket;

public class Mass {
	private double kg;
	private double lb;
	
	@Override
	public String toString() {
		return "Mass [kg=" + kg + ", lb=" + lb + "]";
	}
	/**
	 * @return the kg
	 */
	public double getKg() {
		return kg;
	}
	/**
	 * @param kg the kg to set
	 */
	public void setKg(double kg) {
		this.kg = kg;
	}
	/**
	 * @return the lb
	 */
	public double getLb() {
		return lb;
	}
	/**
	 * @param lb the lb to set
	 */
	public void setLb(double lb) {
		this.lb = lb;
	}
}
