package Module2.Day17LinkedListBasics;

public class GenerateLinkedList {

    public static LinkNode createLL(int[] arr){
        LinkNode head = new LinkNode(arr[0]);
        LinkNode temp = head;

        for(int i=1; i<arr.length; i++){
            temp.next = new LinkNode(arr[i]);
            temp = temp.next;
        }
        return head;
    }
    public static void printLL(LinkNode head){
        //print the linked list
        LinkNode temp = head;
        while(temp != null){
            System.out.print(temp.val + "--->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
