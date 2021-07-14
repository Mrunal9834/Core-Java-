
public class Que6_b {

	public static void main(String[] args) {
		int n1=0,n2=1,num,i;
		
		for(i=2;;i++)
		{
			num=n1+n2;
			n1=n2;
			n2=num;	
			if(num%2 == 0 && num>100)
			{
			    System.out.print(num +"\t");
			}
			if(num<1000 && num>0)
				continue;
			else
				break;	
		}
	}

}
