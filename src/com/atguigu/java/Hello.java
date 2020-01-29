package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;

/**
 * @author admin
 * @date 2020/1/29 0029 - 11:25
 */
public class Hello {
    //main
    public static void main(String[] args) {
        System.out.println("o");

        System.out.println("o");
        String[] arr = new String[]{"apple","pear","banana","mango"};
        //for循环 fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);  //arr[i].sout
        }
        System.out.println("--------------");
        //变形iter
        for (String s : arr) {
            System.out.println(s);
        }
        System.out.println("--------------");
        //变形itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        System.out.println("--------------");
        //list.for
        ArrayList list = new ArrayList();//new ArrayList()  Alt+enter
        list.add(123);
        list.add(345);
        list.add(567);

        for (Object o : list) {
            System.out.println(o);
        }

        //list.fori，顺序
        for (int i = 0; i < list.size(); i++) {
            
        }

        //list.forr，倒序
        for (int i = list.size() - 1; i >= 0; i--) {

        }
        //ifn
        if (list == null) {

        }
        //inn
        if (list != null) {

        }
        //xxx.nn == xxx.null
        if (list != null) {

        }
        if (list == null) {

        }



    }

    //prsf
    private static final Customer cust = new Customer();
    //使用Module01中的类，需要增加依赖(增加的依赖在project01中显示) alt+enter自动补全

    //psf
    public static final int NUM = 1;
    //psfi
    public static final int NUM2 = 1;
    //psfs
    public static final String NATION = "CHINA";
    //更多模板查看File->settings->Editor->Live Templates(可修改)
    //File->settings->Editor->General->Postfix Completion(不可修改)

    //修改模板psvm->main
    //修改模板psfi
    //public static final int  = ;





    public void method(int pa){
        System.out.println("b");

        int temp = 1;
        System.out.println("temp = " + temp);//soutv   temp.out
        System.out.println("pa = [" + pa + "]");//soutp


    }

}
