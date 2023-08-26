package com.todo.app;

import java.util.List;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "HandlingMaterialList",namespace="http://www.app.todo.com/sde-ns")
public class HandlingMaterialList {
	
	List<HandlingMaterial> HandlingMaterialList;
	
	@XmlElement(name = "HandlingMaterial",namespace="http://www.app.todo.com/sde-ns")
	public List<HandlingMaterial> getHandlingMaterialList() {
		return HandlingMaterialList;
	}

	public void setHandlingMaterialList(List<HandlingMaterial> HandlingMaterialList) {
		this.HandlingMaterialList = HandlingMaterialList;
	}
	

}
