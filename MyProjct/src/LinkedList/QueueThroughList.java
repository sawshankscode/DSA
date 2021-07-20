package LinkedList;

public class QueueThroughList {
QueueNode front, rear;
    
    // This function should add an item at
    // rear
	void push(int a)
	{
	    QueueNode temp=new QueueNode(a);
	    try{
	    if(rear==null){
	    rear=temp;
	    front=rear;}
	    else{
	    
        rear.next=temp;
        rear=rear.next;}}
        catch(NullPointerException e){}}
	
    // This function should remove front
    // item from queue and should return
    // the removed item.
	int pop()
	{
	    
	   if(front==null)
	    return -1;
	    
	    if(front==rear){
	        int a =front.data;
	        front=rear=null;
	        return a;}
	         
	    
	    else{
	    
   int a =front.data;
    
    front=front.next;
	    return a;    
	    }}
}
