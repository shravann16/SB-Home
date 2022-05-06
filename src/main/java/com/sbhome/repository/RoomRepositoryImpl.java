package com.sbhome.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sbhome.entity.FamilyMembersEntity;
import com.sbhome.entity.RoomEntity;

@Repository
public class RoomRepositoryImpl implements RoomRepository {

	@Override
	public List<RoomEntity> getRooms() {

		List<RoomEntity> roomEntity = Arrays.asList(
				new RoomEntity("Room No 6","3rd Floor","1 BHK",
					Arrays.asList(
					 new  FamilyMembersEntity("Shravan", "711789509691", "Male", 32, "Room No 6", "KA51 JB8727"),
					 new  FamilyMembersEntity("Bhagya", "711789509691", "Female", 22, "Room No 6", "KA51 JB8727"))));

		return roomEntity;
	}

}
