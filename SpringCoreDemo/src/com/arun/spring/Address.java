package com.arun.spring;

public class Address {
	private String hName;
	private String dist;
	private String state;
	
	public Address() {
		
	}
	
	public Address(String hName, String dist, String state) {
		this.hName = hName;
		this.dist = dist;
		this.state = state;
	}
	
	public String gethName() {
		return hName;
	}
	public void sethName(String hName) {
		this.hName = hName;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [hName=" + hName + ", dist=" + dist + ", state=" + state + "]";
	}
	
}
