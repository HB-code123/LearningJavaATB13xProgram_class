import java.util.Scanner;
public class Triangle
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length for 1st Triangle: ");
        int SideOne = scanner.nextInt();
        System.out.println("Enter length for 2nd Triangle: ");
        int SideTwo = scanner.nextInt();
        System.out.println("Enter length for 3rd Triangle: ");
        int SideThree = scanner.nextInt();

        if(SideOne == SideTwo && SideTwo == SideThree)
        {
            System.out.println("This is an equilateral triangle");
        }
        else if(SideOne == SideTwo && SideTwo != SideThree || SideTwo == SideThree && SideThree != SideOne || SideThree == SideOne && SideOne != SideTwo)
        {
            System.out.println("This is an isosceles triangle");
        }
        else
        {
            System.out.println("This is a scalene triangle");
        }
    }
}
