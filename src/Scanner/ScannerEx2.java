package Scanner;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("하나의 정수를 입력하세요: ");
        int number = sc.nextInt();
        if (number % 2 == 0){
            System.out.println("이것은 짝수다");
        }else {
            System.out.println("이것은 홀수욥!!");
        }
    }
}
