package codility.timecomplexity.permmissingelem;

import java.util.Arrays;

public class Solution {
	
	public int solution(int[] A) {
		if(A == null){
			return 0;
		}
		long arraySum = Arrays.stream(A).asLongStream().sum();
		long N = A.length+1;
		long expectedSum = (N*(N+1))/2;
        return (int)(expectedSum-arraySum);
    }
}
