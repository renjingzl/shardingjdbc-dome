package com.example.demo;

import org.apache.commons.lang3.StringUtils;

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
        String target = "abcba";
        System.out.println("运算后的结果：" + toStr(source));
        System.out.println("源和目标是否一致：" + target.equals(toStr(source)));
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
}
