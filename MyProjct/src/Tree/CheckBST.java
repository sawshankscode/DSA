package Tree;

import java.util.ArrayList;

public class CheckBST {
	 static ArrayList<Integer> list=new ArrayList<>();
	    // return true if the given tree is a BST, else return false
	    boolean isBST(Node root)
	        {
	            
	            inOrder(root);
	            int n=list.size();
	            int c=0;
	            for(int i=0;i<n-1;i++)
	            {
	                if(list.get(i)<list.get(i+1))
	                c++;
	            }
	            list.clear();
	            if(c==n-1)
	            return true;
	            else 
	            return false;
	            
	        }
	        static void inOrder(Node root){
	             
	             if(root==null)
				return;
			inOrder(root.left);
			list.add(root.data);
			inOrder(root.right);
	        }
	}

