package com.jsb.zc.test;

import org.junit.Test;

import com.jsb.zc.entity.Instance;
import com.jsb.zc.entity.Instance_syn;
import com.jsb.zc.factory.SendMailFactory;
import com.jsb.zc.factory.SendSmsFactory;
import com.jsb.zc.factory.SenderFactory;
import com.jsb.zc.impl.SmsSender;
import com.jsb.zc.interfaces.Sender;

public class TestFactory {

	@Test
	public void test() {
		
	}
	
	@Test
	public void testFactory(){
		Sender senderMail = SenderFactory.getMailSender();
		Sender sendersms = SenderFactory.getSmsSender();
		senderMail.send();
		sendersms.send();
	}
	
	@Test 
	public void testAbstractFactory(){
		SendSmsFactory ssf = new SendSmsFactory();
		Sender smsSender = ssf.produce();
		smsSender.send();
		SendMailFactory smf = new SendMailFactory();
		Sender mailSender = smf.produce();
		mailSender.send();
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
	@Test
	public void testBulder(){
		
	}

}
