import java.util.Scanner;
class armstrongn
{
    public static void main(String args[])
    {
	int n,d,r,result=0;
	Scanner imp=new Scanner(System.in);
	System.out.println("Enter a three digit number");
	n=imp.nextInt();
	d=n;
	while(n>0)
	{
	    r=n%10;
	    result=result+r*r*r;
	    n=n/10;
	}
	if(result==d)
	{
	    System.out.println(d+" is a Armstrong NUmber");
	}
	else
	     System.out.println(d+" is not an Armstrong Number");
    }
}

