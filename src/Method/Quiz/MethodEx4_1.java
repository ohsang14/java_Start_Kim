package Method.Quiz;

import java.util.Scanner;

public class MethodEx4_1 {
    public static void main(String[] args) {
        int balance = 0;
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("---------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("---------------------------------");
            System.out.print("선택: ");

            int choice = sc.nextInt();
            int amount;

            switch (choice){
                case 1:
                    System.out.println("입금액을 알려주세요: ");
                    amount = sc.nextInt();
                    balance = getPay(balance,amount);
                    break;

                case 2:
                    System.out.println("얼마 뺄까요?");
                    amount = sc.nextInt();
                    balance = usePay(balance,amount);
                    break;

                case 3:
                    System.out.println("현재 잔액: "+balance+"원");
                    break;
                case 4:
                    System.out.println("시스템 종료");
                    break;

                default:
                    System.out.println("마 똑바로 말해라 개쉐이야");
            }
        }
    }

    public static int getPay(int balance, int amount){
        balance += amount;
        System.out.println(amount + "원을 입금, 현재 잔액: " + balance+ "원");
        return balance;
    }
    public static int usePay(int balance, int amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println(amount+"원을 출금, 현재 잔액: " + balance+"원");
        }else{
            System.out.println(amount+"원 출금 할려 했는데 잔액부족");
        }
        return balance;
    }
}
