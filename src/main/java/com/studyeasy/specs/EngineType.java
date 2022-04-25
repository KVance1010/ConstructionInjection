package com.studyeasy.specs;

import com.studyeasy.interfaces.Engine;


public class EngineType implements Engine {

	String type;
	public EngineType() {
		type = "unkown";
	}

	public EngineType(String type) {
		this.type = type;
	}
	
	public String type() {
		return type;
	}
	

}
