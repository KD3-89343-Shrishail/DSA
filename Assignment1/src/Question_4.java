import java.util.Scanner;

public class Question_4 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		CircularQueue cq = new CircularQueue(3);
		do
		{
			 System.out.println("1.for push \n2.for pop \n3.for peek");
		        choice = sc.nextInt();
		        switch(choice)
		        {
		        case 1:
		        	System.out.println("Enter the num to push");
		        	cq.push(sc.nextInt());
		        	break;
		        case 2:
		        	int poped = cq.pop();
		        	if(poped!= -1)
		        	System.out.println("Poped value is " +poped);
		        	break;
		        case 3:
		        	int peeked = cq.peek();
		        	if(peeked!= -1)
		        	System.out.println("Peeked value is " +peeked);
		        	break;
		        }	        
		}while(choice!=0); 
		sc.close();
	}

}
class CircularQueue
{
	private int []arr;
	private int rear = -1,front = -1,size;
	private int count=0;
	CircularQueue(int size)
	{
		this.size=size;
		arr = new int[this.size];
	}
	public boolean isEmpty() 
	{
	    //if(rear==front&&rear==-1)
		if(count==0)
	    	return true;
	    return false;
	}
	public boolean isFull() 
	{
	    //if((rear == front && rear != -1) || (front==-1&&rear==size-1))
	    if(count==size)
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
		   rear = (rear+1)%size;
		   arr[rear]=num;
		   count++;
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
		
		int poped = arr[(front+1)%size];
		count--;
		front++;
		if(rear==front)
			rear=front=-1;
		return poped;
	}
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("queue is empty");
			return -1;
		}
	    return  arr[(front+1)%size];
		 
	}
}