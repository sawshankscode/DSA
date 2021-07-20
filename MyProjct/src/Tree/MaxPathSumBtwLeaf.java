package Tree;

import Tree.Trees.Node;

public class MaxPathSumBtwLeaf {
		static int ans=Integer.MIN_VALUE;
		public static int maxSum(Node root) {
			int maxSum=maxSumUtil(root,ans);
			return ans;
		}
		static int maxSumUtil(Node root,int ans) {
			if(root==null)
				return 0;
			if(root.left==null && root.right==null)
				return root.data;
			int ls=maxSumUtil(root.left, ans);
			int rs=maxSumUtil(root.right, ans);
			if(root.left!=null && root.right!=null) {
				ans=Math.max(ans, ls+rs+root.data);
				return Math.max(ls,rs)+root.data;
			}
			return (root.left==null)? root.data+rs:root.data+ls;
		}
}
