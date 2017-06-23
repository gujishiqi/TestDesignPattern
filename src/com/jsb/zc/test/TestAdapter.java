package com.jsb.zc.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jsb.zc.entity.Adapter;
import com.jsb.zc.entity.Adapter_method;
import com.jsb.zc.entity.Adapter_sub1;
import com.jsb.zc.entity.Adepater_sub2;
import com.jsb.zc.entity.Source;
import com.jsb.zc.interfaces.Tageteable;

public class TestAdapter {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	public void testAdapter(){
		Tageteable adapter = new Adapter();
		adapter.setName("zc");
		adapter.printName();
		adapter.writeName();
		
		System.out.println("==========================");
		Source source = new Source();
		Tageteable adapter_m = new Adapter_method(source);
		adapter_m.setName("zcd");
		adapter_m.printName();
		adapter_m.writeName();
		
		System.out.println("==========================");
		Tageteable adapter_su1 = new Adapter_sub1();
		Tageteable adapter_su2 = new Adepater_sub2();
		adapter_su1.printName();
		adapter_su1.writeName();
		adapter_su2.printName();
		adapter_su2.writeName();
		
		
	}

}
