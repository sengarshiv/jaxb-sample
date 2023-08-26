package com.todo.app;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="HandlingMaterial")
public class HandlingMaterial {

	String HandlingMaterialName;
	String HandlingMaterialGrossWeight;
	String HandlingMaterialGrossVolume;
	
	@XmlElement(name = "HandlingMaterialName",namespace="http://www.app.todo.com/sde-ns")
	public String getHandlingMaterialName() {
		return HandlingMaterialName;
	}
	public void setHandlingMaterialName(String handlingMaterialName) {
		this.HandlingMaterialName = handlingMaterialName;
	}
	@XmlElement(name = "HandlingMaterialGrossWeight",namespace="http://www.app.todo.com/sde-ns")
	public String getHandlingMaterialGrossWeight() {
		return HandlingMaterialGrossWeight;
	}
	public void setHandlingMaterialGrossWeight(String handlingMaterialGrossWeight) {
		this.HandlingMaterialGrossWeight = handlingMaterialGrossWeight;
	}
	
	@XmlElement(name = "HandlingMaterialGrossVolume",namespace="http://www.app.todo.com/sde-ns")
	public String getHandlingMaterialGrossVolume() {
		return HandlingMaterialGrossVolume;
	}
	public void setHandlingMaterialGrossVolume(String handlingMaterialGrossVolume) {
		this.HandlingMaterialGrossVolume = handlingMaterialGrossVolume;
	}
	
	

}
