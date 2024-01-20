package Array;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        int maxProducts = 10;
        String[] productNames = new String[maxProducts];
        int [] productPrices = new int[maxProducts];
        int productCount = 0;

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1){
                if (productCount >= maxProducts){
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }
                System.out.println("상품 이름을 입력하세요: ");
                productNames[productCount] = sc.nextLine();
            }
        }




    }
}
