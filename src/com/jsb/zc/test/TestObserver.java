package com.jsb.zc.test;

import com.jsb.zc.impl.MySubject;
import com.jsb.zc.impl.Observer1;
import com.jsb.zc.impl.Observer2;
import com.jsb.zc.interfaces.Subject;

public class TestObserver {
	public static void main(String[] args) {  
        Subject sub = new MySubject();  
        sub.add(new Observer1());  
        sub.add(new Observer2());  
        sub.operation();  
    }  
}
