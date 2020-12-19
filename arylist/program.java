package arylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class student
{
	int stid;
	String sname;
    int marks;
    student(int stid,String sname,int marks)
    {
    	this.stid=stid;
    	this.sname=sname;
    	this.marks=marks;
    }
    void display()
    {
    	System.out.println(stid+" "+sname+" "+marks);
    }
}

public class program {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
        
		student []arr=new student[5];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			int id=Integer.parseInt(br.readLine());
			String name=br.readLine();
			int mark=Integer.parseInt(br.readLine());
			arr[i]=new student(id,name,mark);
			list.add(arr[i].marks);
		}
		//
		Collections.sort(list);
		//System.out.println(list);
	//	ArrayList<student> list1=new ArrayList();
		for(int i=list.size()-1;i>=0;i--)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j].marks==list.get(i))
				{
					arr[j].display();
				}
			}
		}
		
		
	}

}
