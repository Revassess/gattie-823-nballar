package com.revature.tier1;

public class NumberSumLength {

	public static boolean checkNumberPowerLength(long num) {
		int length = String.valueOf(num).length();
		int sum = 0;
		
		String number = String.valueOf(num);
		int[] digits = new int[length];
		
		for (int i = 0; i < length; i++) {
			digits[i] = number.charAt(i) - '0';
			double power = Math.pow(digits[i], length);
			sum = (int) (sum + power);
		}
		
		if ((long)sum == num) {
			return true;
		}
		
		return false;
	}
}
