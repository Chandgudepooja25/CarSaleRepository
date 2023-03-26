package com.Carseles.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

import org.springframework.data.jpa.repository.Query;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Carsale  //Entity class
{
	// Declaring variables of entity class and adding that variables in table
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CarId")
	private Integer id;
	@Column(name="CarName")
	private String name;
	@Column(name="CarBrand")
	private String brand;
	@Column(name="CarPrice")
	private Integer price;
	
	//many to one relationship
		@ManyToOne
		@JoinColumn(name="custmerId")//join the column
		
		@JsonBackReference   //linkage between two field,parent and child role
		private Customer Customer;
	
	
	

}
