package Tree;

public class BuildTreefromPostAndInOrder {
	class Node
	{
	    int data;
	    Node left;
	    Node right;

	        Node(int value)
	    {
	        data = value;
	        left = null;
	        right = null;
	    }
	}
	    // Complete the function
	    Node buildTree(int in[], int post[], int n) {
	       return(construct(0,in.length-1,in,post,in.length-1));//function returns tree with root index from postorder and L&R index from inorder
	    }
	    Node construct(int l,int r, int in[],int post[],int rootind){//rootind is index(in post order) of root of elements in range L to R(L,R wrt inorder)
	        if(l>r)       //base case
	          return(null);
	          int c=0;
	        for(int i=0;i<in.length;i++){//finds index of root in inorder array
	            if(in[i]==post[rootind]){
	                c=i;
	                break;
	            }
	        }
	        Node root=new Node(in[c]);
	        root.left=construct(l,c-1,in,post,rootind-(r-c)-1);//root of left subtree in postorder is:  index_of_current_root - no_of_elements_in_rightsubtree-1
	        root.right=construct(c+1,r,in,post,rootind-1);//root of right subtree in postorder  is beside current_root 
	        return(root);
	    }
	}
