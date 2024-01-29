package loop;

public class CountEx2 {
    public static void main(String[] args) {

        int count = 1;
        int num = 1;

        for (num = 1; count <= 10; num++) {
            if (num % 2 == 0) {
                System.out.println(num);
                count++;
            }
        }

        System.out.println("------");
        num = 1;
        count = 1;
        System.out.println("------");


        while (count <= 10) {
            if (num % 2 == 0) {
                System.out.println(num);
                count++;
            }
            num++;
        }

    }
}
