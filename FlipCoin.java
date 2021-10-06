import java.util.Scanner;
class FlipCoin {
public static void main(String[] args) {
 Scanner sc =new Scanner(System.in); 
System.out.println("enter nmber of time to flip the coin");
	int n=sc.nextInt();
 for(int i=1;i<=n;i++) {
    if (Math.random() < 0.5){
     System.out.println("Heads");
      }
     else
       {
      System.out.println("Tails");
       }
}
   }
}