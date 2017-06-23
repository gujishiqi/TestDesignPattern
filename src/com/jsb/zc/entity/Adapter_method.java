package com.jsb.zc.entity;

import com.jsb.zc.interfaces.Tageteable;

public class Adapter_method implements Tageteable {
	
	private Source source;
	
	
	public Adapter_method(Source source) {
		super();
		this.source = source;
	}

	@Override
	public void printName() {
		// TODO Auto-generated method stub
		source.printName();
	}

	@Override
	public void writeName() {
		// TODO Auto-generated method stub
		System.out.println("write name is"+source.getName());
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		source.setName(name);
	}

	public Source getSource() {
		return source;
	}

	public void setSource(Source source) {
		this.source = source;
	}

}
