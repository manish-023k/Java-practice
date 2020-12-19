package arylist;
interface calculator
{
	void add(int x1,int x2);
}
class calc
{
	public static void addsomthing(int a,int b)
	{
		System.out.println("addition of numbers:"+(a+b));
	}
	public void addtion(int a1,int b1)
	{
		System.out.println("addition of numbers:"+(a1+b1));	
	}
}
interface massanger
{
	message getmessage(String msg);
}
class message
{
	message(String msg)
	{
		System.out.println(msg);
	}
}
public class lambdaexp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calculator cs=calc::addsomthing;//reference to static method 
		//cs.add(10, 20);
		//reference to instance method
		/*calc c =new calc();
		calculator cs=c::addtion;
		cs.add(10, 25);*/
		// reference to construrtor
		massanger mg=message::new;
		mg.getmessage("lambda expresion used for functional programming..");

	}

}
