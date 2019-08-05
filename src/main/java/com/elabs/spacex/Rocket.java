package com.elabs.spacex;

import java.util.Arrays;

import com.elabs.spacex.rocket.Diameter;
import com.elabs.spacex.rocket.Engines;
import com.elabs.spacex.rocket.Height;
import com.elabs.spacex.rocket.LandingLegs;
import com.elabs.spacex.rocket.Mass;
import com.elabs.spacex.rocket.PayloadWeights;
import com.elabs.spacex.rocket.Stage;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Rocket {

	private String id;
	private boolean active;
	private int stages;
	private int  boosters;
	private int cost_per_launch;
	private float success_rate_pct;
	private String first_flight;
	private String country;
	private String  company;  
	private Height height;
	private Diameter diameter;
	private Mass  mass;
	private PayloadWeights[] payload_weights;
	private Stage first_stage;
	private Engines engines;
	private LandingLegs landing_legs;
	private String wikipedia;
	private String description;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Rocket [id=" + id + ", active=" + active + ", stages=" + stages + ", boosters=" + boosters
				+ ", cost_per_launch=" + cost_per_launch + ", success_rate_pct=" + success_rate_pct + ", first_flight="
				+ first_flight + ", country=" + country + ", company=" + company + ", height=" + height + ", diameter="
				+ diameter + ", mass=" + mass + ", payload_weights=" + Arrays.toString(payload_weights)
				+ ", first_stage=" + first_stage + ", engines=" + engines + ", landing_legs=" + landing_legs
				+ ", wikipedia=" + wikipedia + ", description=" + description + ", rocket_id=" + rocket_id
				+ ", rocket_name=" + rocket_name + ", rocket_type=" + rocket_type + "]";
	}
	private String rocket_id;
	private String rocket_name;
	private String rocket_type;

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
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}
	/**
	 * @param active the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}
	/**
	 * @return the stages
	 */
	public int getStages() {
		return stages;
	}
	/**
	 * @param stages the stages to set
	 */
	public void setStages(int stages) {
		this.stages = stages;
	}
	/**
	 * @return the boosters
	 */
	public int getBoosters() {
		return boosters;
	}
	/**
	 * @param boosters the boosters to set
	 */
	public void setBoosters(int boosters) {
		this.boosters = boosters;
	}
	/**
	 * @return the cost_per_launch
	 */
	public int getCost_per_launch() {
		return cost_per_launch;
	}
	/**
	 * @param cost_per_launch the cost_per_launch to set
	 */
	public void setCost_per_launch(int cost_per_launch) {
		this.cost_per_launch = cost_per_launch;
	}
	/**
	 * @return the success_rate_pct
	 */
	public float getSuccess_rate_pct() {
		return success_rate_pct;
	}
	/**
	 * @param success_rate_pct the success_rate_pct to set
	 */
	public void setSuccess_rate_pct(float success_rate_pct) {
		this.success_rate_pct = success_rate_pct;
	}
	/**
	 * @return the first_flight
	 */
	public String getFirst_flight() {
		return first_flight;
	}
	/**
	 * @param first_flight the first_flight to set
	 */
	public void setFirst_flight(String first_flight) {
		this.first_flight = first_flight;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * @return the height
	 */
	public Height getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(Height height) {
		this.height = height;
	}
	/**
	 * @return the diameter
	 */
	public Diameter getDiameter() {
		return diameter;
	}
	/**
	 * @param diameter the diameter to set
	 */
	public void setDiameter(Diameter diameter) {
		this.diameter = diameter;
	}
	/**
	 * @return the mass
	 */
	public Mass getMass() {
		return mass;
	}
	/**
	 * @param mass the mass to set
	 */
	public void setMass(Mass mass) {
		this.mass = mass;
	}
	/**
	 * @return the payload_weights
	 */
	public String getPayload_weights() {
		return Arrays.toString(payload_weights);
	}
	/**
	 * @param payload_weights the payload_weights to set
	 */
	public void setPayload_weights(PayloadWeights[] payload_weights) {
		this.payload_weights = payload_weights;
	}
	/**
	 * @return the first_stage
	 */
	public Stage getFirst_stage() {
		return first_stage;
	}
	/**
	 * @param first_stage the first_stage to set
	 */
	public void setFirst_stage(Stage first_stage) {
		this.first_stage = first_stage;
	}
	/**
	 * @return the engines
	 */
	public Engines getEngines() {
		return engines;
	}
	/**
	 * @param engines the engines to set
	 */
	public void setEngines(Engines engines) {
		this.engines = engines;
	}
	/**
	 * @return the landing_legs
	 */
	public LandingLegs getLanding_legs() {
		return landing_legs;
	}
	/**
	 * @param landing_legs the landing_legs to set
	 */
	public void setLanding_legs(LandingLegs landing_legs) {
		this.landing_legs = landing_legs;
	}
	/**
	 * @return the wikipedia
	 */
	public String getWikipedia() {
		return wikipedia;
	}
	/**
	 * @param wikipedia the wikipedia to set
	 */
	public void setWikipedia(String wikipedia) {
		this.wikipedia = wikipedia;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the rocket_id
	 */
	public String getRocket_id() {
		return rocket_id;
	}
	/**
	 * @param rocket_id the rocket_id to set
	 */
	public void setRocket_id(String rocket_id) {
		this.rocket_id = rocket_id;
	}
	/**
	 * @return the rocket_name
	 */
	public String getRocket_name() {
		return rocket_name;
	}
	/**
	 * @param rocket_name the rocket_name to set
	 */
	public void setRocket_name(String rocket_name) {
		this.rocket_name = rocket_name;
	}
	/**
	 * @return the rocket_type
	 */
	public String getRocket_type() {
		return rocket_type;
	}
	/**
	 * @param rocket_type the rocket_type to set
	 */
	public void setRocket_type(String rocket_type) {
		this.rocket_type = rocket_type;
	}
}