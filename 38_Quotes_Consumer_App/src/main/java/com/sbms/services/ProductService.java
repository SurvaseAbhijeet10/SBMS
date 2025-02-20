package com.sbms.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductService {

	
	public void getProducts() {
		
		String apiUrl = "https://api.coindesk.com/v1/bpi/currentprice.json";
		
		RestTemplate rt = new RestTemplate();
		
		ResponseEntity<String> resEntity = rt.getForEntity(apiUrl, String.class);
		
		int value = resEntity.getStatusCode().value();
		if(value == 200 ) {
			String body = resEntity.getBody();
			System.out.println(body);
		}
	}
	
}
