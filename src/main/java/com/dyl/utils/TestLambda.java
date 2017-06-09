package com.dyl.utils;

import org.junit.Test;
import sun.jvm.hotspot.tools.SysPropsDumper;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by duyunlei on 09/06/2017.
 */
public class TestLambda {


    public static void main(String[] arg0) throws NoSuchMethodException {

    //很长一段时间里，Java程序员一直在发明不同的方式使得方法参数的名字能保留在Java字节码中，并且能够在运行时获取它们（比如，Paranamer类库）。
    // 最终，在Java 8中把这个强烈要求的功能添加到语言层面（通过反射API与Parameter.getName()方法）
    // 与字节码文件（通过新版的javac的–parameters选项）中。
//        Method method = TestLambda.class.getMethod("main", String[].class);
//        for (final Parameter parameter : method.getParameters()) {
//            System.out.println("Parameter: " + parameter.getName());
//        }
        //用逗号分隔的参数列表、–>符号与函数体三部分表示。
//        Arrays.asList("a", "b", "d").forEach(e -> System.out.println(e));
        //参数类型与参数包括在括号中的形式直接给出参数的类型：
        testLam1();
        //某些情况下lambda的函数体会更加复杂，这时可以把函数体放到在一对花括号中，就像在Java中定义普通函数一样
//        testLam2();
//   Lambda可能会返回一个值。返回值的类型也是由编译器推测出来的。如果lambda的函数体只有一行的话，那么没有必要显式使用return语句。下面两个代码片段是等价的
//        testLam3();
        //函数式编程
//        testStream1();
    }


    public static void testLam1() {

        Arrays.asList("a", "b", "d").forEach((String e) -> System.out.println(e));

    }

    public static void testLam2() {

        Arrays.asList("a", "b", "d").forEach((String e) -> System.out.println(e));

    }

    public static void testLam3() {
        List list = new ArrayList();

        Arrays.asList("a", "b", "d").sort((e1, e2) -> e1.compareTo(e2));

        list.forEach(e -> System.out.println(e));

        Arrays.asList("a", "b", "d", "e", "f").sort((e1, e2) -> {
            int result = e1.compareTo(e2);
            System.out.println(result);
            return result;
        });

    }

    public static void testStream1(){

        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");
        stringCollection
                .stream()
                .filter((s) -> s.endsWith("2"))
                .forEach(System.out::println);
    }

}
