import java.util.Scanner;  
public class LargestNumber  
{  
public static void main(String[] args)   
{  
int a, b, c, largest;    
Scanner sc = new Scanner(System.in);  
System.out.println("Enter the first number:");  
a = sc.nextInt();  
System.out.println("Enter the second number:");  
b = sc.nextInt();  
System.out.println("Enter the third number:");  
c = sc.nextInt();  
	if(a>b && a>c)
	{
	 System.out.println("a is greater");
	} 
	else if(b>c)
	{
	System.out.println("b is greater");
	}
	else
	{
	System.out.println("c is greater");
	}
}  
}  
