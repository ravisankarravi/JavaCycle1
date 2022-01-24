import java.util.*;
public class Main
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int a,i;
	System.out.println("Enter the number");
	a=sc.nextInt();
	for(i=2;i<=a/2;i++)
	{
		if(a%2==0)
		{
		System.out.println("Not prime");

		}
		else
		{
		System.out.println("Prime");

		}
	break;
	}
	}
}
/*
Output
Enter the number
5
Prime
*/
