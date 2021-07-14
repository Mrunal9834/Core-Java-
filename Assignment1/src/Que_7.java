
public class Que_7 {

	public static void main(String[] args) {
		
		System.out.print("Series 1 : ");
		int i=0,num=1;
		while(i<10)
		{
			System.out.print(num +"\t");
			num=num+3;
			i++;
		}
		
		
		i=0;
		int num2= -20;
		System.out.print("\n");
		System.out.print("Series 2 : ");
		while(i<10)
		{
			System.out.print(num2 +"\t");
			num2=num2+5;
			i++;
		}	
		
		System.out.print("\n");
		System.out.print("Series 3 : ");
		int num3=1;
		i=0;
		while(i<10)
		{
			if(num3%2 != 0)
			{
			System.out.print(num3 +"\t");
			}
			else
			{
			   System.out.print("-"+num3 +"\t");
			}
			num3=num3+1;
			i++;
		}
		
	}

}
