package com.wipro.chs.entity;

public class Hearing {
	private String hearingId;
    private String caseId;
    private String judgeId;
    private String roomId;
    private String date;
    private String timeSlot;
    public Hearing(String hearingId, String caseId, String judgeId, String roomId, String date, String timeSlot) {
		super();
		this.hearingId = hearingId;
		this.caseId = caseId;
		this.judgeId = judgeId;
		this.roomId = roomId;
		this.date = date;
		this.timeSlot = timeSlot;
	}
	public String getHearingId() {
		return hearingId;
	}
	public void setHearingId(String hearingId) {
		this.hearingId = hearingId;
	}
	public String getCaseId() {
		return caseId;
	}
	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}
	public String getJudgeId() {
		return judgeId;
	}
	public void setJudgeId(String judgeId) {
		this.judgeId = judgeId;
	}
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTimeSlot() {
		return timeSlot;
	}
	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}
}
