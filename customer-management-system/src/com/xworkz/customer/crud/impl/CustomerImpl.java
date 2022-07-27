package com.xworkz.customer.crud.impl;

import java.util.Arrays;

import com.xworkz.customer.crud.Customer;
import com.xworkz.customer.dto.OrderDTO;

public class CustomerImpl implements Customer {
    
	OrderDTO dtos[];
	int index;
	
	public CustomerImpl(int size) {
		dtos=new OrderDTO[size];
		System.out.println("CustomerImpl object created");
	}
	
	@Override
	public boolean createOrderDetails(OrderDTO dto) {
		System.out.println("start of createOrderDetails()");
		boolean createdOrder=false;
		if(dto!=null && dto.getName()!=null) {
			this.dtos[index++]=dto;
			createdOrder=true;
			System.out.println("Customer details added successfully");
		}
		else {
			System.out.println("Couldnot create custoemr details");
		}
		return createdOrder;
	}
	
	@Override
	public void getCustomerDetails() {
		System.out.println("created getCusomerDetails()");
		for(int i=0;i<dtos.length;i++) {
			System.out.println(dtos[i]);
		}
	}
	
	@Override
	public boolean updateCustomerAddressById(int id ,String address) {
		System.out.println("updateCustomerAddressById() started");
		boolean updatedAddress=false;
		for(int i=0;i<dtos.length;i++) {
			if(dtos[i].getId()==id) {
				dtos[i].setAddress(address);
				System.out.println("updated address succesfully");
			}
			else {
				System.out.println("couldnot update customer details ");
			}
		}
		return updatedAddress;
	}
	
	@Override
	public boolean updateCustomerContactNoByName(String name, long contactNo) {
		boolean isUpdated=false;
		System.out.println("updateCustomerContactNoByName() started");
		for(int i=0;i<dtos.length;i++) {
			if(dtos[i].getName()==name) {
				dtos[i].setContactNo(contactNo);
				isUpdated=true;
				System.out.println("updated contact no");
			}
			else {
				System.out.println("couldnot updated contact no");
			}
		}
		return isUpdated;
	}
	
	@Override
	public boolean deleteCustomerById(int id) {
		boolean isDeleted=false;
		System.out.println("deleteCustomerById() started");
		int i,j;
		for(i=0,j=0;j<dtos.length;j++) {
		   if(dtos[j].getId()!=id) {
			dtos[i++]=dtos[j];
			isDeleted=true;
			System.out.println("deleted customer details successfully");
		   }
		   else {
			   System.out.println("couldnot delete customer details");
		   }
		}
		dtos=Arrays.copyOf(dtos,i);
		return isDeleted;
	}
	
	@Override
	public boolean deleteCustomerByName(String name) {
		System.out.println("deleteCustomerByName()");
		boolean isDeleted1=false;
		int i,j;
		for(i=0,j=0;j<dtos.length;j++) {
			if(dtos[i].getName()!=name) {
				dtos[i++]=dtos[j];
				isDeleted1=true;
				System.out.println("deleted Customer by name successfully");
			}
			else {
				System.out.println("couldnot delete customer details");
			}
		}
		dtos=Arrays.copyOf(dtos, i);
		return isDeleted1;
	}
	
	@Override
	 public String getOrderNameById(int id){
		  System.out.println("Start of getOrderNameById()");
		  String orderName=null;
		  for(int i=0;i<dtos.length;i++){
			  if(dtos[i].getId()==id){
				 orderName= dtos[i].getName();
				 System.out.println(orderName);
			  }
			  else{
				  System.out.println("couldnot get names of customers ,please enter proper id");
			  }
		  }
		  return orderName;
	  }

	@Override
	  public String getOrderTypeByName(String name){
		  System.out.println("Start of getOrderNameByName()");
		  String orderType=null;
		  for(int i=0;i<dtos.length;i++){
			  if(dtos[i].getName().equals(name)){
				 orderType= dtos[i].getType();
				 System.out.println(orderType);
			  }
			  else{
				  System.out.println("couldnot get names of customers ,please enter proper id");
			  }
		  }
		  return orderType;  
	  }
	  
	@Override
	  public int[] getAllQuantities(){
		  System.out.println("Start of getAllQuantities()");
		  int i,j;
		  for(i=0,j=0;i<dtos.length;i++){
			System.out.println(dtos[i].getQuantity());
			     j++;
		  }
		  	  int[] allQuantities=new int[j];
		  for(int y=0,z=0;y<dtos.length;y++){
			  allQuantities[z++]=dtos[y].getQuantity();
			//  System.out.println(allQuantities[z]);

		  }

		  return allQuantities; 
	  }
	  
	@Override
	    public String[] getAllOrderName(){
		  System.out.println("Start of getAllOrderName()");
		  int i,j;
		  for(i=0,j=0;i<dtos.length;i++){
			System.out.println(dtos[i].getQuantity());
			     j++;
		  }
		  	  String[] getOrderNames=new String[j];
		  for(int y=0,z=0;y<dtos.length;y++){
			  getOrderNames[z++]=dtos[y].getName();
			  //System.out.println(dtos[z].getName());

		  }

		  return getOrderNames; 
	  }

	  
	}