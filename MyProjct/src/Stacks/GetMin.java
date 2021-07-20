package Stacks;

import java.util.Stack;

class GetMin
{
    
    /* inserts elements of the array into 
        stack and return the stackn*/
   Stack<Integer> s=new Stack<>();
   int minEle;
   int z=1000;
   
   int getMin() {
	   if(s.isEmpty())
		   return -1;
	   return s.peek()/z;
	   
   }
   
   int  pop() {
	   if(s.isEmpty())
		   return -1;
	   int actual =s.peek()%z;
	   s.pop();
	   if(!s.isEmpty())
		   minEle=s.peek()/z;
	   
	   return actual;
	   
	   
   }
   void push(int x) {
	   
	   if(s.isEmpty())
		   minEle=x;
	   else if(minEle>x)
		   minEle=x;
	   
	   int n1=x;
	   int n2=minEle;
	   n1 = n1+(n2%z)*z;
	   s.push(n1);
	   
   }
   
   public static void main(String[] args) {
	
}
}
