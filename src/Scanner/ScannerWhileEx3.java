package Scanner;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int input = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요");
        while(true){
            input = scanner.nextInt();
            if(input == -1){
                break;
            }
            sum += input;
            count++;
        }
        double avarage = (double)sum/count;
        System.out.println("입력한 숫자들의 합계:" + sum);
        System.out.println("입력한 숫자들의 평균:" + avarage);
    }
}


//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        int sum = 0;
//        int count = 0;
//        int input = 0;
//        while(true){
//            System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요");
//            input = scan.nextInt();
//            if (input == -1) {
//                break;
//            }
//            sum += input;
//            count ++;
//        }
//        double avarge = (double) sum / count;
//        System.out.println("합계" + sum);
//        System.out.println("평균" + avarge);


