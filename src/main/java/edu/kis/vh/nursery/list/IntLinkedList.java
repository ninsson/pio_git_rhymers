package edu.kis.vh.nursery.list;

/**
 * This class represents a linked list of integers.
 */
public class IntLinkedList {

    private static final int DEFAULT_RETURN_VALUE = -1;
    Node last;
    int i;

    /**
     * Pushes an integer onto the list.
     * @param i the integer to push
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * Checks if the list is empty.
     * @return true if the list is empty, false otherwise
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Checks if the list is full.
     * @return false always, as the list is never full
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Returns the top value of the list.
     * @return the top value, or DEFAULT_RETURN_VALUE if the list is empty
     */
    public int top() {
        if (isEmpty())
            return DEFAULT_RETURN_VALUE;
        return last.getValue();
    }

    /**
     * Pops the top value from the list.
     * @return the top value, or DEFAULT_RETURN_VALUE if the list is empty
     */
    public int pop() {
        if (isEmpty())
            return DEFAULT_RETURN_VALUE;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    private class Node {

        private final int value;
        private Node prev;
        private Node next;

        /**
         * Constructs a new node with the given value.
         * @param i the value of the node
         */
        public Node(int i) {
            value = i;
        }

        /**
         * Returns the value of the node.
         * @return the value of the node
         */
        public int getValue() {
            return value;
        }

        /**
         * Returns the previous node.
         * @return the previous node
         */
        public Node getPrev() {
            return prev;
        }

        /**
         * Sets the previous node.
         * @param prev the previous node
         */
        public void setPrev(Node prev) {
            this.prev = prev;
        }

        /**
         * Returns the next node.
         * @return the next node
         */
        public Node getNext() { return next; }

        /**
         * Sets the next node.
         * @param next the next node
         */
        public void setNext(Node next) {
            this.next = next;
        }
    }
}
