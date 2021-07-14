
public class Que6_a {

	public static void main(String[] args) {
		int n1=0,n2=1,num,i;
		System.out.print(n1 +"\t" + n2 +"\t");
		for(i=2;i<=10;i++)
		{
			num=n1+n2;
			System.out.print(num +"\t");
			n1=n2;
			n2=num;	
		}

	}
}
