package DayTwo;
import java.util.Scanner;
public class smallestNo 
{
	public static void main(String[] args)
	{
		try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the Number 1 : ");
            int n1 = input.nextInt();
            System.out.print("Enter the Number 2 : ");
            int n2 = input.nextInt();
            System.out.print("Enter the Number 3 : ");
            int n3 = input.nextInt();
            System.out.print("The smallest value is " + Math.min(Math.min(n1, n2), n3));
        }
	}	
}