package com.gtguigu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 * @author shkstart
 * @create 2020-02-17 10:59
 * @date 2020/2/17-10:59
 */
public class Hello {
    private static final String ADA = "askjdfl";
    public static void main(String[] args) {
        //region Description
        gjksl();
//        method12();
        //endregion
    }

    private static void gjksl() {
        Date date = new Date();
        new String();
        ArrayList<String> list1 = new ArrayList<>(10);
        list1.add(0,"a");
        list1.add(1,"a");
        list1.add("a");
        System.out.println(Arrays.toString(list1.toArray()));
        System.out.println(list1.toString());
        if (list1 != null) {

        }
    }

    public static void method12(){
        int num = 1;
            try {
            FileInputStream fileInputStream = new FileInputStream("Hello");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
