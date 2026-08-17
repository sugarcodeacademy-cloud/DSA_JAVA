package Functions;

public class Client {
    //Create a function and call as many times as required

    //FUNCTION WITHOUT PARAMETERS(PARAMS)
    static void addition(){
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("output1 :" + c );
    }

    //FUNCTION WITH PARAMETERS(PARAMS)
    static void addition2(int val1, int val2){
        int a = val1;
        int b = val2;
        int c = a + b;
        System.out.println("output2 :" + c );
    }
    //FUNCTION WITH PARAMETERS(PARAMS) WITH RETURN
    static int addition3(int val1, int val2){
        int a = val1;
        int b = val2;
        int c = a + b;
        return c; // return should be your last statement
        //System.out.println("Hello World"); // This  line of code is never executed
    }

    public static void main(String[] args) {
        BluePrint house1 = new BluePrint();

        house1.live();

//        ModelHouse.live();
        //
//        int a = 10;
//        int b = 20;
//        int c = a + b;
//        System.out.println("output :" + c );
//
//        int d = 10;
//        int e = 20;
//        int f = d + e;
//        System.out.println("output 2: "+ f);




//        addition();
//        addition();
//
//        addition2(30, 40);
//        addition2(50, 50);

        int output = addition3(40, 70);
        System.out.println("Hello world");
        System.out.println("Hi user");

        System.out.println("output: "+ output);
    }
}
