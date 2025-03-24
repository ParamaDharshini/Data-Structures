package Day_5;

public class Stack {
	int[] stack1=new int[10];
	int top=-1;
	public void push(int val) {
		if(top<9)
		{
			stack1[++top]=val;
		}
		else
		{
			System.out.println("Stack Overflow");
		}
		
	}
	
	/*public void pop()
	{
		stack1[top-1];
	}*/
	
	
	public void peek() {
		System.out.println("Top element"+stack1[top]);
	}
	

}
