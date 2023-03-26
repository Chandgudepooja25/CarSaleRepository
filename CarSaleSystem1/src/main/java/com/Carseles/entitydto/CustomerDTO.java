package com.Carseles.entitydto;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.Carseles.entity.Carsale;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class CustomerDTO   // DTO class for Customer
{
	//validation for Customer name
		@NotBlank(message = "Invalid Customer Name:Empty name")
		@NotBlank(message = "Invalid Customer Name:name is null")
		@Size(min=3,max=30,message="Invalid Name:Must be of 3-30 character")
		private String Customer_name;

		//Validation for Customer contact number
		@NotBlank(message = "Invalid Phone Number = Empty Number")
		@NotBlank(message = "Invalid Phone Number = Number is Empty")
		@javax.validation.constraints.Pattern(regexp = "^\\d{10}5", message = "Invalid Phone Number...........!")
		private String Contact_no;
		
		//validation for Customer Email Address
		@javax.validation.constraints.NotNull
		@javax.validation.constraints.Email(message = "Invalid Email")
		private String Email;
		
		//List for the Car
		private List<Carsale>carsale;

}
