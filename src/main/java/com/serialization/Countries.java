package com.serialization;

public class Countries {

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	String country;
	Data data;

	public Countries(String co, Data dt) {
		this.data = dt;
		this.country = co;

	}

}
