package week1.student;

import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) {

        int num = 0;
        Scanner scanner = new Scanner(System.in);
        while(true) {

            System.out.println("저장할 아기사자 수를 5 이상 입력해주세요.");

            num = scanner.nextInt();
            scanner.nextLine();

            if( num <5) {
                System.out.println("[오류] 5 이상 입력해주세요.");
            } else {
                String[] lionName = new String[num];

                System.out.println("아기사자 이름을 입력해주세요");
                for (int i = 0; i<num; i++) {

                    lionName[i] = scanner.nextLine();

                }

                System.out.println("아기사자 명단을 최종적으로 출력합니다.");
                for (int i = 0; i<num; i++) {

                    System.out.println((i+1) +". " + lionName[i]);

                }
                System.out.println("==============================");
                System.out.println("프로그램을 종료하려면 'exit'를 입력하세요.");
                System.out.println("계속 아기사자를 등록하려면 'restart'를 입력하세요.");
                String check = scanner.nextLine();
                if(check.equals("exit")) {
                    System.out.println("아기사자 명단 프로그램을 종료합니다.");
                    break;
                } else if(check.equals("restart")) {
                    continue;
                }

            }

        }

    }
}
