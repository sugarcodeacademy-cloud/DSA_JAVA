package Module2.Day11ArraysCarryTwoPointer;

public class AGProblem {
    /*
  BRUTE FORCE TECHNIQUE
  Time Complexity is O(N^2)
  Space Complexity is O(1)
   */
    public static int bruteForce(char[] S) {
        int count = 0;
        for(int i=0; i<S.length; i++){
            if(S[i] == 'a'){
                for(int j= i+1; j<S.length; j++){
                    if(S[j] == 'g'){
                        count++;
                    }
                }
            }

        }
        return count;
    }
    /*
    CARRY FORWARD TECHNIQUE
    Time Complexity is O(N)
    Space Complexity is O(1)
     */
    public static int carryForward(char[] S) {
        int count = 0;
        int ans = 0;
        for(int i=S.length-1; i>=0; i--){
            if(S[i] == 'g'){
               count ++;
            }
            else if(S[i]=='a'){
                ans += count;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        char[] arr = {'a', 'd', 'g','a', 'g', 'a','g','f','g'};
        System.out.println("Brute force solution: "+bruteForce(arr));
        System.out.println("carry forward solution: "+carryForward(arr));
    }
}
