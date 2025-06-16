package Task_12June;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int number = scanner.nextInt();
        String numb = (number % 2) == 0 ? "It's an Even Number" : "It's an Odd number";
        System.out.println(numb);
    }
}
