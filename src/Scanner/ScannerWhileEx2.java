package Scanner;

import java.util.Scanner;

public class ScannerWhileEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("상품의 가격을 입력하세요 (-1을 입력하면 종료): ");
            int price = sc.nextInt();

            if (price == -1) {
                System.out.println("프로그램을 종료합니다");
                break;
            }
            System.out.println("구매수량 입력: ");
            int quantity = sc.nextInt();

            int totalCost = price * quantity;
            System.out.println("총 비용 " + totalCost);
        }
    }
}
