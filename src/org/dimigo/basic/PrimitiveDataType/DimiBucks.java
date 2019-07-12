package org.dimigo.basic.PrimitiveDataType;

public class DimiBucks {
    public static void main(String[] args) {
        int money =1700000;
        int member = 3;
        int store =1500;
        long sum = ((long)money * member * store *12);
        System.out.println("<<디미벅스 연간 인건비>");
        System.out.println("월 평균 급여 : " +String.format("%,d",money)+"원");
        System.out.println("점포 내 직원 수 : " +String.format("%,d",member)+"명");
        System.out.println("점포 수 : " +String.format("%,d",store)+"개");
        System.out.println("연간 인건비 : "+ String.format("%,d",sum) + "원");

    }
}
