package org.dimigo.inheritance;

public class SmartphoneTest {
    public static void main(String[] args) {
        Smartphone[] phones = {
                new Iphone("iPhone Xs","애플",1370000),
                new Galaxy("갤럭시 S10","삼성",1500000)
        };

        for(Smartphone phone : phones){
            System.out.println(phone);
            phone.turnOn();
            phone.pay();
            phone.useSpecialFunction();
            phone.turnOff();
            System.out.println();
        }

    }


}
