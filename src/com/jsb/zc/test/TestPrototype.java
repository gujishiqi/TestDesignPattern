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
		//浅拷贝    20/23输出对象hash序列相同
		Instance ins = new Instance("ssss");
		System.out.println(ins.toString());
		Prototype pro = new Prototype("ertert", ins);
		Prototype cloneInstance = pro.cloneInstance();
		System.out.println(cloneInstance.getInstance().toString());
		
		//深拷贝 22/29输出hash序列不一样  对对象的引用也做了拷贝
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
