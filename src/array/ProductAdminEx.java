package array;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] productsNames = new String[10];
        int[] productsPrices = new int[10];
        int productCount = 0;

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요:");
            int select = sc.nextInt();

            if (select == 1) {

                if(productCount >= 10){
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                } else {
                    System.out.print("상품 이름을 입력하세요:");
                    productsNames[productCount] = sc.next();

                    System.out.print("상품 가격을 입력하세요:");
                    productsPrices[productCount] = sc.nextInt();

                    productCount++;
                }


            }

            if (select == 2) {

                if(productCount == 0 ){
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }

                for (int i = 0; i < productCount; i++) {
                    System.out.println(productsNames[i] + ": " + productsPrices[i] + "원");
                }
            }

            if(select == 3){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

        }

    }
}
