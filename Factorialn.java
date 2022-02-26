import java.util.Scanner;
class Factorialn
{
    public static void main(String args[])
    {
	int n,i,f=1;
	Scanner imp=new Scanner(System.in);
	System.out.println("Enter the number");
	n=imp.nextInt();
	for(i=n;i>=1;i--)
	{
	    f=f*i;
	}
	System.out.println("Factorial is "+f);
    }
}
