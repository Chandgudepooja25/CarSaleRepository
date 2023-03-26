package com.Carseles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Carseles.entity.Carsale;
import com.Carseles.entity.Customer;
import com.Carseles.repository.CarSaleRepository;
import com.Carseles.repository.CustomerRepository;

@SpringBootApplication
public class CarSaleSystem1Application implements CommandLineRunner 
{
	@Autowired
	private CustomerRepository customerrepository;
	
	
	
	@Autowired
	 private CarSaleRepository carSaleRepository;

	public static void main(String[] args) 
	{
		SpringApplication.run(CarSaleSystem1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		//Adding Dummy data for testing
		
				//create customer object
				Customer c1 = Customer.builder().customerId(111).customer_name("Pooja").contact_no("4144141411").email("jay@gmail.com")
						.build();
				
				//save the customer object 
				customerrepository.save(c1);
				
				//create car object
		Carsale s1=Carsale.builder().name("BMW").price(20000).brand("BMW 10").build();
		Carsale s2=Carsale.builder().name("suzuki").price(45000).brand("maruti").build();
		Carsale s3=Carsale.builder().name("alto").price(25000).brand("maruti").build();
		
		//save the car object 
		carSaleRepository.save(s1);
		carSaleRepository.save(s2);
		carSaleRepository.save(s3);
		
		//c1.setCarSale(Arrays.asList(s1, s2,s3));
		//customerrepository.save(c1);
		System.out.println("----------------------------- Save all ----------------------------");
		
	}

}
