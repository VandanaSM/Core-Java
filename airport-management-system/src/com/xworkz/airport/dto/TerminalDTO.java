package com.xworkz.airport.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class TerminalDTO {

	private int id;
	private int noOfBookingCounters;
	private int noOfShops;
	private int noOfCheckInCounters;
	private int noOfBaggageCounters;

}
