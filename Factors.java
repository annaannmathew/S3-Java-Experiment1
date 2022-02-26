import java.util.Scanner;
public class Factors
{
    public static void main(String args[])
    {
	int a,i;
	Scanner imp=new Scanner(System.in);
	System.out.println("Enter a number");
	a=imp.nextInt();
	System.out.println("Factors are");
	for(i=1;i<=a;i++)
	    if(a%i==0)
	        System.out.println(i);
    }
}
