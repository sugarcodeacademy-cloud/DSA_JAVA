package Module2.Day11ArraysCarryTwoPointer;

public class Leader {
    public static int bruteFoce(int[] A) {
        int count =0;
        for(int i=0; i<A.length; i++){
            boolean flag = false;
            for (int j = i+1; j < A.length; j++) {
                if(A[i] <= A[j]){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                count++;
            }
        }
        return count;
    }

    public static int carryFoward(int[] A) {
        int count = 1;
        int max = A[A.length-1];
        for(int i=A.length-2; i>=0 ; i--){
            if(A[i] > max){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {15, -1, 7, 2, 5, 4, 2, 3};
        System.out.println("Brute force solution: "+bruteFoce(arr));
        System.out.println("Carry Forward Solution : "+carryFoward(arr));
    }
}
