package Module2.Day10ArraysPrefixSum;

public class SumQqueries {
    /*
    Using brute force method
    TC : O(N*Q)
    SC: O(1)
     */
    public static void sumBruteForce(int[] A, int[][] Q){
        for (int[] query : Q) {
            int start = query[0];
            int end = query[1];
            int sum = 0;
            for(int i =start; i<=end; i++){
                sum += A[i];
            }
            System.out.println("Brute force method: " + sum);
        }

    }
    /*
    Using prefix sum approach
    TC : O(N+Q)
    SC: O(N)
     */
    public static void sumPrefixSum(int[] A, int[][] Q){
        int[] ps = new int[A.length];
        ps[0] = A[0];
        //prefix sum
        for(int i=1; i<A.length; i++){
            ps[i] = ps[i-1] + A[i];
        }
        //Calculate sum for Q queries
        for (int[] query : Q) {
            int start = query[0];
            int end = query[1];
            int sum = 0;
            if(start == 0){ //edge case
                sum = ps[end];
            }
            else{
                sum = ps[end]-ps[start-1];
            }
            System.out.println("Prefix sum array approach: " +sum);
        }

    }
    public static void main(String[] args) {
        int[] A = {-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};
        int[][] Q = {{1,3},{2,7},{4,8},{0,2}};
        sumBruteForce(A, Q);
        sumPrefixSum(A, Q);
    }
}
