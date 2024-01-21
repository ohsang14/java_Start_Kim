package Method.Quiz;

public class MethodEx2 {
    public static void main(String[] args) {
        PrintMessage("hello world@",3);
        PrintMessage("hello world@",6);
        PrintMessage("hello world@",9);
    }
    public static void  PrintMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
