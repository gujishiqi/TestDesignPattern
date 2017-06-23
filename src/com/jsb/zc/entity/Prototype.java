package com.jsb.zc.entity;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Prototype implements Cloneable,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3977944761502564683L;
	private String name;
	private Instance instance;
	public Prototype(String name, Instance instance) {
		super();
		this.name = name;
		this.instance = instance;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Instance getInstance() {
		return instance;
	}
	public void setInstance(Instance instance) {
		this.instance = instance;
	}
	
	public Prototype cloneInstance(){
		Prototype prototype = null;
		try {
			prototype = (Prototype)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prototype;
	}
	
	public Object deepClone() throws IOException, ClassNotFoundException{  
		  
        /* 写入当前对象的二进制流 */  
        ByteArrayOutputStream bos = new ByteArrayOutputStream();  
        ObjectOutputStream oos = new ObjectOutputStream(bos);  
        oos.writeObject(this);  
  
        /* 读出二进制流产生的新对象 */  
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());  
        ObjectInputStream ois = new ObjectInputStream(bis);  
        return ois.readObject();  
    }  
	
}
