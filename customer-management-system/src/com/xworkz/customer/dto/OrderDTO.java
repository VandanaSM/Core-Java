package com.xworkz.customer.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class OrderDTO {
  
	private int id;
	private String name;
	private String address;
	private long contactNo;
	private String type;
	private int quantity;
	private double billAmount;
	

}
