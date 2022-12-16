public class Main
{
	public static void main(String[] args) {
		int a=48;
		int co=0;
		if(a<=0)
		{
		    System.out.println("It is not a Prime Number "+a);
		    return;
		}
		for(int i=1;i<=a;i++)
		{
		    if(a%i==0)
		     co++; 
		     
		}
		System.out.println("The value of count "+co);
		if(co==2)
		System.out.println("It is Prime Number "+a);
		else
		System.out.println("It is not Prime Number "+a);
	}
}

