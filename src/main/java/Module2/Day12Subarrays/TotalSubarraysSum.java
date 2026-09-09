package Module2.Day12Subarrays;

public class TotalSubarraysSum {
    public static void main(String[] args) {
        int[] A = {12, 13, -2, 4, 5};
        //output = 119, 59, 7, 13, 5
        int total = 0;
        for (int start = 0; start < A.length; start++) {//start
            int subarrayTotal = 0;
            for (int end = start; end < A.length; end++) { //all the ends for each start
                int sum = 0;
                for (int k = start; k <= end ; k++) {
                    sum += A[k];
                }
                System.out.println("sum of subarray starting at "+ start + " and ending at "+ end+" is "+ sum);
                subarrayTotal += sum;

            }
            System.out.println("-------------------------------------------------------");
            System.out.println("sum of all subarrays starting with index : " + start + " is :"+ subarrayTotal);
            System.out.println("-------------------------------------------------------");
            total += subarrayTotal;

        }
        System.out.println("Total : "+ total );
    }
}
