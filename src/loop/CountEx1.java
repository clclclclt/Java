package loop;

public class CountEx1 {
    public static void main(String[] args) {

        int count = 10;

        for(int i = 1; i<= count ; i++){
            System.out.println(i);
        }

        while (count != 0) {
            System.out.println(count);
            count--;
        }

    }
}
