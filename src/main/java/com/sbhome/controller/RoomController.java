package com.sbhome.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbhome.dto.RoomDTO;
import com.sbhome.entity.RoomEntity;
import com.sbhome.model.RoomModel;
import com.sbhome.service.RoomService;

@RestController
@RequestMapping("/room")
public class RoomController {

	@Autowired
	RoomService roomService;
	
//	@Autowired
//	private ModelMapper modelMapper;

	@GetMapping( 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<RoomEntity> getRooms() {
		List<RoomEntity> roomEntity = roomService.getRooms();
//		List<RoomDTO> roomDTO =(List<RoomDTO>) modelMapper.map(roomModels,RoomDTO.class);
		return roomEntity;
	} 

	@PostMapping
	public String CreateRoom() {
		return "Create Room";
	}

	@PutMapping
	public String updateRoom() {
		return "Update Room";
	}

	@DeleteMapping
	public String deleteRoom() {
		return "Delete Room";
	}

}
