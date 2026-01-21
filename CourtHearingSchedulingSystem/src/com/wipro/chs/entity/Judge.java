package com.wipro.chs.entity;

public class Judge {
	private String judgeId ;
	private String judgeName;
	public Judge(String judgeId, String judgeName) {
		super();
		this.judgeId = judgeId;
		this.judgeName = judgeName;
	}
	public String getJudgeId() {
		return judgeId;
	}
	public void setJudgeId(String judgeId) {
		this.judgeId = judgeId;
	}
	public String getJudgeName() {
		return judgeName;
	}
	public void setJudgeName(String judgeName) {
		this.judgeName = judgeName;
	}
}
