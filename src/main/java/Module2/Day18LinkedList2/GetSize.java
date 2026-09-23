package Module2.Day18LinkedList2;

import Module2.Day17LinkedListBasics.GenerateLinkedList;
import Module2.Day17LinkedListBasics.LinkNode;

public class GetSize {
    public static int getSize(LinkNode head){
        int size = 1;
        LinkNode temp = head;
        while(temp.next != null){
            temp = temp.next;
            size++;
        }
        return size;
    }
    public static void main(String[] args) {
        //create a LinkedList used for testing purpose
        int[] arr = {3,1,2,5,13,6,9, 100, 22, 33, 433, 54, 123};
        LinkNode head = GenerateLinkedList.createLL(arr);
        GenerateLinkedList.printLL(head);

        //print the size of the linked list
        System.out.println("size of the linked list 1: "+ getSize(head));

        int[] arr2 ={-3,-4, -5, -6, -7, 23, 44};
        LinkNode head2 = GenerateLinkedList.createLL(arr2);
        GenerateLinkedList.printLL(head2);
        System.out.println("size of the linked list 2: "+ getSize(head2));
    }
}
