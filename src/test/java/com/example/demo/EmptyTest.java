package com.example.demo;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EmptyTest {
	/*
	 * 冒泡排序
	 */
	@Test
	public void test1() {
		int[] arr = new int[]{52,98,64,23,54,89,10};
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j + 1]) {
					arr[j] = arr[j] ^ arr[j + 1];
					arr[j + 1] = arr[j] ^ arr[j + 1];
					arr[j] = arr[j] ^ arr[j + 1];
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	/*
	 * 翻转字符串
	 */
	@Test
	public void test2() {
		String str = "addgfjgior";
		String sb = "";
		char[] array = str.toCharArray();
		for (int i = 0; i < array.length; i++) {
			sb = array[i] + sb;
		}
		System.out.println(sb);
	}
	
	
	
	
	/*
	 * 翻转字符串方法二
	 */
	@Test
	public void test22() {
		String str = "addgfjgkjgior";
		char[] array = str.toCharArray();
		for (int i = 0; i < array.length / 2; i++) {
			char temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}
	
	
	
	/*
	 * 翻转数组
	 */
	@Test
	public void test3() {
		int[] arr = new int[]{52,98,64,23,54,89,10};

		for (int i = 0; i < arr.length / 2; i++) {
			arr[i] = arr[i] ^ arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = arr[i] ^ arr[arr.length - 1 - i];
			arr[i] = arr[i] ^ arr[arr.length - 1 - i];
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	/*
	 * 等腰三角形
	 * 
	 * 	    	*
	 * 	   ***
	 * 	  *****
	 * 	 *******
	 * 
	 */
	@Test
	public void test4() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	
	
	/*
	 * 取位数(那拿前面的：除；拿后面的：取余)
	 */
	@Test
	public void test5() {
		int a = 598;
		int b = a / 100; 
		int c = a % 100 / 10; 
		int d = a % 100 % 10; 
		System.out.println(b);	//5
		System.out.println(c);	//9
		System.out.println(d);	//8
	}
	
	
	/*
	 * 质数
	 */
	@Test
	public void test6() {
		l: for (int i = 2; i <= 100; i++) {
			for (int j = 2; j < i; j++) {
				if(i % j == 0) {
					continue l;
				}
			}
			System.out.println(i);
		}
	}
	
	
	/*
	 * 九九乘法表
	 */
	@Test
	public void test7() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " * " +  j + " = " + i * j + " ");
			}
			System.out.println();
		}
		
	}
	
	
	
	/*
	 * 闰年
	 */
	@Test
	public void test8() {
		int year = 2012;
		if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println(year + "是闰年");
		}else {
			System.out.println(year + "不是闰年");
		}
	}
	
	
	
	/*
	 * 完数
	 */
	@Test
	public void test9() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j < i; j++) {
				if(i % j == 0) {
					sum += j;
				}
			}
			if(sum == i) {
				System.out.println(i);
			}
			sum = 0;
		}
	}
	
	
	
	/*
	 * 直接选择排序
	 */
	@Test
	public void test10() {
		int [] a = new int[]{45,98,-8,0,-12,90};
		
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i; j < a.length; j++) {
				if(a[i] > a[j]) {
					a[i] = a[i] ^ a[j];
					a[j] = a[i] ^ a[j];
					a[i] = a[i] ^ a[j];
				}
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	
	
	/*
	 * 文件复制
	 */
	@Test
	public void test11() {
	}
	
	
	
	/*
	 * 遍历map
	 */
	@Test
	public void test12() {
		Map<String, Object> map = new HashMap<>();
		map.put("name", "aa");
		map.put("age", 12);
		map.put("sex", "M");
		
		Set<String> keySet = map.keySet();
		for (String string : keySet) {
			System.out.println(string + "------>" + map.get(string));
		}
		System.out.println("-------------------------");
		
		Set<Entry<String,Object>> entrySet = map.entrySet();
		for (Entry<String, Object> entry : entrySet) {
			System.out.println(entry.getKey()+ "---->" + entry.getValue());
		}
		System.out.println("-------------------------");
		map.forEach((key, value) -> System.out.println(key + "----->" + value));
	}
	
	
	/*
	 * 找出数组中的两个重复数
	 */
	@Test
	public void test14() {
		String[] a = new String[] { "张三", "李四", "任静", "张三" };
		Set<String> set = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			if(!set.add(a[i])) {
				System.out.println(a[i]);
			}
		}
	}
	
	
	/*
	 * 最大公约数,最小公倍数
	 */
	@Test
	public void test15() {
		int a = 12;
		int b = 28;
		
		int max = a > b ? a : b;
		int min = (max == a) ? b : a;
		
		for (int i = min; i > 0; i--) {
			if(a % i == 0 && b % i == 0) {
				System.out.println("最大公约数：" + i);
				break;
			}
		}
		for (int i = max; i < min * max; i++) {
			if(i % a == 0 && i % b == 0) {
				System.out.println("最小公倍数：" + i);
				break;
			}
		}
	}
	
	
	/*
	 * 字符串大小写转换
	 */
	@Test
	public void test16() {
		String s1 = "fsgDaaD42Gd任静fsZ";
		char[] array = s1.toCharArray();
		for (int i = 0; i < array.length; i++) {
			if(array[i] >= 65 && array[i] <= 90) {
				array[i] += 32;
			}else if(array[i] >= 97 && array[i] <= 122) {
				array[i] -= 32;
			}else {
				array[i] = array[i];
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}
	
	
	/*
	 * 最大相同子串
	 */
	@Test
	public void test18() {
		String s1 = "abcdefghyij";
		String s2 = "34cdefghyf";
		
		String max = s1.length() > s2.length() ? s1 : s2;
		String min = (max.equals(s1)) ? s2 : s1;
		
		char[] array = min.toCharArray();
		l: for (int i = 0; i < array.length; i++) {
			for (int j = 0, k = array.length - i; k != array.length + 1; j++, k++) {
				String temp = min.substring(j, k);
				if(max.contains(temp)) {
					System.out.println(temp);
					break l;
				}
			}
		}
	}
	
	
	
	/*
	 * 斐波拉契数列：1，1，2，3，5，8....
	 */
	@Test
	public void test19() {
		int m = 24;
		int f1 = 1, f2 = 1;
		int f;
		for (int i = 0; i <= m; i++) {
			f = f2;
			f2 = f1 + f;
			f1 = f;
			System.out.println(f);
		}
	}
	
	
	/*
	 * 将两个升序数组合并
	 */
	@Test
	public void test20() {
		int[] a = new int[] { 1, 3, 5, 7, 9 };
		int[] b = new int[] { 2, 4, 6, 8, 10 };
		int[] c = new int[a.length + b.length];
		
		int i = 0, j = 0, k = 0;
		while(i < a.length && j < b.length) {
			if(a[i] < b[j]) {
				c[k] = a[i];
				i++;
			}else {
				c[k] = b[j];
				j++;
			}
			k++;
		}
		
		if(i == a.length) {
			while(j < b.length) {
				c[k++] = b[j++];
			}
		}
		if(j == b.length) {
			while(i < a.length) {
				c[k++] = a[i++];
			}
		}
		
		for (int n : c) {
			System.out.print(n + " ");
		}
	}
	
	
	
	/*
	 * 合并数组
	 */
	@Test
	public void test21() {
		int[] a = new int[] { 1, 3, 5, 7, 9 };
		int[] b = new int[] { 2, 4, 6, 8, 10 };
		
		int al = a.length;
		int bl = b.length;
		a = Arrays.copyOf(a, al+bl);
		System.arraycopy(b, 0, a, al, bl);
		
		for (int i : a) {
			System.out.println(i);
		}
	}
	
	
	/**
	 * 求对称字符串
	 */
	@Test
	public void test24() {
		String s = "cnabcffcbakydjjdgd";
//		String s = "google";
		char[] array = s.toCharArray();
		m:for (int i = 0; i < array.length; i++) {
			for (int j = 0, k = array.length - i; k != array.length + 1; j++, k++) {
				String temp = s.substring(j, k);
				char[] array2 = temp.toCharArray();
				int count = 0, start = 0, end = array2.length - 1;
			
				while(start < end) {
					if(array2[start++] == array2[end--]) {
						count++;
						if(count == array2.length / 2) {
							System.out.println(temp);
							break m;
						}
					}
				}
			}
		}
	}
	
	
	
	/**
	 *  *
		**
		***
		****
		***
		**
		*
	 */
	@Test
	public void test26() {
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	
	
	/**
	 * 将数组中任意连续的项求和的最大值，并输出新的数组。
       举例：3+6+8+2 = 19，在没有任何连续的想加大于19，所以输出 [3,6,8,2]，最大和：19 
	 */
	@Test
	public void test27() {
		int a[] = new int[] {-1,2,7,-9,3,6,8,2,-10};
		int thisMax = 0, sumMax = 0;
		for (int i = 0; i < a.length; i++) {
			thisMax += a[i];
			if(thisMax > sumMax) {
				sumMax = thisMax;
			}else {
				if(thisMax < 0) {
					thisMax = 0;
				}
			}
		}
		System.out.println(sumMax);
	}
}
