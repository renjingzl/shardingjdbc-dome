package com.example.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.CopyOnWriteArrayList;

import org.junit.Test;

public class Answer {
	/*
	 * 冒泡排序
	 */
	@Test
	public void test1() {
		int[] arr = new int[] { 52, 98, 64, 23, 54, 89, 10 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	/**
	 * 二分查找
	*/
	@Test
	public void test111() {
		int[] arr = new int[] { 2, 3, 5, 10, 13, 15, 32 };
		int i = 72;
		System.out.println(get(arr, i));

	}
	public static int get(int[] arr, int key) {
		int start = 0;
		int end = arr.length - 1;
		int middel = 0;
		if(key < arr[start] || key > arr[end] || start > end) {
			return -1;
		}
		while (start <= end) {
			middel = (start + end)/2;
			if(arr[middel] < key) {
				start = middel + 1;
			}else if(arr[middel] > key) {
				end = middel - 1;
			}else {
				return arr[middel];
			}
		}
		return -1;
	}

	/*
	 * 翻转字符串
	 */
	@Test
	public void test2() {
		String str = "addgfjgior";
		String newstr = "";
		char[] a = str.toCharArray();
		for (int i = 0; i < a.length; i++) {
			newstr = a[i] + newstr;
		}
		System.out.println(newstr);
	}

	/*
	 * 翻转字符串方法二
	 */
	@Test
	public void test22() {
		String str = "addgfjgior";
		String newstr = "";
		char[] a = str.toCharArray();
		for (int i = a.length - 1; i > 0; i--) {
			newstr = newstr + a[i];
		}
		System.out.println(newstr);
	}

	/*
	 * 翻转数组
	 */
	@Test
	public void test3() {
		int[] arr = new int[] { 52, 98, 64, 23, 54, 89, 10 };
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	/*
	 * 等腰三角形
	 */
	@Test
	public void test4() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
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
		System.out.println(b); // 5
		System.out.println(c); // 9
		System.out.println(d); // 8
	}

	/*
	 * 质数
	 */
	@Test
	public void test6() {
		l: for (int i = 2; i < 100; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
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
				System.out.print(i + " * " + j + " = " + i * j + " ");
			}
			System.out.println();
		}
	}

	/*
	 * 闰年
	 */
	@Test
	public void test8() {
		Scanner s = new Scanner(System.in);
		System.out.print("请输入年份：");
		int year = s.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "是闰年");
		} else {
			System.out.println(year + "不是闰年");
		}
	}

	/*
	 * 完数
	 */
	@Test
	public void test9() {
		int sum = 0;
		for (int i = 1; i < 100; i++) {
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}
			}
			if (i == sum) {
				System.out.println(i + "是完数"); // 6,28
			}
			sum = 0;
		}
	}

	/*
	 * 直接选择排序
	 */
	@Test
	public void test10() {
		int[] a = new int[] { 45, 98, -8, 0, -12, 90 };
		for (int i = 0; i < a.length - 1; i++) {
			int min = i;
			for (int j = i; j < a.length; j++) {
				if (a[min] > a[j]) {
					min = j;
				}
			}
			if (min != i) {
				int temp = a[min];
				a[min] = a[i];
				a[i] = temp;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	/*
	 * 直接选择排序二
	 */
	@Test
	public void test11() {
		int[] a = new int[] { 45, 98, -8, 0, -12, 90 };

		for (int i = 0; i < a.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[min] < a[j]) {
					min = j;
				}
			}
			if (min != i) {
				int temp = a[i];
				a[i] = a[min];
				a[min] = temp;
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
	public void test13() {
		FileOutputStream fos = null;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("abc.txt"); // 读进来
			fos = new FileOutputStream("abc2.txt"); // 写出去
			byte[] b = new byte[30];
			int len;
			while ((len = fis.read(b)) != -1) {
				fos.write(b, 0, len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

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

		Set<Entry<String, Object>> entrySet = map.entrySet();
		for (Entry<String, Object> entry : entrySet) {
			System.out.println(entry.getKey() + "->" + entry.getValue());
		}

		System.out.println("=====================");
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println(key + " -> " + map.get(key));
		}
		System.out.println("=====================");

		map.forEach((key, value) -> System.out.println(key + "===>" + value));
	}

	/*
	 * 找出数组中的两个重复数
	 */
	@Test
	public void test14() {
		String[] a = new String[] { "张三", "李四", "任静", "张三" };
		Set<String> set = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			if (!set.add(a[i])) {
				System.out.println(a[i]);
			}
		}
	}

	/*
	 * 将数组的每个元素除第一个元素，得到的商再放回当前位置 关键：要从后开始除，如果从第一个除，除自身第一个数就变成1了，以后没个数再除1都是其本身
	 */
	@Test
	public void test15() {
		int[] a = new int[] { 5, 20, 80, 10, 50, 5 };
		for (int i = a.length - 1; i >= 0; i--) {
			a[i] = a[i] / a[0];
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	/*
	 * 字符串大小写转换
	 */
	@Test
	public void test16() {
		String str = "fsgDaaD42Gd任静fsZ";
		char[] array = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 65 && array[i] <= 90) { // 说明是大写
				int temp = array[i] + 32;
				sb.append((char) temp);
			} else if (array[i] >= 97 && array[i] <= 122) { // 说明是小写
				int temp = array[i] - 32;
				sb.append((char) temp);
			} else {
				sb.append(array[i]);
			}
		}
		System.out.println(sb);
	}

	/*
	 * 将字符串中单词位置反转
	 */
	@Test
	public void test17() {
		String s = "I am a student.";
		String[] arr = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		StringBuffer sb = new StringBuffer();
		for (int i = arr.length - 1; i >= 0; i--) {
			// System.out.print(arr[i] + " ");
			String a = arr[i];
			char[] array = a.toCharArray();
			for (int j = array.length - 1; j >= 0; j--) {
				sb.append(array[j]);
			}
			sb.append(" ");
		}
		System.out.println(sb);

		System.out.println();
		String a = "";
		for (int i = 0; i < arr.length; i++) {
			a = arr[i] + " " + a;
		}
		System.out.print(a);
	}

	/*
	 * 最大相同子串
	 */
	@Test
	public void test18() {
		String s1 = "abcdefghij";
		String s2 = "34cdefghff";
		String max = "", min = "";
		max = (s1.length() > s2.length()) ? s1 : s2;
		min = (max == s1) ? s2 : s1;

		l: for (int i = 0; i < min.length(); i++) {
			for (int j = 0, k = min.length() - i; k != min.length() + 1; j++, k++) {
				String temp = min.substring(j, k);
				// System.out.println("temp:"+temp); //每次比较的字符串
				if (max.contains(temp)) {
					System.out.println("结果为:" + temp);
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
		int M = 24;
		int f1 = 1, f2 = 1;
		int f;
		System.out.println("第1个月：" + 1);
		System.out.println("第2个月：" + 1);
		for (int i = 3; i <= M; i++) {
			f = f2;
			f2 = f1 + f2;
			f1 = f;
			System.out.println("第" + i + "个月：" + f2);
		}

		//递归：n == 1 || n == 2 , return 1;   else return f(n-1) + f(n-2);
	}

	/*
	 * 最大公约数,最小公倍数
	 */
	@Test
	public void test20() {
		int m = 12;
		int n = 28;
		int max = (m > n) ? m : n;
		int min = (m < n) ? m : n;
		// 最大公约数
		for (int i = min; i >= 1; i--) {
			if (m % i == 0 && n % i == 0) {
				System.out.println(i);
				break;
			}
		}
		// 最小公倍数
		for (int i = max; i <= m * n; i++) {
			if (i % m == 0 && i % n == 0) {
				System.out.println(i);
				break;
			}
		}
	}

	@Test
	public void name() {
		// List<Integer> list = new ArrayList<>();
		CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		// Iterator<Integer> iterator = list.iterator();
		// while(iterator.hasNext()) {
		// System.out.println(iterator.next());
		// }

		for (Integer integer : list) {
			if (integer == 2) {
				list.remove(2);
			}
		}
	}

	/*
	 * 查从100w数据最大的100条
	 */
	@Test
	public void test21() {
		int[] collection = new int[] { 5, 4, 6, 8, 10, 42, 11, 9, 32, 53, 67 };
		int top = 5;
		int[] result = new int[top];
		for (int item : collection) {
			if (item > result[0]) { // 当前值大于结果集中的最小值.
				for (int i = 0; i < top + 1; i++) { // 将当前值插入结果集
					if (i == top || item < result[i]) {
						for (int j = 0; j < i - 1; j++) { // 顺移结果集中小于当前值的值.
							result[j] = result[j + 1];
						}
						result[i - 1] = item;
						break;
					}
				}
			}
		}

		for (int i : result) {
			System.out.print(i + " ");
		}
	}

	/*
	 * 合并数组
	 */
	@Test
	public void test23() {
		int[] aa = new int[] { 12, 17, 19, 32, 35 };
		int[] bb = new int[] { 12, 15, 19, 37, 45 };

		int al = aa.length;
		int bl = bb.length;

		aa = Arrays.copyOf(aa, al + bl);
		System.arraycopy(bb, 0, aa, al, bl);

		for (int j : aa) {
			System.out.println(j);
		}
	}

	/*
	 * 将两个升序数组合并
	 */
	@Test
	public void test24() {
		int[] a = new int[] { 1, 3, 5, 7, 9 };
		int[] b = new int[] { 2, 4, 6, 8, 10 };

		int[] out = new int[a.length + b.length];

		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length) {
			if (a[i] > b[j]) {
				out[k] = b[j];
				j++;
				k++;
			} else {
				out[k] = a[i];
				i++;
				k++;
			}
		}
		if (i == a.length) {
			while (j < b.length) {
				out[k] = b[j];
				j++;
				k++;
			}
		}
		if (j == b.length) {
			while (i < a.length) {
				out[k] = a[i];
				i++;
				k++;
			}
		}

		for (int n : out) {
			System.out.println(n);
		}
	}

	/**
	 * 求对称字符串
	 */
	@Test
	public void test25() {
		String s = "cnabcffcbakydjjdgd";
		// String s = "google";
		List<String> list = new ArrayList<>();

		for (int i = 0; i < s.length(); i++) {
			for (int j = 0, k = s.length() - i; k != s.length() + 1; j++, k++) {
				String temp = s.substring(j, k);
				char[] array = temp.toCharArray();
				int start = 0, end = array.length - 1;

				int count = 0;
				while (start < end) {
					if (array[start++] == array[end--]) {
						count++;
						if (temp.length() % 2 == 0 && count == temp.length() / 2 && !list.toString().contains(temp)) {
							list.add(temp);
						}
					}
				}
			}
		}
		for (String string : list) {
			System.out.println(string);
		}
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
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	@Test
	public void test27() {
		int top = 5, k = 0;
//		int[] a = new int[] { 8, 10, 42, 11, 67};
		int[] a = new int[] { 5, 4, 6, 8, 10, 42, 11, 9, 32, 53, 67, 45 };
		int[] out = new int[top];
		
		for (int i = 0; i < a.length; i++) {
			if (k < top) {
				System.out.println("a:"+ a[i] + " ,o:" + out[0]);
				if (a[i] > out[0]) {
					out[k] = a[i];
					k++;
				}
			} else { // 移除第一个
				for (int n : out) {
					System.out.println("前："+n);
				}
				for (int j = 0; j < out.length - 1; j++) {
					out[j] = out[j + 1];
				}
				k--;
				i--;
				for (int n : out) {
					System.out.println("后："+n);
				}
			}
			System.out.println("==========k："+k);
		}

		for (int i : out) {
			System.out.println(i);
		}

	}
	
	
	/**
	 * 将数组中任意连续的项求和的最大值，并输出新的数组。
       举例：3+6+8+2 = 19，在没有任何连续的想加大于19，所以输出 [3,6,8,2]，最大和：19 
	 */
	@Test
	public void test28() {
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

	/**
	 * 找出数组中第一个不重复的数，例：[2，3，4，2，5，4，3，8]，结果：5
	 * 还可以使用冒泡排序的思想，两层循环。第一个数和后面每个数比，如果重复就跳出内循环，内循环结束了还没有重复的那结果就是这个数了
	 */
	@Test
	public void test29() {
		int a[] = new int[] {2,3,4,2,5,4,3,4,8};
		Map<Integer, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < a.length; i++) {
			Integer integer = map.putIfAbsent(a[i], 0);
//			System.out.println(a[i] + "--->" +integer);
			if(integer != null) {
				map.put(a[i], map.get(a[i]) + 1);
			}
		}
		for(Integer key : map.keySet()) {
			if(map.get(key) == 0) {
				System.out.println(key);
				break;
			}
		}
	}

	/**
	 *
	*/
	@Test
	public void test30() {
		int a[] = new int[] {2,3,4,2,5,4,3,4,8};
		Map<Integer, Integer> res = new LinkedHashMap<>();
		Map<Integer, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < a.length; i++) {
			if(!map.containsKey(a[i])) {
				if(!res.containsKey(a[i])) {
					res.put(a[i], i);
				}else  {
					res.remove(a[i]);
					map.put(a[i],i);
				}
			}
		}
		System.out.println(res.keySet().toArray()[0]);
	}

	/**
	 * 求两个已排序数组的交集
	*/
	@Test
	public void test31() {
		int a[] = new int[] {2,3,4,8,9};
		int b[] = new int[] {1,2,4,5,8};
		LinkedList<Integer> list = new LinkedList<Integer>();
		int pointerA = 0;
		int pointerB = 0;
		while (pointerA < a.length && pointerB < b.length) {
			if (a[pointerA] < b[pointerB]) {
				pointerA++;
			}else if (a[pointerA] > b[pointerB]) {
				pointerB++;
			}else {
				list.add(a[pointerA]);
				pointerA++;
				pointerB++;
			}
		}
		list.forEach((e)-> System.out.println(e));
	}


	@Test
	public void test32() {
        int[] a = new int[]{2,7,6,5,9};
        int targe = 9;
        int[] array = towSum(a, targe);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
	public static int[] towSum(int[] a, int targe) {
		Map<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			Integer needNum = targe - a[i];
			if(map.containsKey(needNum)){//map.containsKey时间复杂是O(1)
				return new int[]{map.get(needNum), i};
			}
			map.put(a[i], i);
		}
		return null;
	}

    /**
     * 返回第一个大于目标值的2的幂的数。
     * JDK1.7中ConcurrentHashMap初始化segment大小的源码
    */
    @Test
    public void test33() {
        int targe = 7;
        int a = 1;
        while (a <= targe) {
            a <<= 1;
        }
        System.out.println(a);
    }
}
