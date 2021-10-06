class Powerof2
{
  public static void main(String args[])
  {
 
   if(args.length>0&&  args.length<32)
	{

	for(double6 i=1;i<=args.length;i++)
	{
				
     	 System.out.println(i+" "+Math.pow(2,args[i]));
	}
	}else{

	 System.out.println("overflow");
	}
 
 
  }
}//for(int i=0;i<args.length;i++)  
//System.out.println(args[i]);  
  