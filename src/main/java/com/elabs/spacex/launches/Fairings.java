package com.elabs.spacex.launches;

public class Fairings {
	 private boolean reused;
	 private boolean recovery_attempt;
	 private boolean recovered;
	 private String ship = null;


	 // Getter Methods 

	 @Override
	public String toString() {
		return "Fairings: reused=" + reused + ", recovery_attempt=" + recovery_attempt + ", recovered=" + recovered
				+ ", ship=" + ship + " ";
	}

	public boolean getReused() {
	  return reused;
	 }

	 public boolean getRecovery_attempt() {
	  return recovery_attempt;
	 }

	 public boolean getRecovered() {
	  return recovered;
	 }

	 public String getShip() {
	  return ship;
	 }

	 // Setter Methods 

	 public void setReused(boolean reused) {
	  this.reused = reused;
	 }

	 public void setRecovery_attempt(boolean recovery_attempt) {
	  this.recovery_attempt = recovery_attempt;
	 }

	 public void setRecovered(boolean recovered) {
	  this.recovered = recovered;
	 }

	 public void setShip(String ship) {
	  this.ship = ship;
	 }
}