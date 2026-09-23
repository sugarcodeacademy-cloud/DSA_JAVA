package Module2.Day18LinkedList2;

import Module2.Day17LinkedListBasics.GenerateLinkedList;
import Module2.Day17LinkedListBasics.LinkNode;

public class DeleteElement {
    public static LinkNode delete(LinkNode head, int pos){
        LinkNode temp = head;
        //delete at start
        if(pos == 0){
            head = head.next;
            temp.next = null;
            return head;
        }
        //in-between or end
        else{
            int count = 1;
            while(count < pos && temp.next != null){
                temp = temp.next;
                count++;
            }
            if(temp.next != null) {
                temp.next = temp.next.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,5,13,6,9};
        LinkNode head = GenerateLinkedList.createLL(arr);
        System.out.print("Before deleting node: ");
        GenerateLinkedList.printLL(head);

        LinkNode newHead = delete(head, 0);
        System.out.print("After deleting the node: ");
        GenerateLinkedList.printLL(newHead);
    }
}
