package main;

import java.util.Random;
import java.util.Scanner;

public class StartMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int trap = 0;
        while(true) {
            System.out.println("1. 함정 설치");
            System.out.println("2. 항복");

            System.out.print("선택: ");
            int userInput = sc.nextInt();

            if (userInput == 1) {
                System.out.println("함정을 설치했습니다.");
                trap = new Random().nextInt(10);
                int right = new Random().nextInt(10);
                if (trap == right) {
                    System.out.println("함정이 간파당했습니다. 게임을 종료합니다.");
                    break;
                } else {
                    System.out.println("함정에 걸려 도둑이 다시 집 앞으로 쫓겨났습니다.");
                    continue;
                }

            } else if (userInput == 2) {
                System.out.println("게임이 끝났습니다.");
                break;
            }
        }
    }
}
