package com.Carseles.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Carseles.entity.Customer;
import com.Carseles.entitydto.CustomerDTO;
import com.Carseles.service.CustomerService;

@RestController
@RequestMapping(value="/customerdetails")
public class CustomerController 
{
	//Constructor Injection
		@Autowired
		private CustomerService customerservice;
		
		//Getting all customer details
		@GetMapping("/customer/{id}")
		public Customer getDoctorById(@PathVariable int customerId) {
			return customerservice.getACustomerById(customerId);
			
		}
		
		//Adding a new customer for car
		@PostMapping("/customer")
		public ResponseEntity<Customer>addCustomer(@RequestBody CustomerDTO customerdto)
		{
			return new ResponseEntity<>(customerservice.addCustomer(customerdto), HttpStatus.CREATED);
			
		}
		
		//update customer details
		@PutMapping("/customer/{id}")
		public Customer updateCustomer (@PathVariable int customerId,@RequestBody Customer customer)
		{
			return customerservice.update(customer, customerId);
		}
		
		//delete the customer
		@DeleteMapping("/customer/{id}")
		public String deleteCustomer(@PathVariable int customerId)
		{
			return customerservice.delete(customerId);
			
		}

}
