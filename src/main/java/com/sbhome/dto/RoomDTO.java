package com.sbhome.dto;

import java.util.List;

import lombok.Data;

@Data
public class RoomDTO {
	
	private String roomNo;
	private String floorNo;
	private String roomSize;
	
	private List<FamilyMembersDTO> familyMembers;

	public RoomDTO(String roomNo, String floorNo, String roomSize, List<FamilyMembersDTO> familyMembers) {
		super();
		this.roomNo = roomNo;
		this.floorNo = floorNo;
		this.roomSize = roomSize;
		this.familyMembers = familyMembers;
	}
	
	
	

}
