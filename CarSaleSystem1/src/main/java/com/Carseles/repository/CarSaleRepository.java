package com.Carseles.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Carseles.entity.Carsale;


//Repository class
public interface CarSaleRepository extends JpaRepository<Carsale, Integer>  {

}
