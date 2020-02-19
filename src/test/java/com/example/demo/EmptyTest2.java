package com.example.demo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmptyTest2 {
	/*
	 * 冒泡排序
	 */
	@Test
	public void test1() {
		int[] arr = new int[]{52,98,64,23,54,89,10};
		
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
	}
	
	
	
	
	/*
	 * 翻转字符串方法二
	 */
	@Test
	public void test22() {
		String str = "addgfjgkjgior";
	}
	
	
	
	/*
	 * 翻转数组
	 */
	@Test
	public void test3() {
		int[] arr = new int[]{52,98,64,23,54,89,10};
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
	}
	
	
	/*
	 * 九九乘法表
	 */
	@Test
	public void test7() {
	}
	
	
	
	/*
	 * 闰年
	 */
	@Test
	public void test8() {
		int year = 2012;
		if(year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
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
	}
	
	
	
	/*
	 * 直接选择排序
	 */
	@Test
	public void test10() {
		int [] a = new int[]{45,98,-8,0,-12,90};
		
		
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
		
	}
	
	
	/*
	 * 找出数组中的两个重复数
	 */
	@Test
	public void test14() {
		
	}
	
	
	/*
	 * 最大公约数,最小公倍数
	 */
	@Test
	public void test15() {
		int a = 12;
		int b = 28;
	}
	
	
	/*
	 * 字符串大小写转换
	 */
	@Test
	public void test16() {
		String s1 = "fsgDaaD42Gd任静fsZ";
	}
	
	
	/*
	 * 最大相同子串
	 */
	@Test
	public void test18() {
		String s1 = "abcdefghyij";
		String s2 = "34cdefghyff";
	}
	
	
	
	/*
	 * 斐波拉契数列：1，1，2，3，5，8....
	 */
	@Test
	public void test19() {
		int m = 24;
	}
	
	
	/*
	 * 将两个升序数组合并
	 */
	@Test
	public void test20() {
		int[] a = new int[] { 1, 3, 5, 7, 9 };
		int[] b = new int[] { 2, 4, 6, 8, 10 };
	}
	
	
	
	/*
	 * 合并数组
	 */
	@Test
	public void test21() {
		int[] a = new int[] { 1, 3, 5, 7, 9 };
		int[] b = new int[] { 2, 4, 6, 8, 10 };
	}
	
	
	
	/**
	 * 求对称字符串
	 */
	@Test
	public void test25() {
		String s = "cnabcffcbakydjjdgd";
		
	}

	/**
	 * 
	 **
	 ***
	 ****
	 ***
	 **
	 *
	 */
	@Test
	public void test26() {
		
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
