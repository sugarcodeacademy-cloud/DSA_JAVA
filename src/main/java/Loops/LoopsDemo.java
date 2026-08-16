package Loops;

public class LoopsDemo {

    public static void main(String[] args) {
        // This a single line comment

        /*
            This is
            a multi line
            comment
         */

        /*
            *****
            *****
            *****
            *****
            *****
         */

//        System.out.println("*****");
//        System.out.println("*****");
//        System.out.println("*****");
//        System.out.println("*****");
//        System.out.println("*****");

//        for(int i = 1; i<= 5; i++){
//            for(int j= 1; j<=5 ; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*
         *****
         ****
         ***
         **
         *
         */

//        for(int i=1; i<=5; i++){ // i - 1-> 2->3-> 4-> 5
//            for(int j=i; j<=5; j++){ //1->5 - 5 times 2->5 // 4times 3->5//3times 4->5//2times 5->5//1 time 6->5//break
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*
         *
         **
         ***
         ****
         *****
         */

        for(int i=5; i>=1; i--){ // i - 5->4->3->2->1->0(exit)
            //5->5 - 1 time 4->5 // 2times 3->5//3times 2->5//4times 1->5//5 times 0->5//6times(break)
            for(int j=i; j<=5; j++){

                System.out.print("*");
            }
            System.out.println();
        }

    }
}
