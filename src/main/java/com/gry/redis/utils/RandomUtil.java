package com.gry.redis.utils;

import java.util.Date;
import java.util.Random;

public class RandomUtil {

	/**
	 * 生成指定长度的字符串
	 *
	 * @param length
	 * @return
	 */
	public static String getRandomString(int length) {
		String base = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			int number = random.nextInt(base.length());
			sb.append(base.charAt(number));
		}
		return sb.toString();
	}

	public static String createSessionId() {
		return String.valueOf(new Date().getTime());
	}

	/**
	 * 生成指定范围内的整数
	 *
	 * @param min
	 * @param max
	 * @return
	 */
	public static int getRandomInt(int min, int max) {
		Random random = new Random();
		int i = random.nextInt(max) % (max - min + 1) + min;
		return i;
	}

	public static String getRandomName(String name) {
		return name + "-" + new SnowFlake(1,1).nextId() ;
	}

	/*
     * 返回长度为【strLength】的随机数，在前面补0
     */
	public static String getFixLenthString(int strLength) {

		Random rm = new Random();

		// 获得随机数
		double pross = (1 + rm.nextDouble()) * Math.pow(10, strLength);

		// 将获得的获得随机数转化为字符串
		String fixLenthString = String.valueOf(pross);

		// 返回固定的长度的随机数
		return fixLenthString.substring(1, strLength + 1);
	}

}
