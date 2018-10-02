package com.example.apifaketory.RESTAPI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.apifaketory.RESTAPI.domains.Customers;
import com.example.apifaketory.RESTAPI.services.CustomersApiService;

@RestController
public class CustomersController {
	
private CustomersApiService service;

//	private final CustomersApiService service;
//	
	@Autowired
	public CustomersController(CustomersApiService service) {
		this.service = service;
	}
	
	
//	@GetMapping("/customers")
//	public Customers home(){
//		RestTemplate restTemplate = new RestTemplate();
//		Customers customers = restTemplate.getForObject("https://api.predic8.de/shop/customers/", Customers.class);
//		return customers;
//		
//	}
	
	@GetMapping("/customers")
	public String getAll(Model model){
	    model.addAttribute("customers", service.findAllCustomers());
	    return "customers";
	}


}
