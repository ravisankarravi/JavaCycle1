import java.util.*;
class palindromeinput
{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int originalnumber,rem,reversednum=0;
	originalnumber=n;
	while(originalnumber!=0)
	{
	rem=originalnumber%10;
	reversednum=reversednum*10+rem;
	originalnumber/=10;
	}
	if(n==reversednum)
	{
	System.out.println(n+"is palindrome");
	}
	else
	{
	System.out.println(n+"is not palindrome");
	}
}
}

