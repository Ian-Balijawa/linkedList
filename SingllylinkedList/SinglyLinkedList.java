package LinkedList.SinglyLinkedList;

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

    // O(1) operation
    public void addFirst(E obj) {
        var newNode = new Node<E>(obj);
        // for an empty list or one element in list
        if (isEmpty()) {
            this.head = this.tail = newNode;
            currentSize++;
            return;
        }

        // Adding in a non-empty list
        newNode.next = this.head;
        this.head = newNode;
        currentSize++;
    }

    public void addLast(E obj) {
        var newNode = new Node<E>(obj);
        if (isEmpty())
            addFirst(obj);

        var tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }

        tmp.next = newNode;
        tail = newNode;
        currentSize++;
    }

    // O(1) constant time operation
    public E removeFirst() {
        if (isEmpty())
            return null;

        E obj = head.data; // first element data to be removed
        if (head.next == null) {
            head = null;
            currentSize--;
        } else {
            head = head.next; // point to the second node
            currentSize--;
        }
        return obj;
    }

    // O(n) linear time operation
    public E removeLast() {
        if (isEmpty())
            return null;
        if (head == tail)
            return removeFirst();

        Node<E> currentNode = head;
        Node<E> prev = null;
        while (currentNode != tail) {
            prev = currentNode;
            currentNode = currentNode.next;
        }
        prev.next = null;
        tail = prev;
        currentSize--;
        return currentNode.data;
    }

    public E remove(E obj) {
        Node<E> current = head, previous = null;
        while (current != null) {
            if (((Comparable<E>) obj).compareTo(current.data) == 0) {
                if (current == head)
                    return removeFirst();
                if (current == tail)
                    return removeLast();

                currentSize--;
                previous.next = current.next;
                return current.data;
            }

            previous = current;
            current = current.next;
        }
        return null;
    }

    public E peekFirst() {
        return isEmpty() ? null : head.data;
    }

    public E peekLast() {
        return isEmpty() ? null : tail.data;
    }

    public boolean contains(E obj) {
        Node<E> current = head;
        while (current != tail) {
            if (((Comparable<E>) obj).compareTo(current.data) == 0)
                return true;
            current = current.next;
        }
        return false;
    }

    private boolean isEmpty() {
        // but a better approach to avoid relying on the currentSize coz someone may
        // forget to increment it after adding a node
        return this.head == null && this.tail == null;
    }

    public E[] toArray() {
        E[] array = (E[]) new Object[this.currentSize];
        if (this.isEmpty())
            return array;
        Node<E> currentNode = this.head;
        Node<E> previousNode = null;
        int index = 0;
        while (currentNode != null) {
            previousNode = currentNode;
            array[index] = previousNode.data;
            currentNode = currentNode.next;
            index++;
        }
        return array;
    }

    public Object[] getNodes() {
        var array = new Object[this.currentSize];

        if (this.isEmpty())
            return array;
        Node<E> currentNode = this.head;
        Node<E> previousNode = null;
        int index = 0;
        while (currentNode != null) {
            previousNode = currentNode;
            array[index] = previousNode;
            currentNode = currentNode.next;
            index++;
        }
        return array;
    }

    public void reverseLinkedList() {
        // A single element linkedList and an empty linkedList is Already e
        if (this.isEmpty() || this.currentSize == 1)
            return;

        Node<E> currentNode = this.head;
        Node<E> prev = null;
        Node<E> nextNode = null;

        // creating secondary links
        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode = nextNode;
        }
        this.head = prev;
        this.tail = this.head;
    }

}
