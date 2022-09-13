package com.serialization;

public class Payloads {

	String describtion;
	String region;
	Countries countries;
	public Payloads( String re,String de, Countries co) {
		this.countries = co;
		this.describtion = de;
		this.region = re;

	}
    public String getDescribtion() {
		return describtion;
	}

	public void setDescribtion(String describtion) {
		this.describtion = describtion;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Countries getCountries() {
		return countries;
	}

	public void setCountries(Countries countries) {
		this.countries = countries;
	}

}
