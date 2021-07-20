package Stacks;

public class DeleteMiddleRecursion {
	 public void deleteMid(Stack<Integer>s,int sizeOfStack){
	        // code here
	        int middle=(int)Math.ceil(sizeOfStack/2);
	        s=deleteMid(s,middle,0);
	            
	        }
	        static Stack<Integer> deleteMid(Stack<Integer>s,int middle,int curr){
	            if(curr==middle){
	                s.pop();
	                return s;
	            }
	            int temp=s.peek();
	            s.pop();
	            s=deleteMid(s,middle,curr+1);
	            s.push(temp);
	            return s;
	        }
}
