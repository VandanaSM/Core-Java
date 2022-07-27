package com.xworkz.hotel.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class FoodItemDTO {
  
	private int id;
	private String name;
	private String type;
	private double price;
	private boolean isAvailable;
	private String itemDetails;
	

}
