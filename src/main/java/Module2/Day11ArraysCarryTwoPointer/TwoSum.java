package Module2.Day11ArraysCarryTwoPointer;

public class TwoSum {
    public static boolean bruteForce(int[] A,int K) {
        for (int i = 0; i < A.length; i++) {
            for (int j = i+1; j < A.length; j++) {
                if (A[i] + A[j] == K) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean twoPointer(int[] A,int K) {
        int i = 0;
        int j = A.length -1;
        while (i < j){
            if(A[i] + A[j] == K){
                return true;
            }
            else if(A[i] + A[j] < K){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {-1, 2, 4, 5, 7, 8, 10};
        int K = 11;
        System.out.println("Brute Force Solution: "+ bruteForce(arr, K));
        System.out.println("Two Pointer Approach: "+ twoPointer(arr, K));
    }
}
