package com.Carseles.seviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Carseles.entity.Customer;
import com.Carseles.entitydto.CustomerDTO;
import com.Carseles.repository.CustomerRepository;
import com.Carseles.service.CustomerService;

@Service
//Implementation of service interface
public class CustomerServicelmpl implements CustomerService
{
	//constructor injection
		@Autowired
		private CustomerRepository customerrepository;
	
	//To add a customer
	@Override
	public Customer addCustomer(CustomerDTO customerdto) {
		Customer customer = Customer.builder().customer_name(customerdto.getCustomer_name())
				.contact_no((String) customerdto.getContact_no())
				.email(customerdto.getEmail()).build();
		return  customerrepository.save(customer);
	}
    
	//find a customer by their id
	@Override
	public Customer getACustomerById(int customerId) 
	{
		
		return customerrepository.findById(customerId).get();
	}

	//To update an customer details by their Id
	@Override
	public Customer update(Customer customer, int customerId) {
		Customer _customer = customerrepository.findById(customerId).get();
		_customer.setCustomer_name(customer.getCustomer_name());
		_customer.setContact_no(customer.getContact_no());
		_customer.setEmail(customer.getEmail());
		return customerrepository.save(_customer);
	}
	
	//To delete an customer by their Id
	@Override
	public String delete(int customerId) {
		customerrepository.deleteById(customerId);
		return "The Customer with id " + customerId + " has deleted!!";
	}

}
