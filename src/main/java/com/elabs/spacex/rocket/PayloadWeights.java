package com.elabs.spacex.rocket;

public class PayloadWeights {
	private String id; 
	private String name;
	private String kg;
	private String lb;
	
	@Override
	public String toString() {
		return "PayloadWeights [id=" + id + ", name=" + name + ", kg=" + kg + ", lb=" + lb + "]";
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the kg
	 */
	public String getKg() {
		return kg;
	}
	/**
	 * @param kg the kg to set
	 */
	public void setKg(String kg) {
		this.kg = kg;
	}
	/**
	 * @return the lb
	 */
	public String getLb() {
		return lb;
	}
	/**
	 * @param lb the lb to set
	 */
	public void setLb(String lb) {
		this.lb = lb;
	}
}
