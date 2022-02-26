import java.util.Scanner;
public class Primenumber
{
    public static void main(String args[])
    {
	int a,i,b;
	b=1;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter a number");
	a=obj.nextInt();
	for(i=2;i<=a/2;i++)
	{
	    if(a%i==0)
		b=0;
	}
	if(b==0)
	    System.out.println("Number is not Prime");
	else
	    System.out.println("Number is Prime");
    }
}
