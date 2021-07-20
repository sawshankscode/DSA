package LinkedList;

public class Flatten {
	Node flatten(Node root)
    {
    PriorityQueue<Integer> pa=new PriorityQueue<>();
    Node t2=root;
    Node t1=root;
    try{
    if(root.next==null && root.bottom==null)
    return root;
        while(t1!=null){
            
            while(t2.bottom!=null){
                t2=t2.bottom;
            }
            t2.bottom=t1.next;
            t1=t1.next;
        }
        root.next=null;
        t2=root;
        while(t2!=null){
            pa.add(t2.data);
            t2=t2.bottom;}
            
            t2=root;
            while(t2!=null){
                t2.data=pa.poll();
                t2=t2.bottom;}}
                catch(NullPointerException e){}
                return root;
            }
}
