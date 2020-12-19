package arylist;
@FunctionalInterface
interface cab{ // it exactly contain one public static void method is called functional interface
	//void bookcab();// by default public abstract void method
	double bookcab(String sor,String dis);
}
class Cabx implements cab {
	public double bookcab(String sor1,String dis1)
	{
		System.out.println("cab booked successfully from"+sor1+"to"+dis1);
		return (500);
	}
}

public class lambdaexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	cab x=new Cabx(); //by creating object
	//	x.bookcab();
	/*	cab x2=new cab() {
			public void bookcab()
			{
				System.out.println("cab booked by anonymous class....");
			}
		};
		x2.bookcab();*/
		//using lambda expresion
		cab x3=(sor,dis)->{
			System.out.println("cab booked from "+sor+" to "+dis);
			return(600);
		};
		double map=x3.bookcab("malout","chandigarh");
		System.out.println(map);

	}

}
