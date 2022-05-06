package com.sbhome.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RoomEntity {
	

	public RoomEntity(String roomNo, String floorNo, String roomSize, List<FamilyMembersEntity> familyMembersEntity) {
		super();
		this.roomNo = roomNo;
		this.floorNo = floorNo;
		this.roomSize = roomSize;
		this.familyMembersEntity = familyMembersEntity;
	}

	private String roomNo;
	private String floorNo;
	private String roomSize;
	
	private List<FamilyMembersEntity> familyMembersEntity;
	

}
