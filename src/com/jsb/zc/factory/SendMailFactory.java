package com.jsb.zc.factory;

import com.jsb.zc.impl.MailSender;
import com.jsb.zc.interfaces.Provider;
import com.jsb.zc.interfaces.Sender;

public class SendMailFactory implements Provider {

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new MailSender();
	}

}
