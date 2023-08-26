package com.todo.app;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.PropertyException;

public class TestMarshalling {
	
	public static final String sdeNamespaceURI = "http://www.todo.app.com/sde-namespace";
	public static final String sdePrefix = "sde";

	public static void main(String[] args) throws JAXBException,PropertyException {
		HandlingMaterial hd=new HandlingMaterial();
		hd.setHandlingMaterialGrossVolume("11.1");
		hd.setHandlingMaterialGrossWeight("1.11");
		hd.setHandlingMaterialName("HM1");
		HandlingMaterial hd2=new HandlingMaterial();
		hd2.setHandlingMaterialGrossVolume("11.1");
		hd2.setHandlingMaterialGrossWeight("1.11");
		hd2.setHandlingMaterialName("HM2");
		
		List<HandlingMaterial> lst=new ArrayList<>();
		lst.add(hd);
		lst.add(hd2);
		HandlingMaterialList hdLs=new HandlingMaterialList();
		hdLs.setHandlingMaterialList(lst);
		
		
		JAXBContext context = JAXBContext.newInstance(HandlingMaterialList.class);
		Marshaller m = context.createMarshaller();
		
		 
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		m.marshal(hdLs, System.out);

	}

}
