package com.xworkz.hospital.crud;

import com.xworkz.hospital.constant.Gender;
import com.xworkz.hospital.dto.PatientDTO;

public interface HospitalInf {
  

		 boolean createPatient(PatientDTO dto);
		 void getPatientDetails();
		 boolean updatePatientAddressById(int id,String address);
		 boolean updatePatientContactNoByName(String name,long contactNo);
		 boolean deletePatientDetailsByName(String name);
		 boolean deletePatientDetailsById(int id);
		 String getPatientNameById(int id);
		 long getPatientContactNoByName(String name);
		 boolean deletePatientByGender(Gender gender);
		 

		
}
