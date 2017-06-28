package myPack;

import java.util.*;      

public class ABS_Interface
{
	public static void main(String[] args)      
	{
		int fixedStackSize;    
      //Stack with fixed maximum size.       
		int variableStackSize; 
      //S ack with fixed variable size.
 		
		Scanner sc=new Scanner(System.in);       
		
		System.out.println("Please Enter the size of Fixed Stack :-");        
		fixedStackSize=sc.nextInt();        
		FixedStack fixedStack1=new FixedStack(fixedStackSize);        
		fixedStack1.push(2);           
		fixedStack1.push(3);
		fixedStack1.push(4);
		fixedStack1.push(6);
		fixedStack1.push(8);
       //Pushing some elements in stack.
		
		System.out.println(fixedStack1.pop()+" is popped out from the stack"); //These are popping elements.   
		
		System.out.println();   
		
	
		System.out.println("Please Enter the size of Variable Stack :-");    
		variableStackSize=sc.nextInt();        
		VariableStack variableStack1=new VariableStack(variableStackSize);      
		variableStack1.push(2);              
		variableStack1.push(4);
		variableStack1.push(8);
		variableStack1.push(14);
		variableStack1.push(18);
//Pushing some elements in stack.

		System.out.println(variableStack1.pop()+" is popped out from the stack");    //These are popping elements.        
		
		sc.close();       
		
	}    
}   

