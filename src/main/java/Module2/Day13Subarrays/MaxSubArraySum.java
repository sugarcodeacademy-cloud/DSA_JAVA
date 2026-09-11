package Module2.Day13Subarrays;

public class MaxSubArraySum {
    /*
    Time Complexity: O(N)
    Space Complexity: O(1)
     */
    static int KadanesAlgoSum(int[] A){
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int N = A.length;
        for(int i = 0; i<N; i++){
            sum = sum + A[i];
            if(sum > maxSum){
                maxSum = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return maxSum;
    }

    static int[] KadanesAlgoSubArray(int[] A){
        int[] ans = new int[2];
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int N = A.length;
        int start =0;
        int end = 0;
        int maxStart = 0;
        int maxEnd = 0;
        for(int i = 0; i<N; i++){
            if(sum == 0){
                start = i;
                end = i;
            }
            sum = sum + A[i];
            if(sum > maxSum){
                maxSum = sum;
                end = i;
                maxStart = start;
                maxEnd = end;
            }
            if(sum < 0){
                sum = 0;
//                if(i+1 < N){
//                    start = i+1;
//                    end = i+1;
//                }
            }
        }
//        return maxEnd-maxStart; length of max Subarray
        ans[0] = maxStart;
        ans[1] = maxEnd;
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {5,6,7,-3,2,-10,-12,8,12,21,-4,7};
        System.out.println("Kadanes Algorithm: "+ KadanesAlgo(arr));

    }
}
