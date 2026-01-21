package com.wipro.chs.entity;

public class Case {
	private String caseId;
    private String caseTitle;
    private String petitioner;
    private String respondent;
	public Case(String caseId, String caseTitle, String petitioner, String respondent) {
		super();
		this.caseId = caseId;
		this.caseTitle = caseTitle;
		this.petitioner = petitioner;
		this.respondent = respondent;
	}
	public String getCaseId() {
		return caseId;
	}
	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}
	public String getCaseTitle() {
		return caseTitle;
	}
	public void setCaseTitle(String caseTitle) {
		this.caseTitle = caseTitle;
	}
	public String getPetitioner() {
		return petitioner;
	}
	public void setPetitioner(String petitioner) {
		this.petitioner = petitioner;
	}
	public String getRespondent() {
		return respondent;
	}
	public void setRespondent(String respondent) {
		this.respondent = respondent;
	}
}
