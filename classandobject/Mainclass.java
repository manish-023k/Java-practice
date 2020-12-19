package classandobject;

abstract class figure
{
	double r;
	abstract void area();
	abstract void perimeter();
	
}
class circle extends figure
{
	circle(double red )
	{
		r=red;
	}

	void area()
	{
		double dim=3.14*r*r;
		System.out.println(dim);
		
	}
	void perimeter()
	{
		 double dim=2*3.14*r;
		System.out.println(dim);
	}
	public String toString()
	{
		return("this is a circle class object");
	}
}
class rectangle extends figure
{
	double b;
	rectangle(double a,double x)
	{
		r=a;
		b=x;
	}
	void area()
	{
		double dim=r*b;
		System.out.println(dim);
	}
	void perimeter()
	{
		double dim=2*(r+b);
		System.out.println(dim);
	}
	public String toString()
	{
		return("this is a Rectangle class object ");
	}
}
class triangle extends figure
{
	double b,c;
	triangle(double a1,double b1,double c1)
	{
		r=a1;
		b=b1;
		c=c1;
		
	}
	void area()
	{
		double s=(r+b+c)/2;
		double area=s*(s-r)*(s-b)*(s-c);
		System.out.println(Math.sqrt(area));
		
	}
	void perimeter()
	{
		System.out.println((r+b+c));
	}
	public String toString()
	{
		return("this is a Triangle class object");
	}
}

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c1=new circle(2);
		rectangle t1=new rectangle(2,4);
		triangle tr=new triangle(2,4,6);
		c1.area();
		c1.perimeter();
		t1.area();
		t1.perimeter();
		tr.area();
		tr.perimeter();
		System.out.println(c1);
		System.out.println(t1);
		System.out.println(tr);
		figure f[]=new figure[6];

	}

}
