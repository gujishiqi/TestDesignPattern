package com.jsb.zc.impl;

import com.jsb.zc.interfaces.Observer;

public class Observer1 implements Observer {

	@Override
	public void updata() {
		// TODO Auto-generated method stub
		System.out.println("观察者1被通知");
	}

}
