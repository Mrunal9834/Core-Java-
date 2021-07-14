import java.util.Scanner;
public class Que_9 {

	public static void main(String[] args) {
		
		int sum=0;
		System.out.println("Enter value");
		Scanner scanner = new Scanner(System.in);
		int value= scanner.nextInt();
		
		while(value >0)
		{
			 int n= value%10;
			 sum=sum+n;
			 value =value/10;
		}
		System.out.println("Sum of digits : " + sum );
	}

}
