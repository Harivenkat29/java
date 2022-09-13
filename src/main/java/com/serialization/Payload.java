package com.serialization;

public class Payload {
	String name;
	String describtion;
	String homepage;

	public Payload(String na, String de, String hm) {
		this.describtion = de;
		this.homepage = hm;
		this.name = na;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescribtion() {
		return describtion;
	}

	public void setDescribtion(String describtion) {
		this.describtion = describtion;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

}
