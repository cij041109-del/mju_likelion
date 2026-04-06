package week1.student;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainV4 {
    public static void main(String[] args) {

        int num = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {

            while (true) {
                try {
                    System.out.println("저장할 아기사자 수를 5 이상 입력해주세요.");

                    num = scanner.nextInt();
                    scanner.nextLine();

                    if (num < 5) {
                        System.out.println("[오류] 5 이상 입력해주세요.");
                    } else {
                        break;
                    }

                } catch (InputMismatchException e) {
                    System.out.println("[오류] 숫자만 입력할 수 있습니다.");
                    scanner.nextLine();
                }
            }


            String[] lionName = new String[num];

            System.out.println("아기사자 이름을 입력해주세요.");
            for (int i = 0; i < num; i++) {
                while(true) {

                   String name = scanner.nextLine();

                   if (name.isEmpty()) {

                       System.out.println("이름이 비어있습니다. 다시 입력해주세요.");
                       continue;
                   }

                    boolean found = false;
                    for (int j = 0; j < i; j++) {
                        if (lionName[j].equals(name)) {
                            found = true;
                            break;
                        }
                    }

                    if (found) {
                        System.out.println("이미 등록된 이름입니다. 다시 입력해주세요.");
                        continue;
                    }

                    lionName[i] = name;
                    break;
                }


            }


            System.out.println("아기사자 명단을 최종적으로 출력합니다.");
            for (int i = 0; i < num; i++) {
                System.out.println((i + 1) + ". " + lionName[i]);
            }

            System.out.println("==============================");

            System.out.println("프로그램을 종료하려면 'exit'를 입력하세요.");
            System.out.println("계속하려면 'restart'를 입력하세요.");

            String check = scanner.nextLine();

            if (check.equals("exit")) {
                System.out.println("프로그램 종료");
                break;
            } else if (check.equals("restart")) {
                    continue;
            }
        }


        }

    }

