package Task_12June;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Academic Score: ");
        int marks = scanner.nextInt();

        String grade = (marks >= 90) ? "A+" : (marks >= 75) ? "A" : (marks >= 60) ? "B" : (marks >= 40) ? "C" : "F";
        System.out.println(grade);
    }
}
