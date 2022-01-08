import java.util.*;
class factorinput
{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to print the factors of a given number");
	int a=sc.nextInt();
	int i=1;
	for(;i<a;i++){
	if(a%i==0)
	{
	System.out.println(i);	 
	}
	}
	}
 }
