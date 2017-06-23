package com.jsb.zc.entity;

public class Instance_syn {
	private Instance_syn(){
		
	}
	private static Instance_syn instance = null;
	public static Instance_syn getInstance() {  
        if (instance == null) {  
            synchronized (Instance_syn.class) {  
                if (instance == null) {  
                    instance = new Instance_syn();  
                }  
            }  
        }  
        return instance;  
    }  
	
	public static void main(String[] args){
		Instance_syn instance2 = Instance_syn.getInstance();
		System.out.println(instance2.toString());
	}
}
