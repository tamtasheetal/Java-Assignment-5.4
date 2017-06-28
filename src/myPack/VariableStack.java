package myPack;

public class VariableStack implements Stack    
//Declaration of class which implements the interface Stack.
{
	int stackArray[];        
	int top=-1;        
	int maxSize;       
	int size;         
	
	public VariableStack(int maxSize)    
	{
		this.maxSize=maxSize;         
		stackArray=new int[maxSize];     
		size=0;
	}
	
	public void push(int I)      
	{
		if(top+1==maxSize)      
//This will check weather the size of Stack is needed to Increase or not.
			
		growArraySize();
		stackArray[++top]=I;        
		size++;   
		
		System.out.println(I+" is pushed into stack");
	}
	
	public int pop()       
	{
		if(top==-1)      
//This will Check weather the Stack is Empty or not.
		{
			System.out.println("The Stack is empty!");
			return -1;
		}
		size--;       
//Here decreamenting the size of array.
		return stackArray[top--];       
	}
	
	public void growArraySize()     
	{
		int temp[]=new int[2*maxSize];      
//This will create a temporary array.
		
		for(int i=0;i<size;i++)         
			temp[i]=stackArray[i];
		stackArray=temp;  
		
		maxSize=2*maxSize; 
//Double the maximum size.
		System.out.println("Stack array size is doubled");
	}
}
