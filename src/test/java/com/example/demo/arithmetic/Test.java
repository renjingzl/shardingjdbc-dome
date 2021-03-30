package com.example.demo.arithmetic;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.ConcurrentReferenceHashMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author renjing
 * @Description: ${todo}
 * @date 2019/3/19上午10:55
 */
public class Test {
    public static void main(String[] args) {
        String source = "hello morning today today";
        String target = "abcc";
        System.out.println("运算后的结果：" + toStr(source));
        System.out.println("源和目标是否一致：" + target.equals(toStr(source)));


        /**
         * ConcurrentHashMap的弱一致性：https://zhuanlan.zhihu.com/p/38194318
         * 当一对key和value通过调用put方法存储到ConcurrentHashMap中，
         * 但是另外一个线程想通过该key马上调用get()方法(get方法不需要获取锁)获取的value的时候，
         * 可能获取到的是一个null。因为它必须等到释放锁之后，才会将最新的值更新到主存中
        */
        getValue();
    }

    public static String toStr(String source) {
        if(StringUtils.isBlank(source)) {
            return null;
        }
        StringBuffer sb = new StringBuffer();
        List<String> target = new ArrayList<>();
        Set<String> set = new HashSet<>();
        String[] split = source.split(" ");
        //去重并按顺序放到新list里
        for(int i = 0; i < split.length; i++) {
            if(set.add(split[i])) {
                target.add(split[i]);
            }
        }
        for(int i = 0; i < split.length; i++) {
            for(int j = 0; j < target.size(); j++) {
                if(split[i].equals(target.get(j))) {
                    //原字符串在新字符串中的位置
                    sb.append((char)(97 + j));
                }
            }
        }
        return sb.toString();
    }






    static ConcurrentReferenceHashMap<String, Integer[]> map = new ConcurrentReferenceHashMap<>(2,ConcurrentReferenceHashMap.ReferenceType.SOFT);

    public static Integer getValue() {

        new Thread(new Runnable() {
            @Override
            public void run() {
                map.put("aa", new Integer[]{Integer.valueOf("12")});
                System.out.println(Thread.currentThread().getName() + ":"  + map.get("aa")[0]);
            }
        }).start();

        //这里要暂停一会儿mian线程才能获取到值
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + ":" + map.get("aa")[0]);
        return map.get("aa")[0];
    }
}
