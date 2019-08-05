package com.elabs.spacex.launches;

import java.util.ArrayList;

public class Second_stage {
	 private float block;
	 ArrayList < String > payloads = new ArrayList < String > ();


	 // Getter Methods 

	 @Override
	public String toString() {
		return "Second_stage: block=" + block + ", payloads=" + payloads + " ";
	}

	public float getBlock() {
	  return block;
	 }

	 // Setter Methods 

	 public void setBlock(float block) {
	  this.block = block;
	}
}
