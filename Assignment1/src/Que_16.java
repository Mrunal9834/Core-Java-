import java.util.Scanner;

public class Que_16 {

	public static void main(String[] args) {
		
		int sum=0;
		Scanner scanner = new Scanner(System.in);
		int [] arr= new int[3];
		
		System.out.println("Enter three numbers ");
		for(int i=0;i<3;i++)
		{
			arr[i]=scanner.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("Sum of three numbers : " + sum);
	}

}
