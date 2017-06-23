package com.jsb.zc.factory;

import com.jsb.zc.impl.MailSender;
import com.jsb.zc.impl.SmsSender;
import com.jsb.zc.interfaces.Sender;

public class SenderFactory {
	public static Sender getSmsSender(){
			return new SmsSender();
	}
	
	public static Sender getMailSender(){
		return new MailSender();
	}
}
