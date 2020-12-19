package operatormanish1;

public class pattren8
{
  public static void main(String []args)
  {
	  int in;
	 for(int i=1;i<=4;i++)
	 {
		 in=0;
		 for(int j=1;j<=7;j++)
		 {
			 if(((i+j)<=4)||((j-i)>=4))
			 {
				 System.out.print(" ");
			 }
			 else
			 {
				 if(j>4 && (j-i)<=4 )
				 {
					 in--;
				 System.out.print(in);
				 }
				 else
				 {
					 in++;
					 System.out.print(in);
					
				 }
			 }
			 
		/*	 else if(j<=4)
			 {
				 System.out.print(in);
				 in++;
			 }
			 else
			 { in--;
				 System.out.print(in);
			 }*/
		 }System.out.println();
		 
	 }
  }
}
