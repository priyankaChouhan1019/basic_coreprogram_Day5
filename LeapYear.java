import java.util.Scanner;
class LeapYear
{    public static void main(String[]args)
{ 
      int year,yearDigit=0;
      System.out.println("enter year");
	Scanner sc =new Scanner(System.in);
	year=sc.nextInt();


     /*  while(year>0)
	{
	 year=year/10;
         yearDigit++;
      
	}
   System.out.println("number of digit"+yearDigit);*/
	
if(year>1000)//check number is 4digit or not
{
	  if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
            System.out.println(" year is a leap year");
           }
            else
            { 
              System.out.println(" year is not a leap year");
            }
	
 }   



}
}