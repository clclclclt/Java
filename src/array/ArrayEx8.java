package array;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        System.out.print("학생수를 입력하세요:");
        int count = sc.nextInt();
        double[][] array = new double[count][count];

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");

            System.out.print("국어 점수:");
            array[i][0] += sc.nextInt();
            System.out.print("영어 점수:");
            array[i][0] += sc.nextInt();
            System.out.print("수학 점수:");
            array[i][0] += sc.nextInt();

            array[i][1] = (double) array[i][0] / 3;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + "번 학생의 총점: " + array[i][0] + ", 평균: " + array[i][1]);
        }

    }
}
