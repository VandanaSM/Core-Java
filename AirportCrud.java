interface AirportCrud{

  boolean createTerminalDetails(TerminalDto dto);
  void getPassengerDetails();
  boolean updateNoOfBookingCountersById(int id,int noOfBookingCounter);
  boolean updateNoOfCheckInCountersById(int id,int noOfCheckInCounters);
  boolean deleteTerminalById(int id);
  boolean deleteTerminalByNoOfBookingCounters(int noOfBookingCounters);

}