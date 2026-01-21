package com.wipro.chs.entity;

public class Courtroom {
	private String roomId ;
	private int capacity;
	public Courtroom(String roomId, int capacity) {
		super();
		this.roomId = roomId;
		this.capacity = capacity;
	}
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
}
