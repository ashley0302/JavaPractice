package org.dimigo.oop;

import java.util.Random;
import java.util.Scanner;

public class Qustion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random =  new Random();
        String[] answers ={"블랙핑크","하정우","자료구조"};
        String[] str  = {"가장좋아하는 가수는?","가장 좋아하는 배우는?","가장 좋아하는 과목은?"};
        int answer = 0;
        while(answer!=9) {
            System.out.println("------------------------");
            System.out.println("1.질문선택");
            System.out.println("2.정답 공개");
            System.out.println("9.프로그램 종료");
            System.out.println("------------------------");
            System.out.print("메뉴선택 => ");
            answer= scanner.nextInt();
            if (answer == 1) {
                int check = random.nextInt(3);
                System.out.print(str[check]);
                if(scanner.next().equals(answers[check])){
                    System.out.println("정답입니다!");
                }
                else{
                    System.out.println("틀렸습니다!");
                }
            } else if (answer == 2) {
                StringBuilder question = new StringBuilder();
                for(int i=0;i<3;i++){
                    question.append(str[i]).append(answers[i]).append("입니다.\n");
                }
                System.out.println(question);
            }
            else{
                System.out.println("없는 메뉴입니다");
            }

        }
        System.out.println("종료");


    }
}
