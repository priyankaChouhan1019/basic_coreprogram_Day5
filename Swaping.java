import java.util.Scanner;
 class Swaping {

  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first value");
        int a =sc.nextInt();
	System.out.println("Enter Second value");
	int b =sc.nextInt();
		System.out.println("before swapping value ofa and b is" +a+"and"+b);
		a=a+b;
		b=a-b;
		a=a-b;
	    
  System.out.println("after swapping value ofa and b is" +a+"and"+b);

  

   
  }
}