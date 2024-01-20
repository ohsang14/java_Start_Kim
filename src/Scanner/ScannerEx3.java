package Scanner;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("음식 이름을 입력해주세요: ");
        String menu = sc.nextLine();
        System.out.println("음식 가격을 입력해주세요: ");
        int price = sc.nextInt();
        System.out.println("음식 수량을 입력해주세요: ");
        int food = sc.nextInt();

        int totalPrice = price * food;

        System.out.print(menu+ " "+ food+ "개를 주문하셨습니다.");
        System.out.println(" 총 가격은 " + totalPrice+"원입니다.");

    }
}
