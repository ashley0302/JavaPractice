package org.dimigo.oop;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car1.setCompany("현대자동차");
        car2.setCompany("기아자동차");
        car3.setCompany("삼성자동차");

        car1.setModel("제네시스");
        car2.setModel("K7");
        car3.setModel("SM7");

        car1.setColor("검정색");
        car2.setColor("흰색");
        car3.setColor("회색");

        car1.setMaxSpeed(225);
        car2.setMaxSpeed(246);
        car3.setMaxSpeed(0);

        car1.setPrice(50000000);
        car2.setPrice(0);
        car2.setPrice(0);

        System.out.println("<<자동차 목록>>");
        System.out.println("제조사명 : " + car1.getCompany());
        System.out.println("모델명 : " + car1.getModel());
        System.out.println("최대속도 : "+car1.getMaxSpeed()+"km");
        System.out.println("색상 : " + car1.getColor());
        System.out.printf("가격 : %,d\n\n원",car1.getPrice());

        System.out.println("제조사명 : " + car2.getCompany());
        System.out.println("모델명 : " + car2.getModel());
        System.out.println("색상 : " + car2.getColor());
        System.out.printf("가격 : %,d\n\n원",car2.getPrice());

        System.out.println("제조사명 : " + car3.getCompany());
        System.out.println("모델명 : " + car3.getModel());
        System.out.println("색상 : " + car3.getColor());
        System.out.printf("가격 : %,d\n\n원",car3.getPrice());



    }
}
