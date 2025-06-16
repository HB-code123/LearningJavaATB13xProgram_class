package ex_01_Java_Basic;

public class increment {
    public static void main(String [] args)
    {
        int a = 5;

        int b = a++ + ++a;

        System.out.println("a: " + a);

        System.out.println("b: " + b);
    }
}
