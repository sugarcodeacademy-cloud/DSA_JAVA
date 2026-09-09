package Module2.Day12Subarrays;

public class MaxSubarraySum {
    static int maxSubarraySumV1(int[] A){
        /*
        Time Complexity : O(N^3)
        Space Complexity : O(1)
         */

        int max = Integer.MIN_VALUE;
        for (int start = 0; start < A.length; start++) {
            for (int end = start; end < A.length; end++) {
                int subarraySum = 0;
                for (int k = start; k <= end ; k++) {
                    subarraySum += A[k];
                }
                if(subarraySum > max){
                    max = subarraySum;
                }
            }
        }
        return max;
    }
    static int maxSubarraySumV2(int[] A){
        /*
        Time Complexity : O(N^2)
        Space Complexity : O(1)
         */

        int max = Integer.MIN_VALUE;
        for (int start = 0; start < A.length; start++) {
            int subarraySum = 0;
            for (int end = start; end < A.length; end++) {
                subarraySum += A[end];
                if(subarraySum > max){
                    max = subarraySum;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {12, 13, -2, 4, 5};
//        int [] arr = {-2, -3, -4}; edge case
//        System.out.println( "maxSubarraySumV1 : " + maxSubarraySumV1(arr));
        System.out.println( "maxSubarraySumV2 : " + maxSubarraySumV2(arr));
    }
}
