package com.Carseles.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

@Entity
@Table(name="Customer")
public class Customer {
	// Declaring variables of entity class and adding that variables in table
		@Id
		
		@Column(name= "customerId")
		private int customerId;
		
		@Column(name = "cust_name", length = 30)
		private String customer_name;
		
		@Column(name = "contact_no", length = 10)
		private String contact_no;
		
		@Column(name = "Email", length = 30)
		private String email;
		
		//one to many relationship
		@OneToMany(mappedBy = "Customer", cascade = CascadeType.ALL)
		//crate a List for car
		private List<Carsale> carSale ;

}
