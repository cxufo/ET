package com.et.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SystemTime {
	/**
	 * ��ȡ��ǰϵͳʱ��
	 * @return ����ϵͳʱ����ַ���
	 */
	public static String getSystemTime() {
		SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// �������ڸ�ʽ
		String currentTime = time.format(new Date());// new Date()Ϊ��ȡ��ǰϵͳʱ��
		return currentTime;
	}
}
