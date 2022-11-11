package com.awe.beans;

public class Tunner {
	
	private int tunnerLevel;
	private String tunnerRange;
	public void setTunnerLevel(int tunnerLevel) {
		this.tunnerLevel = tunnerLevel;
	}
	public void setTunnerRange(String tunnerRange) {
		this.tunnerRange = tunnerRange;
	}
	@Override
	public String toString() {
		return "Tunner [tunnerLevel=" + tunnerLevel + ", tunnerRange=" + tunnerRange + "]";
	}
	
	
	

}
