package com.Carseles.service;

import com.Carseles.entity.Customer;
import com.Carseles.entitydto.CustomerDTO;

public interface CustomerService  //Service interface
{
	//Adding customer 
		Customer addCustomer(CustomerDTO customerdto);
		
		//getting Single customer detail
		Customer getACustomerById(int customerId);
		
		// Update customer detail
		Customer update(Customer customer,int customerId);
		
		//Delete the customer
		String delete(int customerId);

}
