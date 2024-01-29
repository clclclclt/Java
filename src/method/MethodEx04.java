package method;

import java.util.Scanner;

public class MethodEx04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalPrice = 0;

        while (true) {
            System.out.println("---------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("---------------------------------");

            System.out.print("선택: ");
            int number = sc.nextInt();

            if (number == 1) {
                System.out.print("입금액을 입력하세요: ");

                totalPrice = deposit(sc.nextInt(), totalPrice);

            } else if (number == 2) {
                System.out.print("출금액을 입력하세요: ");

                totalPrice = withdraw(sc.nextInt(), totalPrice);

            } else if (number == 3) {
                System.out.println("현재 잔액: " + totalPrice + "원");
            } else if (number == 4) {
                System.out.println("시스템을 종료합니다");
                break;
            } else {
                System.out.println("잘못된 요청");
            }


        }

    }

    static int deposit(int money, int totalPrice) {
        totalPrice += money;

        System.out.println(money + "원을 입금하였습니다. 현재 잔액: " + totalPrice);

        return totalPrice;
    }

    static int withdraw(int money, int totalPrice) {

        if (totalPrice > money) {
            totalPrice -= money;
            System.out.println(money + "원을 출금하였습니다. 현재 잔액: " + totalPrice);

        } else {
            System.out.println(money + "원을 출금하려 했으나 잔액이 부족합니다.");
        }

        return totalPrice;
    }
}
