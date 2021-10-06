package src.com.LinkedList.DoublyLinkedList;

import java.util.Arrays;

public class LinkedListTest {

    public static void main(String[] args) {
        var linkedList = new DoublyLinkedList<Integer>();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(4);
        linkedList.addFirst(5);
        linkedList.addFirst(6);
        linkedList.removeLast();
        linkedList.addLast(6);
        linkedList.addLast(7);
        linkedList.addFirst(9);

        System.out.println(linkedList.contains(5));
        System.out.println(linkedList.contains(8));
        System.out.println(linkedList.peekFirst());
        System.out.println(Arrays.toString(linkedList.toArray()));
        System.out.println(Arrays.toString(linkedList.getNodes()));
        linkedList.reverseLinkedList();
        System.out.println(Arrays.toString(linkedList.getNodes()));
        System.out.println(linkedList.peekLast());

    }

}
