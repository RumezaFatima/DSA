package DayThree;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value for factorial n: ");
            n = sc.nextInt();
        }

        System.out.println("The factorial of "+ n +" = "+ fact(n));

    }
    static int fact(int n){
        if(n>0){
            return n*fact(n-1);   
        }else{
            return 1;
        }
    }
    
}