package ex_01_Java_Basic;

public class incr2
{
    public static void main(String[] args)
    {
        int x = 5;

        int y = x++ + ++x + x++ + ++x;

        System.out.println("x = " + x + ", y = " + y);
    }
}
