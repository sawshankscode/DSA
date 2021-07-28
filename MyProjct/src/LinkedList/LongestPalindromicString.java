package LinkedList;


 class Block{
	int data; Block next;
	public Block(int data) {
		this.data=data;
		
	}
}
public class LongestPalindromicString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Block head = new Block(2);
		    head.next = new Block(4);
		    head.next.next = new Block(3);
		    head.next.next.next = new Block(4);
		    head.next.next.next.next = new Block(2);
		    head.next.next.next.next.next = new Block(15);
		 
		    System.out.println(lps(head));
	}

	private static int  lps(Block head) {
		
		int res=0;
		Block curr=head,prev=null;
		
		while(curr!=null) {
			Block next=curr.next;
			curr.next=prev;
			
			res=Math.max(res, cntCommon(next,prev)+1); //for odd length palindrome
			res=Math.max(res, cntCommon(curr,next));   //for even length palindorme
			
			prev=curr;
			curr=next;
		}
		return res;
	}

	private static int cntCommon(Block a, Block b) {
		int cnt=0;
		for(; a!=null && b!=null;a=a.next,b=b.next) {
			if(a.data==b.data)
				cnt++;
			else
				break;
		}
		return 2*cnt;
	}
	

}
