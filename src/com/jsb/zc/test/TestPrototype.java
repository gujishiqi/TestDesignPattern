package com.jsb.zc.test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.jsb.zc.entity.Instance;
import com.jsb.zc.entity.Prototype;

public class TestPrototype {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	public void testProtype(){
		//ǳ����    20/23�������hash������ͬ
		Instance ins = new Instance("ssss");
		System.out.println(ins.toString());
		Prototype pro = new Prototype("ertert", ins);
		Prototype cloneInstance = pro.cloneInstance();
		System.out.println(cloneInstance.getInstance().toString());
		
		//��� 22/29���hash���в�һ��  �Զ��������Ҳ���˿���
		try {
			Prototype deepClone = (Prototype) pro.deepClone();
			System.out.println(deepClone.getInstance().toString());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
