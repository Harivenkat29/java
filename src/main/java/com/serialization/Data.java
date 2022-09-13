package com.serialization;

public class Data {
	int minimumtemp;
	int maximumtemp;
	String currency;
	String capital;
	
	public Data(int mi,int ma,String ca,String cu) {
		this.maximumtemp = mi;
		this.minimumtemp =ma;
		this.currency = ca;
		this.capital = cu;
	}

	
	public int getMinimumtemp() {
		return minimumtemp;
	}

	public void setMinimumtemp(int minimumtemp) {
		this.minimumtemp = minimumtemp;
	}

	public int getMaximumtemp() {
		return maximumtemp;
	}

	public void setMaximumtemp(int maximumtemp) {
		this.maximumtemp = maximumtemp;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	
		
		
		

	}

