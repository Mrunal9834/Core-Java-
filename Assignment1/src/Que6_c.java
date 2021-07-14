
public class Que6_c {

	public static void main(String[] args) {
		 
		int n1=0,n2=1,num,i;
		System.out.print(n1 +"\t" + n2 +"\t");
		
		for(i=2;;i++)
		{
			num=n1+n2;
			n1=n2;
			n2=num;	
			if(num%2 != 0)
			{
			System.out.print(num +"\t");
			}
			if(num<100 && num>0)
				continue;
			else
				break;	
		}

	}

}
