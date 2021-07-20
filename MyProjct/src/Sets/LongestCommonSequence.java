package Sets;

public class LongestCommonSequence {
	class Subseq { 
		static int findLongestConseqSubseq(int[] arr, int n) {
		    Set<integer> set = new HashSet<>();
		    for (int a : arr) set.add(a);
		    int max = 0;
		    for (int a : arr) {
		        if (!set.contains(a - 1)) {
		            int count = 0, k = a;
		            while (set.contains(k++)) count++;
		            max = Math.max(max, count);
		        }
		    }
		    return max;
		}
	}


}
