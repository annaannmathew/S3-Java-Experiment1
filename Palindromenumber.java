import java.util.Scanner;
class Palindromenumber
{
    public static void main(String args[])
    {
	int rev=0,a,org,r;
	Scanner imp=new Scanner(System.in);
	System.out.println("Enter the number");
	a=imp.nextInt();
	org=a;
	while(a>0)
	{
	    r=a%10;
	    rev=rev*10+r;
	    a=a/10;
	}
	if(org==rev)
	    System.out.println(org+" is palindrome");
	else
	    System.out.println(org+" is not palindrome");
    }
}
