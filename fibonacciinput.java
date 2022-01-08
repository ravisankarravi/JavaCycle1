import java.util.*;
class fibonacciinput
{
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the numbers");
	int a=sc.nextInt();
	int n1=0,n2=1,n3,i;
	System.out.println(n1);
	System.out.println(n2);
	for(i=2;i<=a;i++)
	{
		n3=n1+n2;
		System.out.println(n3);
		n1=n2;
		n2=n3;
	
	}

}
}
