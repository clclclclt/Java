package loop;

public class CountEx3 {
    public static void main(String[] args) {

        int sum = 0;
        int max = 100;

        for (int i = 0; i <= max; i++) {
            sum += i;
        }

        System.out.println("for max=" + sum);

        System.out.println("======");
        sum = 0;
        System.out.println("======");

        int i = 0;

        while (i <= max) {
            sum += i;
            i++;
        }

        System.out.println("while max=" + sum);

    }
}
