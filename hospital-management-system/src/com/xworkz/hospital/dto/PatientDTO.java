package com.xworkz.hospital.dto;

import com.xworkz.hospital.constant.Gender;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Data
@Getter
@Setter
@ToString
public class PatientDTO {

	private int id;
	private String name;
	private String address;
	private Gender gender;
	private long contactNo;
	

}
