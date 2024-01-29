package loop;

public class PyramidEx {
    public static void main(String[] args) {

        int rows = 5;

        for(int i=1; i<=rows; i++){

            for(int k=0; k<i; k++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
