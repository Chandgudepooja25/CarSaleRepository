package com.Carseles.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.Carseles.entity.Customer;

//Repository class
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
