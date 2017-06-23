package com.jsb.zc.entity;

import com.jsb.zc.interfaces.Tageteable;

public class Adapter extends Source implements Tageteable {
	
	//private String name;
	@Override
	public void writeName() {
		System.out.println("write my name"+this.getName());
	}
	/*public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}*/
    
}
