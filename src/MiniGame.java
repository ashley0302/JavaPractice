import java.util.Scanner;
import java.util.Random;
public class MiniGame {
    public static void main(String[] args) {

        String[] cha ={"마법사","영주","기사","농민"};
        int[] att ={100,100,100,100};
        int menu = 0;
        int index=1;
        do {
        Scanner scanner = new Scanner(System.in);


        System.out.print("메뉴 선택 => ");
        menu = scanner.nextInt();
        switch(menu) {

            case 1:

                index++;
                System.out.printf("%s(으)로 설정되었습니다.\n", cha[index]);
                break;
            case 2:
                att[index] += 10;
                System.out.printf("%s공격력이 증가되었습니다. 현재 공격력 : %d\n", cha[index], att[index]);
                break;
            case 3:
                att[index] -= 10;
                System.out.printf("%s공격력이 감소되었습니다. 현재 공격력 : %d\n", cha[index], att[index]);
                break;
            case 9:
                System.out.println("끝\n");
        }
        }while(menu!=9);
    }
}
