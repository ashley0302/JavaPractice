package org.dimigo.basic.PrimitiveDataType;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        //for문
        for(int i=2;i<10;i++){
            for(int j=1;j<10;j++){
                System.out.printf("%2d * %2d = %2d ",i,j,i*j);
            }
            System.out.println("");

        }

        //for-each문

        int[] arr = {1, 2, 3, 4, 5};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        for(int data: arr){
            System.out.print(data + " ");
        }

        String[] idol = {"제니","지수","로제","리사"};
        //for-each문
        for(String value: idol){
            System.out.print(value + " ");
        }

        //do ~while
        //메뉴 처리
        Scanner scanner = new Scanner(System.in);
        int menu =0;

        do{
            System.out.println("<<아이돌 선택>>");
            System.out.println("1.트와이스");
            System.out.println("2. 블랙핑크");
            System.out.println("3. 아이즈원");
            System.out.println("9. 종료");
            System.out.print("메뉴 선택 => ");


            menu = scanner.nextInt();

            switch (menu){
                case 1:
                    System.out.println("트와이스 선택");
                    break;
                case 2:
                    System.out.println("블랙핑크 선택");
                    break;
                case 3:
                    System.out.println("아이즈원 선택");
                    break;
                case 9:
                    System.out.println("ㅠㅛㄷ");
                    break;
                default:
                    System.out.println("no");
            }
        }while(menu!=9);


    }
}
