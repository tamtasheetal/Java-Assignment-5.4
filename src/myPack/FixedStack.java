package myPack;

public class FixedStack implements Stack      
//This is Class declaration implementing the Stack Interface.
{
	int stackArray[];         
	//Here the Array will contain the elements of Stack.
	int top=-1;              
	int maxSize;             
	int size;                
	
	public FixedStack(int maxSize)         
	{
		this.maxSize=maxSize;            
		stackArray=new int[maxSize];    
		size=0;
	}
	
	public void push(int I)           
//To push element into Stack.
	{
		if(top+1==maxSize)             
		    {
			 System.out.println("Stack Overflow");
			 return ;
			}
		stackArray[++top]=I;         
		size++;          
	//Here Increasing the instantaneous size.
		System.out.println(I+" is pushed into the Stack");
	}
	
	public int pop()      
	{
		if(top==-1)          
		{
			System.out.println("Stack is Empty");
			return -1;
		}
		size--;         
	//Here Decreasing the size by one.
		return stackArray[top--];      
	}
}      

