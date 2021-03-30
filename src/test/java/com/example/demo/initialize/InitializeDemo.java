package com.example.demo.initialize;


/**
 * https://www.jianshu.com/p/17876de3516d
 * 1、静态属性和静态代码块都是在类加载的时候初始化和执行，两者的优先级别是一致的，且高于非静态成员，执行按照编码顺序。
 * 2、非静态属性和匿名构造器在所有的构造方法之前执行，两者的优先级别一致，执行按照编码顺序。
 * 3、以上执行完毕后执行构造方法中的代码。
 */
public class InitializeDemo {
    private static int k = 1;
    private static InitializeDemo t1 = new InitializeDemo("t1");
    private static InitializeDemo t2 = new InitializeDemo("t2");
    private static int i = print("i");
    private static int n = 99;
    static {
        print("静态块");
    }
    private int j = print("j");
    {
        print("构造块");
    }
    public InitializeDemo(String str) {
        System.out.println((k++) + ":" + str + "   i=" + i + "    n=" + n);
        ++i;
        ++n;
    }
    public static int print(String str) {
        System.out.println((k++) + ":" + str + "   i=" + i + "    n=" + n);
        ++n;
        return ++i;
    }
    public static void main(String args[]) {
        new InitializeDemo("init");
    }
	
}
