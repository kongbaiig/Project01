package com.atguigu.bean;

import com.gtguigu.Hello;

import java.util.ArrayList;

public class Cusomer {

    public static final Hello   HELLO = new Hello();
    private static final int I = 1;
    public static final String SSF = "china";





    public static void main(String[] args) {
        System.out.println("Helloword!!中文");
//        String a = new Scanner(System.in).nextLine();
//        System.out.println(a);
//        System.out.println("hello");
        System.out.println("args = [" + args + "]");
        System.out.println("Cusomer.main");
        test();

    }
    //单行注释
    public static void test(){
        System.out.println("Cusomer.test");
        int i = 10;
        int i1 = 11;
        System.out.println("i = " + i);
        System.out.println("i1 = " + i1);
        System.out.println(i);

        //模板三
        String[] arr = new String[]{"tom","liulai","lilei"};
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
        for (String s : arr) {
            System.out.println(s);
        }
        for (int k = 0; k < arr.length; k++) {
            String s = arr[k];
            System.out.println(s);
        }
        for (int ii = 0; ii < 10; ii++) {

        }
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("123");
        list2.add("hgsk");
        list2.add(1,"sjdfk");
        for (String s : list2) {
            System.out.println(s);
        }
        for (int i2 = 0; i2 < list2.size(); i2++) {
            
        }
        for (int ie = list2.size() - 1; ie >= 0; ie--) {
            
        }
    }
    public void method(){
        ArrayList<String> list = new ArrayList<>();
        list.add("123");
        list.add("hgsk");
        list.add(1,"sjdfk");
        if (list == null) {
            
        }
        if (list != null) {
            
        }
        if (list != null) {

        }
        if (list == null) {

        }
        if (list != null) {

        }
    }

    
}
