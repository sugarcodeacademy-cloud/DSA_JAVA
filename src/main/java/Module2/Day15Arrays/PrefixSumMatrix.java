package Module2.Day15Arrays;

public class PrefixSumMatrix {
    static int[][] calculatePrefixMatrix(int[][] A){
        int N = A.length;
        int M = A[0].length;
        int[][] pf = new int[N][M];
        //intiialize the first row to prefix matrix
        for(int i =0; i<M; i++){
            pf[0][i] = A[0][i];
        }
        //Row wise
        for(int i =1; i<N; i++){
            for (int j = 0; j < M; j++) {
                pf[i][j] = pf[i-1][j] + A[i][j];
            }
        }
        for(int i =0; i<N; i++){
            for (int j = 1; j < M; j++) {
                pf[i][j]  = pf[i][j-1] + pf[i][j];
            }
        }
        //col wise


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(pf[i][j] + ",");
            }
            System.out.println();
        }
        return pf;
    }
    public static void main(String[] args) {
        int[][] arr = {
                {-3,8,-2,-1,10},
                {2,5,2,5,7},
                {5,3,2,-1,-10},
                {-1,8,-9,4,-6},
                {4,10,-3,2,-6},
                {2,-1,6,3,-4}
        };
        int[][] resultPF = calculatePrefixMatrix(arr);
        //calculate the sum of submatrix from (2,1) to (4,3)
//        int sum = 0;
//        for (int i = 2; i <=4 ; i++) {
//            for (int j = 1; j <=3; j++) {
//                sum += arr[i][j];
//
//            }
//        }
//        System.out.println(sum);
        /*
        pf[a2][b2] - pf[a1-1][b2] -pf[a2][b1-1] + pf[a1-1][b1-1]
        calculate the sum of submatrix from (2,1) to (4,3)
            a1= 2, b1 = 1, a2 = 4, b2 = 3
         */
        System.out.println(resultPF[4][3] - resultPF[1][3]- resultPF[4][0] + resultPF[1][0]);
    }

}
