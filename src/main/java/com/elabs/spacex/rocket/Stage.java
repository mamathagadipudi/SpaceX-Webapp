package com.elabs.spacex.rocket;

public class Stage {
    private Boolean reusable;
    private int engines;
    private int fuel_amount_tons;
    private int burn_time_sec;
    private Thursts thrust_sea_level;
    private Thursts thrust_vacuum;
    private Thursts thrust;
    
    @Override
	public String toString() {
		return "Stage [reusable=" + reusable + ", engines=" + engines + ", fuel_amount_tons=" + fuel_amount_tons
				+ ", burn_time_sec=" + burn_time_sec + ", thrust_sea_level=" + thrust_sea_level + ", thrust_vacuum="
				+ thrust_vacuum + ", thrust=" + thrust + ", payloads=" + payloads + "]";
	}
	private PayLoads payloads;
   
	/**
	 * @return the reusable
	 */
	public Boolean getReusable() {
		return reusable;
	}
	/**
	 * @param reusable the reusable to set
	 */
	public void setReusable(Boolean reusable) {
		this.reusable = reusable;
	}
	/**
	 * @return the engines
	 */
	public int getEngines() {
		return engines;
	}
	/**
	 * @param engines the engines to set
	 */
	public void setEngines(int engines) {
		this.engines = engines;
	}
	/**
	 * @return the fuel_amount_tons
	 */
	public int getFuel_amount_tons() {
		return fuel_amount_tons;
	}
	/**
	 * @param fuel_amount_tons the fuel_amount_tons to set
	 */
	public void setFuel_amount_tons(int fuel_amount_tons) {
		this.fuel_amount_tons = fuel_amount_tons;
	}
	/**
	 * @return the burn_time_sec
	 */
	public int getBurn_time_sec() {
		return burn_time_sec;
	}
	/**
	 * @param burn_time_sec the burn_time_sec to set
	 */
	public void setBurn_time_sec(int burn_time_sec) {
		this.burn_time_sec = burn_time_sec;
	}
	/**
	 * @return the thrust_sea_level
	 */
	public Thursts getThrust_sea_level() {
		return thrust_sea_level;
	}
	/**
	 * @param thrust_sea_level the thrust_sea_level to set
	 */
	public void setThrust_sea_level(Thursts thrust_sea_level) {
		this.thrust_sea_level = thrust_sea_level;
	}
	/**
	 * @return the thrust_vacuum
	 */
	public Thursts getThrust_vacuum() {
		return thrust_vacuum;
	}
	/**
	 * @param thrust_vacuum the thrust_vacuum to set
	 */
	public void setThrust_vacuum(Thursts thrust_vacuum) {
		this.thrust_vacuum = thrust_vacuum;
	}
	/**
	 * @return the thrust
	 */
	public Thursts getThrust() {
		return thrust;
	}
	/**
	 * @param thrust the thrust to set
	 */
	public void setThrust(Thursts thrust) {
		this.thrust = thrust;
	}
	/**
	 * @return the payloads
	 */
	public PayLoads getPayloads() {
		return payloads;
	}
	/**
	 * @param payloads the payloads to set
	 */
	public void setPayloads(PayLoads payloads) {
		this.payloads = payloads;
	}
}
