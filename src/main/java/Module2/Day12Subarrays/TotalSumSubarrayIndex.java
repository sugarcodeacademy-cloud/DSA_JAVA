package Module2.Day12Subarrays;

public class TotalSumSubarrayIndex {
    public static void main(String[] args) {
        int[] A = {12, 13, -2, 4, 5};
        //output = 119, 59, 7, 13, 5
        int count = 0;
        for (int start = 0; start < A.length; start++) {//start
            int total = 0;
            for (int end = start; end < A.length; end++) { //all the ends for each start
                int sum = 0;
                for (int k = start; k <= end ; k++) {
                    sum += A[k];
                }
                total += sum;
            }
            count ++;
            System.out.println("subarray sum: "+ total + " count: " + count);
        }
    }
}
