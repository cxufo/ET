package com.et.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SystemTime {
	/**
	 * 获取当前系统时间
	 * @return 返回系统时间的字符串
	 */
	public static String getSystemTime() {
		SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
		String currentTime = time.format(new Date());// new Date()为获取当前系统时间
		return currentTime;
	}
}
