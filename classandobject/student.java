package classandobject;

public class student {
	int id;
	String name;
	float marks;
	student(int sid,String nam,float mark)
	{
		id=sid;
		name=nam;
		marks=mark;
	}
	public void display()
	{
		System.out.println("student id : "+id+"     "+"Student name :"+name+"    "+"marks of marks"+marks);
	}

	

}
