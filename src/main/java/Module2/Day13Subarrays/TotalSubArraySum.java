package Module2.Day13Subarrays;
/*
Calculate the total sum of all sub arrays
 */
public class TotalSubArraySum {
    /*
        Time Complexity: O(N)
        Space Complexity : O(1)
     */
    static int contributionTechnique(int[] arr){
        int N = arr.length;
        int total = 0;
        for(int i =0; i<N; i++){
            int noOfStarts = i+1;
            int noOfEnds = N-i;
            int contribution = arr[i] * noOfStarts * noOfEnds;
            total += contribution;
        }
        return total;

    }

    public static void main(String[] args) {
        int[] A = {12, 13, -2, 4, 5};
        System.out.println("Total Sum : " + contributionTechnique(A));
    }
}
