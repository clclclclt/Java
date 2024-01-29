package method;

public class MethodEx01 {
    public static void main(String[] args) {

        calculator(1,2,3);
        calculator(15,25,35);

    }

    static void calculator(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        double average = sum / 3;
        System.out.println("평균값: "+average);
    }

}
