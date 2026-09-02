package Module2.Day10ArraysPrefixSum;

public class AscendingOrder {
    public static void solve(int[] A, int[][] Q) {
        int[] ps = new int[A.length];
        ps[0] = 0;
        //prefix sum
        for(int i=1; i<A.length; i++){
            if(A[i] > A[i-1]){
                ps[i] = ps[i-1] + 1;
            }
            else{
                ps[i] = ps[i-1];
            }
        }
        for (int[] query : Q) {
            int start = query[0];
            int end = query[1];
            if(ps[end]-ps[start] == end - start) {
                System.out.println("[" +start + "," + end + "] is increasing");
            }
            else{
                System.out.println("[" +start + "," + end + "] is not increasing");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {-3, 0, 2, 1, 7, 10, 3, 11, 13};
        int[][] queries = {{0,2},{2,8},{5,7},{3,5}};
        solve(arr, queries);
    }
}
