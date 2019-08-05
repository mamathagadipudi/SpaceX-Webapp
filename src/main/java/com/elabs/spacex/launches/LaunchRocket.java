package com.elabs.spacex.launches;

public class LaunchRocket {
	
	 private String rocket_id;
	 private String rocket_name;
	 private String rocket_type;
	 First_stage First_stageObject;
	 Second_stage Second_stageObject;
	 Fairings FairingsObject;


	 // Getter Methods 

	 @Override
	public String toString() {
		return "Rocket: rocket_id=" + rocket_id + ", rocket_name=" + rocket_name + ", rocket_type=" + rocket_type
				+ ", First_stageObject=" + First_stageObject.toString() + ", Second_stageObject=" + Second_stageObject.toString()
				+ ", FairingsObject=" + FairingsObject.toString() + " ";
	}

	public String getRocket_id() {
	  return rocket_id;
	 }

	 public String getRocket_name() {
	  return rocket_name;
	 }

	 public String getRocket_type() {
	  return rocket_type;
	 }

	 public First_stage getFirst_stage() {
	  return First_stageObject;
	 }

	 public Second_stage getSecond_stage() {
	  return Second_stageObject;
	 }

	 public Fairings getFairings() {
	  return FairingsObject;
	 }

	 // Setter Methods 

	 public void setRocket_id(String rocket_id) {
	  this.rocket_id = rocket_id;
	 }

	 public void setRocket_name(String rocket_name) {
	  this.rocket_name = rocket_name;
	 }

	 public void setRocket_type(String rocket_type) {
	  this.rocket_type = rocket_type;
	 }

	 public void setFirst_stage(First_stage first_stageObject) {
	  this.First_stageObject = first_stageObject;
	 }

	 public void setSecond_stage(Second_stage second_stageObject) {
	  this.Second_stageObject = second_stageObject;
	 }

	 public void setFairings(Fairings fairingsObject) {
	  this.FairingsObject = fairingsObject;
	 }
}