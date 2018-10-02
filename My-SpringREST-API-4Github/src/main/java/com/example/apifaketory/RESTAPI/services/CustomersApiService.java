package com.example.apifaketory.RESTAPI.services;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.apifaketory.RESTAPI.domains.Customers;


@Service
public class CustomersApiService {
	
//	define a RestTemplate object
	private final RestTemplate restTemplate;
	
	
//	web service resources endpoints
	private final String GET_ALL_USER = "https://api.predic8.de/shop/customers/";

	
//	define an argument constructor, then pass in the RestTemplate object and  Autowire it
	@Autowired
	public CustomersApiService (RestTemplate restTemplate){
		this.restTemplate = restTemplate;
	}
	
//	Get All Users
//	@returns a list
	@SuppressWarnings("unchecked")
	public List<Customers> findAllCustomers(){
			
		return Arrays.stream(restTemplate.getForObject(GET_ALL_USER,Customers[].class)).collect(Collectors.toList());
	}
	
	
		
}
