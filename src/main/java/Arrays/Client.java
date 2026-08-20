package Arrays;

public class Client {
    public static void main(String[] args) {
        int[] arr = {1, 2, 34};
        int[] runs = {20, 10, 15, 30, 20, 12, 14, 12, 3, 2};
        int total = 0;
        for(int i=0; i<=9; i++){
//          total = total + runs[i];
            total += runs[i];
        }
        System.out.println(total);
    }
}
