package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int count = sc.nextInt();

        System.out.println(count + "개의 정수를 입력하세요:");

        int array[] = new int[count];

        for (int i = 0; i < count; i++) {
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

        System.out.println("가장 작은 정수: " + array[0]);
        System.out.println("가장 큰 정수: " + array[array.length-1]);


    }
}
