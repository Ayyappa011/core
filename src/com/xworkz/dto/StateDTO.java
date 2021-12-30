package com.xworkz.dto;

public class StateDTO {
	private int sid;
	private String cName;
	private int code;
	private String scapital;

	public StateDTO(int sid, String cName, int code, String scapital) {
		super();
		this.sid = sid;
		this.cName = cName;
		this.code = code;
		this.scapital = scapital;
	}

	public int getSid() {
		return sid;
	}

	public String getcName() {
		return cName;
	}

	public int getCode() {
		return code;
	}

	public String getScapital() {
		return scapital;
	}

}
