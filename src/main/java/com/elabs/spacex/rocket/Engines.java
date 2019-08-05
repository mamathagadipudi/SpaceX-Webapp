package com.elabs.spacex.rocket;

public class Engines {
	 private float number;
	 private String type;
	 private String version;
	 private String layout;
	 private float engine_loss_max;
	 private String propellant_1;
	 private String propellant_2;
	 private Thursts Thrust_sea_level;
	 private Thursts  Thrust_vacuum;
	 private float thrust_to_weight;
	 
	 @Override
		public String toString() {
			return "Engines [number=" + number + ", type=" + type + ", version=" + version + ", layout=" + layout
					+ ", engine_loss_max=" + engine_loss_max + ", propellant_1=" + propellant_1 + ", propellant_2="
					+ propellant_2 + ", Thrust_sea_level=" + Thrust_sea_level + ", Thrust_vacuum=" + Thrust_vacuum
					+ ", thrust_to_weight=" + thrust_to_weight + "]";
	}

	/**
	 * @return the number
	 */
	public float getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(float number) {
		this.number = number;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}
	/**
	 * @param version the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}
	/**
	 * @return the layout
	 */
	public String getLayout() {
		return layout;
	}
	/**
	 * @param layout the layout to set
	 */
	public void setLayout(String layout) {
		this.layout = layout;
	}
	/**
	 * @return the engine_loss_max
	 */
	public float getEngine_loss_max() {
		return engine_loss_max;
	}
	/**
	 * @param engine_loss_max the engine_loss_max to set
	 */
	public void setEngine_loss_max(float engine_loss_max) {
		this.engine_loss_max = engine_loss_max;
	}
	/**
	 * @return the propellant_1
	 */
	public String getPropellant_1() {
		return propellant_1;
	}
	/**
	 * @param propellant_1 the propellant_1 to set
	 */
	public void setPropellant_1(String propellant_1) {
		this.propellant_1 = propellant_1;
	}
	/**
	 * @return the propellant_2
	 */
	public String getPropellant_2() {
		return propellant_2;
	}
	/**
	 * @param propellant_2 the propellant_2 to set
	 */
	public void setPropellant_2(String propellant_2) {
		this.propellant_2 = propellant_2;
	}
	/**
	 * @return the thrust_sea_level
	 */
	public Thursts getThrust_sea_level() {
		return Thrust_sea_level;
	}
	/**
	 * @param thrust_sea_level the thrust_sea_level to set
	 */
	public void setThrust_sea_level(Thursts thrust_sea_level) {
		Thrust_sea_level = thrust_sea_level;
	}
	/**
	 * @return the thrust_vacuum
	 */
	public Thursts getThrust_vacuum() {
		return Thrust_vacuum;
	}
	/**
	 * @param thrust_vacuum the thrust_vacuum to set
	 */
	public void setThrust_vacuum(Thursts thrust_vacuum) {
		Thrust_vacuum = thrust_vacuum;
	}
	/**
	 * @return the thrust_to_weight
	 */
	public float getThrust_to_weight() {
		return thrust_to_weight;
	}
	/**
	 * @param thrust_to_weight the thrust_to_weight to set
	 */
	public void setThrust_to_weight(float thrust_to_weight) {
		this.thrust_to_weight = thrust_to_weight;
	}
}
