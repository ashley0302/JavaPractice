package org.dimigo.basic.PrimitiveDataType;

import java.sql.SQLOutput;

public class Operator {
    public static void main(String[] args) {
        //산술 연산자
        int a = 5, b=2;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println((double)a/b);
        System.out.println(a%b);
//        System.out.println(a/0);
        int i =10;
        double d = 3.14;
        int r = (int)(i +d);
        System.out.println(r);

        short s1 =1, s2= 2;
        short r3 = (short)(s1+ s2);
        int r4 = s1 +s2;

        //Short-Circut
        boolean flag = true;
        if(flag || 10/0 ==0){
            System.out.println("OR연산");
        }
        if(!flag && 10/0 ==0){
            System.out.println("And 연산");
        }

        //문자열 연결 연산자
        String school = "디미고";
        int grade = 2;
        int ban = 6;
        String name ="손채린";
        System.out.println(grade + ban + school + name);

        // 문제? 26손채린

        System.out.println(grade + (ban+ school + name));
        System.out.println("" +grade + ban+ school + name);
    }
}
