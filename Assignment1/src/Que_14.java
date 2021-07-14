import java.util.Scanner;

public class Que_14 {

	public static void main(String[] args) {
		int result=0;
		System.out.println("Enter  a  number");
		Scanner scanner = new Scanner(System.in);
		int value= scanner.nextInt();
		int num = value;
		
		while(value >0)
		{
			 int n= value % 10;
			 result=result+(n*n*n);
			 value=value/10;
		}
		if(result==num)
		{
			System.out.println(num + " is an Armstrong number");
	    }
		else
		{
			System.out.println(num + " is not an Armstrong number");
		}

	}

}
