import java.util.Scanner;
public class Odd
{
    public static void main(String args[])
    {
	int a,b;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter a number");
	a=obj.nextInt();
	b=a%2;
	if(b==0)
	    System.out.println("Number is Even");
	else
	    System.out.println("Number is Odd");
    }
}
