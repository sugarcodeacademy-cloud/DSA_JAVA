package Module2.Day10ArraysPrefixSum;

public class EquilibriumIndex {
    public static boolean solve(int[] A) {
        int[] ps = new int[A.length];
        ps[0] = A[0];
        //prefix sum
        for(int i=1; i<A.length; i++){
            ps[i] = ps[i-1] + A[i];
        }
        for(int i =0; i<A.length; i++){
            int sumLeft=0;
            if(i != 0){
                sumLeft = ps[i-1];
            }
            int sumRight = ps[A.length-1]-ps[i];
            if(sumLeft == sumRight){
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int[] arr = {-7,1,5,2,-4,3,0};
        System.out.println("Equilibrium Index: " + solve(arr));
    }
}
