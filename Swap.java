package task4;
import java.util.Scanner;

public class Swap {
private static Scanner sc;
	public static void main(String[] args) {
		int a,b,t;
		sc = new Scanner(System.in);
		System.out.println("Enter the value of a : ");
		a=sc.nextInt();
		System.out.println("Enter the value of b : ");
        b=sc.nextInt();
        System.out.println("value of a = " +a+ " value of b = "+b);
        t=a;
        a=b;
        b=t;
        System.out.println("value of new a = " +a+ " value of new b = "+b);
		

	}

}
