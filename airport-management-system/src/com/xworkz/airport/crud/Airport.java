package com.xworkz.airport.crud;

import com.xworkz.airport.dto.TerminalDTO;

public interface Airport {

	boolean createTerminalDetails(TerminalDTO dto);
	void getTerminalDetails();
	boolean updateNoOfBookingCountersById(int id,int noOfBookingCounters) ;
	boolean updateNoOfCheckInCountersById(int id,int noOfCheckInCounters);
	boolean deleteTerminalById(int id);
	boolean deleteTerminalByNoOfBookingCounters(int noOfBookingCounters);
}
