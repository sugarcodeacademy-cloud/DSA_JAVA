package Module2.Day12Subarrays;

public class PrintSubarrays {
    public static void main(String[] args) {
        int[] A = {12, 13, -2, 4, 5};
        for (int start = 0; start < A.length; start++) {
            for (int end = start; end < A.length; end++) {
                for (int k = start; k <= end ; k++) {
                    System.out.print(A[k] + ",");
                }
                System.out.println();
            }
        }
    }
}
