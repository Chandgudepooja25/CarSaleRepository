package com.Carseles.entitydto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CarSaleDTO    //DTO class use for the validation
{
	//validation for car name
	@NotBlank(message="Invalid name=Empty name")
	@NotNull(message="Invalid name=Name is empty")
	@Size(min=3,max=30,message="Invalid Name:Must be of 3-30 character")
	private String name;
	
	//validation for Brand
	@NotBlank(message="Invalid Brand name=Empty brand name")
	@NotNull(message="Invalid Brand name= Brand Name is empty")
	private String brand;
	
	//validation for Price
	@NotBlank(message="Invalid price name=Empty price name")
	@NotNull(message="Invalid price name= Brand price is empty")
	private Integer price;

}
