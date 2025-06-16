import java.util.Scanner;

public class Question_1 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		LinearQueue lq = new LinearQueue(5);
		do
		{
			 System.out.println("1.for push \n2.for pop \n3.for peek");
		        choice = sc.nextInt();
		        switch(choice)
		        {
		        case 1:
		        	System.out.println("Enter the num to push");
		        	lq.push(sc.nextInt());
		        	break;
		        case 2:
		        	int poped = lq.pop();
		        	if(poped!= -1)
		        	System.out.println("Poped value is " +poped);
		        	break;
		        case 3:
		        	int peeked = lq.peek();
		        	if(peeked!= -1)
		        	System.out.println("Peeked value is " +peeked);
		        	break;
		        }	        
		}while(choice!=0); 
		sc.close();
	}

}
class LinearQueue
{
	int []arr;
	private int rear = 0,front =0,size;
	LinearQueue(int size)
	{
		this.size=size;
		arr = new int[this.size];
	}
	public boolean isEmpty() 
	{
	    if(rear==0)
	    	return true;
	    return false;
	}
	public boolean isFull() 
	{
	    if(rear==size)
	    	return true;
	    return false;
	}
	public void push(int num)
	{
		if(isFull())
		{
		System.out.println("queue is full");
		}
		else
		{
		arr[rear]=num;
		rear++;
		System.out.println(" added in queue successfully");
		}
	}
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("queue is empty");
			return -1;
		}
		int poped = arr[front++];
		if(rear==front)
			rear=front=0;
		return poped;
	}
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("queue is empty");
			return -1;
		}
	    return  arr[front];
		 
	}
}
