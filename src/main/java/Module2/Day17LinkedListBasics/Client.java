package Module2.Day17LinkedListBasics;

public class Client {
    public static void main(String[] args) {
        //default constructor
//        Node node1 = new Node();
//        node1.val = 5;

        //customized constructor
//        LinkNode linkNode1 = new LinkNode(5);
//        LinkNode linkNode2 = new LinkNode(6);
//        linkNode1.next = linkNode2;
//        LinkNode linkNode3 = new LinkNode(12);
//        linkNode2.next = linkNode3;
//        LinkNode linkNode4 = new LinkNode(-10);
//        linkNode3.next = linkNode4;
//        LinkNode linkNode5 = new LinkNode(100);
//        linkNode4.next = linkNode5;
//
//        System.out.println(linkNode1.val);
//        System.out.println(linkNode1.next.val);
//        System.out.println(linkNode2.next.val);
//        System.out.println(linkNode3.next.val);
//        System.out.println(linkNode4.next.val);

        /*
        The above code has repetitive code
        verbose code
         */

//        LinkNode linkNode1 = new LinkNode(15); //n1
//        linkNode1.next = new LinkNode(6); //n2
//        linkNode1.next.next = new LinkNode(12); //n3
//        linkNode1.next.next.next = new LinkNode(-10); //n4
//        //n5 is null
//        linkNode1.next.next.next.next.next = new LinkNode(100); //n6

        /*
        Tha above is prone to errors because there is no error shown during compile code if any next node is null
        It shows up only during run time
         */

        int[] arr = {15, 6, 12, -10, 100, 14};
        LinkNode head = new LinkNode(arr[0]);
        LinkNode temp = head;
//        for(int i=1; i<arr.length; i++){
//            head.next = new LinkNode(arr[i]);
//        }

        for(int i=1; i<arr.length; i++){
            temp.next = new LinkNode(arr[i]);
            temp = temp.next;
        }





















        //print the linked list
        while(head != null){
            System.out.print(head.val + "--->");
            head = head.next;
        }
        System.out.println("null");

    }
}
