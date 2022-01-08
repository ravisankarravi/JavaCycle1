import java.util.*;
class armstronginput
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to check whether it is armstrong or not");
	int a=sc.nextInt(),sum=0,b;
	int temp=a;
	while(a>0){
	b=a%10;
	sum=sum+(b*b*b);
	a=a/10;
}
if(temp==sum)
	System.out.println("It is armstrong");
else{
	System.out.println("It is not armstrong");
}
}
}
