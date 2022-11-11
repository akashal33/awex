package com.awe.beans;

public class Radio {

	private String radioName;
	private double range;
	private Receiver receiver;
	private Tunner tunner;
	
	
	
	
	public Radio() {
	
	}


	public Radio(Receiver receiver) {
		this.receiver = receiver;
	}
	
	
	public Radio(Receiver receiver, Tunner tunner) {
		this.receiver = receiver;
		this.tunner = tunner;
	}

  
	/*
	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}
	
	

	*/


	public void setRadioName(String radioName) {
		this.radioName = radioName;
	}
	

	public void setRange(double range) {
		this.range = range;
	}
	


	
	
	@Override
	public String toString() {
		return "Radio [radioName=" + radioName + ", range=" + range + ", receiver=" + receiver + ", tunner=" + tunner
				+ "]";
	}
	
	
	
	
	
}
