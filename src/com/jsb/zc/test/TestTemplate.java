package com.jsb.zc.test;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.jsb.zc.abstractclass.AbstractCaculate;
import com.jsb.zc.impl.CaculatePlus;

public class TestTemplate {
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testTemplate(){
		String exp = "2+3";
		AbstractCaculate ca = new CaculatePlus();
		System.out.println(ca.calculate(exp, "\\+"));
	}
	
	
}
