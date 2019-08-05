package com.elabs.spacex.launches;

public class Launch_site {
	 private String site_id;
	 private String site_name;
	 private String site_name_long;


	 // Getter Methods 

	 @Override
	public String toString() {
		return "Launch_site: site_id=" + site_id + ", site_name=" + site_name + ", site_name_long=" + site_name_long
				+ " ";
	}

	public String getSite_id() {
	  return site_id;
	 }

	 public String getSite_name() {
	  return site_name;
	 }

	 public String getSite_name_long() {
	  return site_name_long;
	 }

	 // Setter Methods 

	 public void setSite_id(String site_id) {
	  this.site_id = site_id;
	 }

	 public void setSite_name(String site_name) {
	  this.site_name = site_name;
	 }

	 public void setSite_name_long(String site_name_long) {
	  this.site_name_long = site_name_long;
	 }
}
	
