import java.util.Scanner;
public class FibonacciSeries
{
    public static void main(String args[])
    {
	int a,f,s,sum,i;
	f=0;
	s=1;
	Scanner imp=new Scanner(System.in);
	System.out.println("Enter the number upto which Fibonacci Series is taken");
	a=imp.nextInt(); 
	System.out.println("Enter first element");
	f=imp.nextInt();
	System.out.println("Enter second element");
	s=imp.nextInt();
	System.out.println("Factorial is");
	System.out.println(f);
	System.out.println(s);
	for(i=3;i<=a;i++)
	{
	    sum=f+s;
	    System.out.println(sum);
	    f=s;
	    s=sum;
	}
    }
}
