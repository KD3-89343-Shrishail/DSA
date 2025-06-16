import java.util.Stack;

public class Question_3 
{
	
	public static int[] reverseArray(int  []arr) 
	{
		Stack<Integer> stack = new Stack<Integer>();
		for(int i = 0; i<arr.length; i++)
		{
			stack.push(arr[i]);
		}
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = stack.pop();
		}
		return arr;
	}
    public static void print(int arr[])
    {
    	for(int i = 0; i<arr.length; i++)
    	{
    		System.out.println(arr[i]);
    	}
    }
	public static void main(String[] args) 
	{
       int []arr = new int[]{1,2,3,4,5,6,7,8,9};
       print(arr);
       reverseArray(arr);
       print(arr);      
	}

}
