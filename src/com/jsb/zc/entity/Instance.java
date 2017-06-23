package com.jsb.zc.entity;

import java.io.Serializable;

public class Instance implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3408911355568394733L;
	private String name = "sdfsd";
	 /* ˽�й��췽������ֹ��ʵ���� */  
    public Instance() {  
    }  
    
    public Instance(String name) {
		super();
		this.name = name;
	}

	/* �˴�ʹ��һ���ڲ�����ά������ */  
    private static class SingletonFactory {  
        private static Instance instance = new Instance();  
    }  
  
    /* ��ȡʵ�� */  
    public static Instance getInstance() {  
        return SingletonFactory.instance;  
    }  
  
    /* ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ�� */  
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
