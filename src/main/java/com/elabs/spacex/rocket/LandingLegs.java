package com.elabs.spacex.rocket;

public class LandingLegs {
	 private int number;
	 private String material;
	 
	@Override
	public String toString() {
		return "LandingLegs [number=" + number + ", material=" + material + "]";
	}
	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	/**
	 * @return the material
	 */
	public String getMaterial() {
		return material;
	}
	/**
	 * @param material the material to set
	 */
	public void setMaterial(String material) {
		this.material = material;
	}
}
