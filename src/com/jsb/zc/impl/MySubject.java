package com.jsb.zc.impl;

import com.jsb.zc.abstractclass.AbstractSubject;

public class MySubject extends AbstractSubject {

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("updata self");
		notifyObservers();
	}

}
