package com.jsb.zc.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStringOperater {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSplitStart(){
		String str = "（十一）公司第一大股东发生变更\n";
		String str1 = "一、公司设立情况\n";
		System.out.println(str.indexOf("）"));
		System.out.println(str1.indexOf("、"));
		System.out.println(str.substring(str.indexOf("）")+1,str.length()));
		System.out.println(str1.substring(str1.indexOf("、")+1,str1.length()));
	}

}
