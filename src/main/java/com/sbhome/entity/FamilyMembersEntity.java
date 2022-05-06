package com.sbhome.entity;

import lombok.Data;

@Data
public class FamilyMembersEntity {

	private String name;
	private String athar_no;
	private String sex;
	private int age;
	private String room_no;
	private String vehicle_no;
	

	public FamilyMembersEntity (String name, String athar_no, String sex, int age, String room_no, String vehicle_no) {
		super();
		this.name = name;
		this.athar_no = athar_no;
		this.sex = sex;
		this.age = age;
		this.room_no = room_no;
		this.vehicle_no = vehicle_no;
	}


}
