package com.serialization;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SimpleCode {

	@Test
	public void name() throws JsonProcessingException {
		String na = "serialization";
		String de = "apitesting";
		String hm = "payload";
        
		Payload pay = new Payload(na, de, hm);
		ObjectMapper obj = new ObjectMapper();
		String writeValueAsString = obj.writerWithDefaultPrettyPrinter().writeValueAsString(pay);

		System.out.println(writeValueAsString);

	}

}
