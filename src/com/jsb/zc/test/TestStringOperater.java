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
		String str = "��ʮһ����˾��һ��ɶ��������\n";
		String str1 = "һ����˾�������\n";
		System.out.println(str.indexOf("��"));
		System.out.println(str1.indexOf("��"));
		System.out.println(str.substring(str.indexOf("��")+1,str.length()));
		System.out.println(str1.substring(str1.indexOf("��")+1,str1.length()));
	}

}
