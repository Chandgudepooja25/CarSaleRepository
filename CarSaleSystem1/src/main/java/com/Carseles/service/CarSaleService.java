package com.Carseles.service;

import java.util.List;

import com.Carseles.entity.Carsale;
import com.Carseles.entitydto.CarSaleDTO;



public interface CarSaleService   //service interface
{
	//Getting All car 
    List<Carsale>getAllCarSale();
    
    //  Adding car
    Carsale createCarSale(CarSaleDTO c);
    
    // Update car detail
    Carsale updateCarSale(CarSaleDTO carSaleDTO, int id);
    
  //getting Single car detail
    Carsale getACarSale(int id);
    
    
  //Delete the car
	String deleteCarById(int id);

}
