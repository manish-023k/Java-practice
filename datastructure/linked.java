package datastructure;

class node
{
	int value;
	node next; //to store the addres of varrible of node type
	node(int a)
	{
		value=a;
		next=null;
	}
}
public class linked {
	node head=null;

	 void insert(int val)
	{
		node temp=new node(val);
		if(head==null)
			head=temp;
		else
		{
			node p=head;
			while(p.next!=null)
			{
				p=p.next;
			}
			p.next=temp;
		}
	}
	 void display()
	 {
		 node p=head;
		 while(p!=null)
		 {
			 System.out.print(p.value+" ");
			 p=p.next;
		 }
	 }
	 void displayrev(node pr)
	 {
		 if(pr==null)
			 return ;
		 displayrev(pr.next);
		 System.out.print(pr.value+" ");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linked ln=new linked();
        for(int i=1;i<=5;i++)
		{
		   ln.insert(i);
		}
		//ln.insert(12);
        ln.display();
        node m=ln.head;
		ln.displayrev(m);

	}

}
