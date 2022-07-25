package com.xworkz.customer.crud;

import com.xworkz.customer.dto.OrderDTO;

public interface Customer {

	  void getCustomerDetails();
	  boolean createOrderDetails(OrderDTO dto)
	  boolean updateCustomerAddressById(int id,String address);
	  boolean updateCustomerContactNoByName(String name,long contactNo);
	  boolean deleteCustomerById(int id);
	  boolean deleteCustomerByName(String name);
	  String getOrderNameById(int id);
	  String getOrderTypeByName(String name);
	  int[] getAllQuantities();
	  String[] getAllOrderName();
}
