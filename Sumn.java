import java.util.Scanner;
public class Sumn
{
    public static void main(String args[])
    {
	int n,sum,i;
	sum=0;
	i=1;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the number of numbers");
	n=obj.nextInt();
	for(i=1;i<=n;i++)
	    sum=sum+i;
	System.out.println("Sum is "+sum);
    }
}
