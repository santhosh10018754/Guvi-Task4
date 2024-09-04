package task4;
import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		int count =0;
		
		while(num > 0) {
			num=num/10;
			count++;
			
		}
      System.out.println("number of digits : "+count);
	}

}
