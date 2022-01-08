import java.util.*;
class naturalinput
	{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	 	int i,num,sum=0;
		
		System.out.println("Enter the number");
		num=sc.nextInt();
		for(i=0;i<=num;i++)
		{
			sum=sum+i;
			
		}
	System.out.println("Sum="+sum);
 	}
	}
