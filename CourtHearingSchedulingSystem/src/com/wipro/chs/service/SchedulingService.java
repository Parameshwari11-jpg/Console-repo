package com.wipro.chs.service;
import java.util.ArrayList;
import com.wipro.chs.entity.*;
import com.wipro.chs.util.*;
public class SchedulingService {
	private ArrayList<Case> cases;
    private ArrayList<Judge> judges;
    private ArrayList<Courtroom> rooms;
    private ArrayList<Hearing> hearings;
    private int hearingCounter = 1;
	public SchedulingService(ArrayList<Case> cases, ArrayList<Judge> judges, ArrayList<Courtroom> rooms,
			ArrayList<Hearing> hearings) {
		super();
		this.cases = cases;
		this.judges = judges;
		this.rooms = rooms;
		this.hearings = hearings;
	}
	public boolean validateCase(String caseId) throws InvalidCaseException {
        for (Case c:cases) {
            if (c.getCaseId().equals(caseId)) {
                return true;
            }
        }
        throw new InvalidCaseException();
    }
	public boolean checkJudgeAvailability(String judgeId,String date,String timeSlot)throws JudgeUnavailableException {
        for (Hearing h:hearings) {
            if (h.getJudgeId().equals(judgeId) && h.getDate().equals(date) && h.getTimeSlot().equals(timeSlot)) {
                throw new JudgeUnavailableException();
            }
        }
        return true;
    }
	public boolean checkRoomAvailability(String roomId,String date,String timeSlot) throws CourtroomUnavailableException {
	        for (Hearing h :hearings) {
	            if (h.getRoomId().equals(roomId) && h.getDate().equals(date) && h.getTimeSlot().equals(timeSlot)) {
	                throw new CourtroomUnavailableException();
	            }
	        }
	        return true;
	    }
	    public Hearing scheduleHearing(String caseId,String judgeId,String roomId,String date,String timeSlot) throws Exception {
	        validateCase(caseId);
	        checkJudgeAvailability(judgeId,date,timeSlot);
	        checkRoomAvailability(roomId,date,timeSlot);
	        String hearingId = "H" + hearingCounter++;
	        Hearing hearing = new Hearing(hearingId,caseId,judgeId,roomId,date,timeSlot);
	        hearings.add(hearing);
	        return hearing;
	    }
	    public void cancelHearing(String hearingId) throws HearingNotFoundException {
	        for (Hearing h:hearings) {
	            if (h.getHearingId().equals(hearingId)) {
	                hearings.remove(h);
	                return;
	            }
	        }
	        throw new HearingNotFoundException();
	    }
	    public void printCaseHearings(String caseId) {
	        for (Hearing h:hearings) {
	            if (h.getCaseId().equals(caseId)) {
	                System.out.println(h.getDate()+"|"+h.getTimeSlot()+"|Judge:"+h.getJudgeId()+"|Room:"+h.getRoomId());
	            }
	        }
	    }
	    public void printDailySchedule(String date) {
	        for (Hearing h:hearings) {
	            if (h.getDate().equals(date)) {
	                System.out.println(h.getTimeSlot() +"|Case:"+h.getCaseId()+"|Judge:"+h.getJudgeId()+"|Room:"+ h.getRoomId());
	            }
	        }
	    }
}
