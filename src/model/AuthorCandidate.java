package model;

import java.util.ArrayList;
import java.util.Calendar;

public class AuthorCandidate {
	private String eventId;//イベントID
	private ArrayList<Calendar> autherCandidate;//候補日
	private ArrayList<String> autherCandidateRemark;//候補日に付随する備考

	//--------------------Constructor-----------------------
	public AuthorCandidate(String eventId, ArrayList<Calendar> autherCandidate,
			ArrayList<String> autherCandidateRemark) {
		this.eventId = eventId;
		this.autherCandidate = autherCandidate;
		this.autherCandidateRemark = autherCandidateRemark;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public ArrayList<Calendar> getAutherCandidate() {
		return autherCandidate;
	}

	public void setAutherCandidate(ArrayList<Calendar> autherCandidate) {
		this.autherCandidate = autherCandidate;
	}

	public ArrayList<String> getAutherCandidateRemark() {
		return autherCandidateRemark;
	}

	public void setAutherCandidateRemark(ArrayList<String> autherCandidateRemark) {
		this.autherCandidateRemark = autherCandidateRemark;
	}







}