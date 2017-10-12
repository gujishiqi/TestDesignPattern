package com.jsb.zc.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;

public class Testtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date end = new Date();
		Date begin = DateUtils.addHours(end, -1);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"); 
		String start = df.format(begin);
		String over = df.format(end);
		System.out.println(start);
		System.out.println(over);
	}

}
