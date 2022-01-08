import java.util.*;
class factorialinput
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n=sc.nextInt();
		int i,factorial=1;
		for(i=1;i<=n;i++)
		{
			factorial=factorial*i;
		}
		System.out.println("Factorial is "+factorial);
		}
	}

