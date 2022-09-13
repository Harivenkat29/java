package com.serialization;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ComplexCode {

	@Test
	private void Complex() throws JsonProcessingException {
		
		
		String de = "Map containing Country, Capital, Currency, and some States of that Country";
		String re = "Asia";
		String co ="india";
		int mi = 6;
		int ma = 45;
		String ca = "chennai";
		String cu = "Rupee";
		
		
		Data da = new Data(mi, ma, ca, cu);
		Countries cou = new Countries(co, da);
		Payloads pays = new Payloads(re, de, cou);
		ObjectMapper obj = new ObjectMapper();
		String writeValueAsString = obj.writerWithDefaultPrettyPrinter().writeValueAsString(pays);
		System.out.println(writeValueAsString);

				
		

		
		
		
		
		

	}

}
