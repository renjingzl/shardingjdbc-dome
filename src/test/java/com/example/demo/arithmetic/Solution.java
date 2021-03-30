package com.example.demo.arithmetic;

public class Solution {
	
	public static void main(String[] args) {
		String string = Solution.toCamelCase("the-Stealth-Warrior");
		System.out.println(string);
	}

	static String toCamelCase(String s) {
		StringBuffer sb = new StringBuffer();
		if (s == null || s == "") {
			return "";
		} else {
			String[] arr = s.split("-");
			sb.append(arr[0]);
			for (int i = 1; i < arr.length; i++) {
				String str = Solution.upperCaseFirstLatter2(arr[i]);
				sb.append(str);
			}
			return sb.toString();
		}
	}

	public static String upperCaseFirstLatter(String str) {
		char[] strChar = str.toCharArray();
		strChar[0] += 32;
		return String.valueOf(strChar);
	}
	
	public static String upperCaseFirstLatter2(String str) {
		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}

}
