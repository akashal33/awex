package com.awe.beans;

public class Receiver {
	
	private double frequancy;
	private String receiverType;
	public void setFrequancy(double frequancy) {
		this.frequancy = frequancy;
	}
	public void setReceiverType(String receiverType) {
		this.receiverType = receiverType;
	}
	
	@Override
	public String toString() {
		return "Receiver [frequancy=" + frequancy + ", receiverType=" + receiverType + "]";
	}
	

}
