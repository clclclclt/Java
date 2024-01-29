package array;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] array = new double[4][4];

        for (int i = 0; i < 4; i++) {
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
