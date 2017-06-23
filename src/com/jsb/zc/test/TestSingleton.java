package com.jsb.zc.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jsb.zc.entity.Instance;
import com.jsb.zc.entity.Instance_syn;

public class TestSingleton {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	public void testSingleton(){
		System.out.println("before");
		Instance instance1 = new Instance();
		Instance instance2 =  new Instance();
		Instance instance3 =  new Instance();
		Instance instance4 = Instance.getInstance();
		Instance instance5 = Instance.getInstance();
		Instance instance6 = Instance.getInstance();
		System.out.println(instance1.toString());
		System.out.println(instance2.toString());
		System.out.println(instance3.toString());
		System.out.println("after");
		System.out.println(instance4.toString());
		System.out.println(instance5.toString());
		System.out.println(instance6.toString());
	}
	
	@Test
	public void testSingletonsyn(){
		Instance_syn instance1 = Instance_syn.getInstance();
		Instance_syn instance2 = Instance_syn.getInstance();
		Instance_syn instance3 = Instance_syn.getInstance();
		System.out.println(instance1.toString());
		System.out.println(instance2.toString());
		System.out.println(instance3.toString());
	}
}
