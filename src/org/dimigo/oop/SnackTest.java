package org.dimigo.oop;

public class SnackTest {
    public static void main(String[] args) {
    Snack[] snack = new Snack[]{
            new Snack("새우깡", "농심", 1100, 2 ),
            new Snack("콘칲", "크라운", 1200, 1),
            new Snack("허니버터칲", "해태",1500, 4)
    };
    int sum = 0;
    for(Snack sb : snack){
        System.out.println(sb);
        sum+=sb.calcPrice();
    }
        System.out.println("\n총 구매 금액 : "+ String.format("%,d원",sum));



    }
}
