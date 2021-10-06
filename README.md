Linked list implementation in java

# Linked List

Linked List is a linear data structure and it is very common data structure which consists of group of nodes in a sequence which is divided in two parts.
Each node consists of its own data and the address of the next node and forms a chain. Linked Lists are used to create trees and graphs.

<p align="center">
<img src="http://www.studytonight.com/data-structures/images/linked-list-1.png"?raw="true">
</p>

### Advantages of Linked Lists

-   They are a dynamic in nature which allocates the memory when required.
-   Insertion and deletion operations can be easily implemented.
-   Stacks and queues can be easily executed.
-   Linked List reduces the access time.

### Disadvantages of Linked Lists

-   The memory is wasted as pointers require extra memory for storage.
-   No element can be accessed randomly; it has to access each node sequentially.
-   Reverse Traversing is difficult in linked list.

### Applications of Linked Lists

-   Linked lists are used to implement stacks, queues, graphs, etc.
-   Linked lists let you insert elements at the beginning and end of the list.
-   In Linked Lists we don’t need to know the size in advance.

## Types of Linked Lists

-  **Singly Linked List** : Singly linked lists contain nodes which have a data part as well as an address part i.e. next, which points to the next node in sequence of nodes. The operations we can perform on singly linked lists are insertion, deletion and traversal.

# singly linked java class implementation

````java

    public class SinglyLinkedList<E> {
    class Node<E> {
        E data;
        Node<E> next; // pointer to the next node in the list

        public Node(E obj) {
            this.data = obj;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node of Value = " + this.data;
        }

        @Override
        public boolean equals(Object obj) {
            return this.data == ((Node<E>) obj).data;
        }
    }

    // Create the head pointer i.e the start of the list
    private Node<E> head;
    // And an optional tail pointer to improve addLast and removeLast
    private Node<E> tail;

    // O(1) used for getting the size of the list instead of counting in linear time
    private int currentSize;

    public SinglyLinkedList() {
        this.head = this.tail = null;
        this.currentSize = 0;
    }
    ... more method implementation ...

    ```

-   **Doubly Linked List :** In a doubly linked list, each node contains two links the first link points to the previous node and the next link points to the next node in the sequence.

# singly linked java class implementation

```java

public class DoublyLinkedList<E> {
    class Node<E> {
        E data;
        Node<E> next; // pointer to the next node in the list
        Node<E> previous;

        public Node(E obj) {
            this.data = obj;
            this.next = this.previous = null;
        }

        @Override
        public String toString() {
            return "Node of Value = " + this.data;
        }

        @Override
        public boolean equals(Object obj) {
            return this.data == ((Node<E>) obj).data;
        }
    }

    // Create the head pointer i.e the start of the list
    private Node<E> head;
    // And an optional tail pointer to improve addLast and removeLast
    private Node<E> tail;

    // O(1) used for getting the size of the list instead of counting in linear time
    private int currentSize;

    public DoublyLinkedList() {
        this.head = this.tail = null;
        this.currentSize = 0;
    }

    ... more method implementation ...

````

-   **Circular Linked List :** In the circular linked list the last node of the list contains the address of the first node and forms a circular chain.
<p align="center">
<img src="http://www.studytonight.com/data-structures/images/linked-list-circular.png"?raw="true">
</p>

### Collected From

www.studytonight.com

```

```
