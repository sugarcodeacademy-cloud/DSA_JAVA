package Functions;
//Take one input from user, check if the input is odd or even
//If even show "EVEN number" , if odd show "ODD number"
public class EvenOdd {

    static void check(int num){ //eat
        if(num % 2 == 0){
            System.out.println("EVEN number");
        }
        else{
            System.out.println("ODD number");
        }
    }

//RETURN TRUE if even , return False if odd Only one return statement will be executed
//    static boolean check(int num){
//        if(num % 2 == 0){
//            System.out.println("EVEN number");
//            return true;
//        }
//        else{
//            System.out.println("ODD number");
//            return false;
//        }
//    }
    //Two return statements, there is a chance
//    static boolean divisbleBy6(int num){ //12
//        if(num % 2 == 0){ //true
//            System.out.println("Yes it is divisible by 2");
//            return true;
//        }
//        if(num % 7 == 0){ //false
//            System.out.println("Yes it is divisible by 3");
//            return false;
//        }
//    }


    public static void main(String[] args) { //sleep
//        boolean even = check(32);
//        boolean odd = check(71);
//        System.out.println(even);
//        System.out.println(odd);

        EvenOdd.check(32);
        int a = 10;
        int b =10;
        System.out.println(a+b);
    }
}
