package Module2.Day12Subarrays;

public class SumSubarray {
    static void sumSubarrayV1(int[] A){
        for (int start = 0; start < A.length; start++) {
            for (int end = start; end < A.length; end++) {
                int sum = 0;
                for (int k = start; k <= end ; k++) {
                    sum += A[k];
                }
                System.out.print(sum + " ,");
            }
        }
        System.out.println();
    }
    static void sumSubarrayV2(int[] A){

    }
    public static void main(String[] args) {
        int[] arr = {12, 13, -2, 4, 5};
        System.out.println("--------------------------------------------");
        System.out.println("sumSubarrayV1");
        sumSubarrayV1(arr);
        System.out.println("--------------------------------------------");
    }
}
