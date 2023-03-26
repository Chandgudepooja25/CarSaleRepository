package com.Carseles.controller;

import java.util.List;

import javax.validation.Valid;

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

import com.Carseles.entity.Carsale;
import com.Carseles.entitydto.CarSaleDTO;
import com.Carseles.service.CarSaleService;





@RestController
@RequestMapping("/car")
public class CarSaleController
{
	//Constructor Injection
	@Autowired
	private CarSaleService carSaleService;
	
	//Constructor Injection
	@PostMapping("/sale")
	public ResponseEntity<Carsale> createCarSale(@RequestBody @Valid CarSaleDTO c){
		Carsale c1=carSaleService.createCarSale(c);
		return new ResponseEntity<>(c1,HttpStatus.CREATED);
		
	}
	
	//Getting all car details
	@GetMapping("/car")
	public ResponseEntity<List<Carsale>> fetchAllCarSale(){
		List<Carsale> carSale=carSaleService.getAllCarSale();
		return ResponseEntity.ok(carSale);
	}
	
	//update car details
	@PutMapping("/carName")
	public ResponseEntity<Carsale> updateCarSale(@PathVariable("id")int id,@RequestBody CarSaleDTO carSaleDTO)
	{
		carSaleService.updateCarSale(carSaleDTO, id);
		return ResponseEntity.ok().body(carSaleService.updateCarSale(carSaleDTO, id));
	}
	
	//delete the car
	@DeleteMapping("/car/{id}")
	public ResponseEntity<Carsale> deleteCarSale(@PathVariable int id){
		carSaleService.deleteCarById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}