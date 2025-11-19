public class Linked_list {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        // create the new node with value
        Node newNode = new Node(data);
        // check the value is empty or not if the value is empty
        // the head and tail point to same node
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // point the new node next to previous head
        // new node join the previous node
        newNode.next = head;
        // shfit the head to new node
        head = newNode;
    }

    public void addLast(int data) {
        // create the new node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // shfit the tail pointer to new next node
        // join the previous node to new node
        tail.next = newNode;
        // make new node as last tail node
        tail = newNode;
    }

    public void print() {
        // create Node Temp for store the head data

        Node temp = head;
        if (temp == null) {
            return;
        }
        while (temp != null) {
            System.err.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.err.print("Null ");
    }

    public static void main(String args[]) {
        Linked_list ll = new Linked_list();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();

    }
}
