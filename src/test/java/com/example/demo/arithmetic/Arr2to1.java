package com.example.demo.arithmetic;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by zzxbaba on 2018/2/27.
 */
public class Arr2to1 {
    public static void main(String[] args) {
        int[] aa = new int[]{12,17,19,32,35};
        int[] bb = new int[]{12,15,19,37,45};

        Arr2to1 one = new Arr2to1();
        List<Integer> list = one.getOrderArr(aa, bb);
        list.forEach(i -> System.out.println(i));

    }

    // aa,bb 长度可能不一样
    public List<Integer> getOrderArr(int [] aa, int [] bb){
        List<Integer> list = new ArrayList<>();
        int len = aa.length < bb.length ? aa.length : bb.length;
        // 一次循环结束终生：
        int i = 0, j = 0;
        while (true){
            if(i< aa.length && j< bb.length){
                if(aa[i]>bb[j]){
                    list.add(bb[j]);
                    j++;
                }else {
                    list.add(aa[i]);
                    i++;
                }
            }else if(i == aa.length && j< bb.length){
                    list.add(bb[j]);
                    j++;
            }else if(i< aa.length && j == bb.length){
                    list.add(aa[i]);
                    i++;
            }
            if(aa.length == i && bb.length == j){
                break;
            }
        }
        return list;
    }
}
