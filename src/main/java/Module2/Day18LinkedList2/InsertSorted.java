package Module2.Day18LinkedList2;

import Module2.Day17LinkedListBasics.GenerateLinkedList;
import Module2.Day17LinkedListBasics.LinkNode;

public class InsertSorted {
    public static LinkNode insertSorted(LinkNode head, int ele) {
        LinkNode dummy = new LinkNode(100);
        dummy.next = head;
        LinkNode temp = dummy;
        LinkNode newNode = new LinkNode(ele);
        while(temp.next != null && temp.next.val < ele){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return dummy.next;
    }
    public static void main(String[] args) {
            int[] arr = {3, 5, 13, 17, 18, 23, 40, 45};
            LinkNode head = GenerateLinkedList.createLL(arr);


            System.out.print("Before Inserting the node in the sorted Linked List:  ");
            GenerateLinkedList.printLL(head);


            System.out.print("Before Inserting the node in the sorted Linked List:  ");
            GenerateLinkedList.printLL(insertSorted(head, 30));


            System.out.print("Inserting the node at the head in the sorted Linked List:  ");
            GenerateLinkedList.printLL(insertSorted(head, 1));


    }
}
