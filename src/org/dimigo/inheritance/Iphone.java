package org.dimigo.inheritance;

public class Iphone extends Smartphone{
    public Iphone() {
    }

    public Iphone(String model, String company, int price) {
        super(model, company, price);
    }
    public void pay(){
        System.out.println("애플페이로 결제합니다.");
    }

    public void useAirDrop(){
        System.out.println("AirDrop 기능을 사용합니다.");
    }
}
