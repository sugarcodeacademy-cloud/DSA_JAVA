package Module2.Day18LinkedList2;

import Module2.Day17LinkedListBasics.LinkNode;

public class GetKthElement {
    public static int getKthElement(LinkNode head, int K){
        LinkNode temp = head;
        int move = 1;
        while(move < K && temp.next != null){
            temp = temp.next;
            move++;
        }
        return temp.val;
    }
    public static void main(String[] args) {

        //create a LinkedList used for testing purpose
        int[] arr = {3,1,2,5,13,6,9};
        LinkNode head = new LinkNode(arr[0]);
        LinkNode temp = head;

        for(int i=1; i<arr.length; i++){
            temp.next = new LinkNode(arr[i]);
            temp = temp.next;
        }


        System.out.println(getKthElement(head, 13));





        //print the linked list
        while(head != null){
            System.out.print(head.val + "--->");
            head = head.next;
        }
        System.out.println("null");

    }
}
