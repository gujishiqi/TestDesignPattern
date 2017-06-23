package com.jsb.zc.entity;

import java.io.Serializable;

public class Instance implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3408911355568394733L;
	private String name = "sdfsd";
	 /* 私有构造方法，防止被实例化 */  
    public Instance() {  
    }  
    
    public Instance(String name) {
		super();
		this.name = name;
	}

	/* 此处使用一个内部类来维护单例 */  
    private static class SingletonFactory {  
        private static Instance instance = new Instance();  
    }  
  
    /* 获取实例 */  
    public static Instance getInstance() {  
        return SingletonFactory.instance;  
    }  
  
    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */  
    public Object readResolve() {  
        return getInstance();  
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}  
    
}
