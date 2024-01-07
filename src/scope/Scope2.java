package scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10;
        for (int i = 0; i < 2; i++) {
            System.out.println("for m =" + m); // 블록 내 외부에서 접근 가능
            System.out.println("for i = "+ i); // for문 안에서 사용가능.
        }
    }
}
