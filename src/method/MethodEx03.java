package method;

public class MethodEx03 {
    public static void main(String[] args) {

        int balance = 10000;

        balance = deposit(1000, balance);
        balance = withdraw(2000, balance);

        System.out.println("최종 잔액: " + balance + "원");
    }

    static int deposit(int money, int balance) {
        balance += money;

        System.out.println(money + "원을 입금하였습니다. 현재 잔액: " + balance + "원");

        return balance;
    }

    static int withdraw(int money, int balance) {

        if (balance >= money) {
            balance -= money;
            System.out.println(money + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(money + "원을 출금하려 했으나 잔액이 부족합니다.");
        }

        return balance;
    }

}
