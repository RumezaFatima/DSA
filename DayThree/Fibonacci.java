package DayThree;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n,t1 = 0 ,t2 = 1 ,nextterm;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of terms for series: ");
            n = sc.nextInt();
        }
        nextterm = t1 + t2;
        System.out.print(t1+" "+t2+" ");
        
        for(int i=3;i<=n;i++){
            System.out.print(nextterm+" ");
            t1=t2;
            t2=nextterm;
            nextterm = t1 + t2;
        }
    }  
}
