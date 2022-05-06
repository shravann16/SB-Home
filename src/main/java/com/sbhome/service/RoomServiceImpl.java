package com.sbhome.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbhome.entity.RoomEntity;
import com.sbhome.model.RoomModel;
import com.sbhome.repository.RoomRepository;

@Service
public class RoomServiceImpl implements RoomService{

	@Autowired
	RoomRepository  roomRepository;
//	@Autowired
//	private ModelMapper modelMapper;
	
	@Override
	public List<RoomEntity> getRooms() {
		List<RoomEntity> roomEntity = roomRepository.getRooms();
//		List<RoomModel> roomModels =(List<RoomModel>) modelMapper.map(roomEntity,RoomModel.class);
		return roomEntity;
		
	}

}
