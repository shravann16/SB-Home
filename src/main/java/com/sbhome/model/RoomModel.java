package com.sbhome.model;

import java.util.List;

import com.sbhome.dto.FamilyMembersDTO;

import lombok.Data;

@Data
public class RoomModel {
	
	public RoomModel(String roomNo, String floorNo, String roomSize, List<FamilyMembersModel> familyMembersModel) {
		super();
		this.roomNo = roomNo;
		this.floorNo = floorNo;
		this.roomSize = roomSize;
		this.familyMembersModel = familyMembersModel;
	}

	private String roomNo;
	private String floorNo;
	private String roomSize;
	
	private List<FamilyMembersModel> familyMembersModel;
	

}
