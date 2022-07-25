package com.xworkz.airport.crud.impl;

import java.util.Arrays;

import com.xworkz.airport.crud.Airport;
import com.xworkz.airport.dto.TerminalDTO;

public class AirportImpl  implements Airport {
 
	TerminalDTO dtos[];
	int index;
	
	public AirportImpl(int size) {
		dtos=new TerminalDTO[size];
		System.out.println("AirportImpl object is created");
	}
	
	@Override
	public boolean createTerminalDetails(TerminalDTO dto) {
		System.out.println("createTerminalDetails() started");
		boolean isCreated=false;
		if(dto!=null && dto.getId()!=0) {
			dtos[index++]=dto;
			isCreated=true;
			System.out.println("Created Terminal details successfully");
		}
		else {
			System.out.println("Couldnot create terminal details");
		}
		return isCreated;
	}
	
	@Override
	public void getTerminalDetails() {
		System.out.println("Start of getTerminalDetails");
		for(int i=0;i<dtos.length;i++) {
			System.out.println(dtos);
		}
	}
	
	@Override
	public boolean updateNoOfBookingCountersById(int id,int noOfBookingCounters) {
		boolean updatedBookingCounter=false;
		for(int i=0;i<dtos.length;i++) {
			if(dtos[i].getId()==id) {
				dtos[i].setNoOfBookingCounters(noOfBookingCounters);
				updatedBookingCounter=true;
				System.out.println("updated Booking Counter details successfully");
			}
			else {
				System.out.println("couldnot update Booking Counter");
			}
		}
		return updatedBookingCounter;
	}
	
	@Override
	public boolean updateNoOfCheckInCountersById(int id,int noOfCheckInCounters) {
		boolean updatedCheckInCounters=false;
		for(int i=0;i<dtos.length;i++) {
			if(dtos[i].getId()==id) {
				dtos[i].setNoOfCheckInCounters(noOfCheckInCounters);
				updatedCheckInCounters=true;
				System.out.println("Updated noOfCheckInCounters successfully");
			}
			else {
				System.out.println("Couldnot update noOfCheckInCounters");
			}
		}
		return updatedCheckInCounters;
	}
	
	@Override
	public boolean deleteTerminalById(int id) {
		boolean deletedId=false;
		System.out.println("Start of deleteTerminalById");
		int i,j;
		for(i=0,j=0;j<dtos.length;j++) {
			if(dtos[j].getId()!=id) {
				dtos[i++]=dtos[j];
				deletedId=true;
				System.out.println("deleted terminal successfully");
			}
			else {
				System.out.println("Couldnot delete terminal");
			}
		}
		dtos=Arrays.copyOf(dtos, i);
		return deletedId;	
	}
	
	@Override
	public boolean deleteTerminalByNoOfBookingCounters(int noOfBookingCounters) {
		boolean deletedTerminal=false;
		System.out.println("start of deleteTerminalByNoOfBookingCounters");
		int i,j;
		for(i=0,j=0;j<dtos.length;j++) {
			if(dtos[j].getNoOfBookingCounters()!=noOfBookingCounters) {
				dtos[i++]=dtos[j];
				deletedTerminal=true;
				System.out.println("deleted terminal successfully");
			}
			else {
				System.out.println("couldnot delete terminal");
			}
		}
		dtos=Arrays.copyOf(dtos,i);
		return deletedTerminal;
		
	}
}
