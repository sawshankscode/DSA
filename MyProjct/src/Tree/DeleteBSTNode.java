package Tree;

public class DeleteBSTNode {
	public static Node deleteNode(Node root, int X)
	{
		// code here.
		if(root==null)
            return root;
        
        if(root.data>X)
        root.left=deleteNode(root.left,X);
        
        else if(root.data<X) 
            root.right=deleteNode(root.right,X);
        else
        {
            if(root.left==null)
            {
                Node succ=root.right;
                
                return succ;
            }
        
            else if(root.right==null)
            {
                Node succ=root.left;
               
                return succ;
            }
            
            else
            {
                Node temp=root.right;
                while(temp.left!=null)
                temp=temp.left;
                
                root.data=temp.data;
                root.right=deleteNode(root.right,temp.data);
            }
            
        }
            
        return root;
	}
}
