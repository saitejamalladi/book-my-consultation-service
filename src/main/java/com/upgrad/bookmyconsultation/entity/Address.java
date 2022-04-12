package com.upgrad.bookmyconsultation.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	@Id
	private String id;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String postcode;
}
