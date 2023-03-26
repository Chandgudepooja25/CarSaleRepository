package com.Carseles.seviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.Carseles.entity.Carsale;
import com.Carseles.entitydto.CarSaleDTO;
import com.Carseles.repository.CarSaleRepository;
import com.Carseles.service.CarSaleService;



@Service
//Implementation of service interface
public class CarSaleServicelmpl implements CarSaleService {
//Constructor Injection
@Autowired

//Constructor Injection
private CarSaleRepository carSaleRepository;
//Constructor Injection
	@Override
	public List<Carsale> getAllCarSale() {
		
		return carSaleRepository.findAll();
	}
    
	//to add the car
	@Override
	public Carsale createCarSale(CarSaleDTO carSaleDTO) {
		Carsale carSale=Carsale.builder().name(carSaleDTO.getName()).price(carSaleDTO.getPrice()).brand(carSaleDTO.getBrand()).build();
		return carSaleRepository.save(carSale);
		
	}
    
	//To update an car details by their Id
	@Override
	public Carsale updateCarSale(CarSaleDTO carSaleDTO, int id) {
		Carsale _carSale=carSaleRepository.findById(id).get();
		_carSale.setName(carSaleDTO.getName());
		_carSale.setPrice(carSaleDTO.getPrice());
		return carSaleRepository.save(_carSale);
	}
	
	//to get a car
	@Override
	public Carsale getACarSale(int id) {
		return carSaleRepository.findById(id).get();
	}
    
	//To delete an car by their Id
	@Override
	public String deleteCarById(int id) {
		carSaleRepository.deleteById(id);
		return "succefully deleted";
	}
	

}
