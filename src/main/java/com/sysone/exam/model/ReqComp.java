package com.sysone.exam.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class ReqComp {
	
	@NotNull
	@Pattern(regexp="^[A-Za-z]*$", message="Solo se permiten letras")
	private String uncompressedString;
	
	
	public String getUncompressedString() {
		return uncompressedString;
	}
	public void setUncompressedString(String uncompressedString) {
		this.uncompressedString = uncompressedString;
	}
}
