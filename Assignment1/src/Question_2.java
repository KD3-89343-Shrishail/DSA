import java.util.Scanner;

public class Question_2 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		DecendingStack ds = new DecendingStack(3);
		do
		{
			 System.out.println("1.for push \n2.for pop \n3.for peek");
		        choice = sc.nextInt();
		        switch(choice)
		        {
		        case 1:
		        	System.out.println("Enter the num to push");
		        	ds.push(sc.nextInt());
		        	break;
		        case 2:
		        	int poped = ds.pop();
		        	if(poped!= -1)
		        	System.out.println("Poped value is " +poped);
		        	break;
		        case 3:
		        	int peeked = ds.peek();
		        	if(peeked!= -1)
		        	System.out.println("Peeked value is " +peeked);
		        	break;
		        }
		        
		}while(choice!=0);
       sc.close();
	}
}

 class DecendingStack
{
	private int []arr;
	private int top;
	private int size;
	public DecendingStack(int size)
	{
       this.size=size;
       arr = new int[size];
       top=size;
	}
	public boolean isEmpty()
	{
		if(top==size)
			return true;
		return false;
	}
	public boolean isFull()
	{
		if(top==0)
			return true;
		return false;
	}
	public void push(int num)
	{
		if(isFull())
		{
			System.out.println("stack is full");
		}
		else
	    {
			arr[--top] = num;	
			System.out.println("successfully addded");
		}	
	}
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("stack is empty");
			return -1;
		}
		else
	    {
			return arr[top++];				
		}
	}
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("stack is empty");
			return -1;
		}
		else
	    {
			return arr[top];				
		}
	}
}