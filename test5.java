import java.util.Stack;

public class test5 {
	public static int calulate(String str)
	{
		char arr[]=str.toCharArray();
		Stack<Integer> val=new Stack<Integer>();  //storing the numbers
		Stack<Character> op=new Stack<Character>(); //storing the operators
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==' ')
				continue;
			else if(arr[i]>='0' && arr[i]<='9')
			{
				StringBuffer sb=new StringBuffer();
				while(i<arr.length &&(arr[i]>='0' && arr[i]<='9'))
					sb.append(arr[i++]);
				val.push(Integer.parseInt(sb.toString()));
			}
			else if(arr[i]=='(')
				op.push(arr[i]);
			else if(arr[i]==')')
			{
				while(op.peek()!='(')
					val.push(app(op.pop(),val.pop(),val.pop()));
				op.pop();
			}
			else if(arr[i]=='+' ||arr[i]=='-' || arr[i]=='*' || arr[i]=='/')
			{
				while(!op.empty() && haspar(arr[i],op.peek()))
					val.push(app(op.pop(),val.pop(),val.pop()));
				op.push(arr[i]); //push cuurenet token to stack
			}
		}
		while(!op.empty())
			val.push(app(op.pop(),val.pop(),val.pop()));
		
		return (val.pop());
	}
	public static boolean haspar(char op1,char op2)
	{
		if(op2=='(' ||op2==')')
			return false;
		else if((op1=='*' || op1=='/') && (op2=='+' || op2=='-'))
		return false;
		else
			return true;
	}
	public static int app(char op,int a,int b)
	{
		switch(op)
		{
		case '+':
			return(a+b);
		case '-':
			return(a-b);
		case '*':
			return(a*b);
		case '/':
		if(b==0)
			throw new UnsupportedOperationException("number cannot divide by 0");
		return(a/b);
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res=calulate("2 + 1 + 4");
		System.out.println(res);

	}

}
