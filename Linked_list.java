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
    public static int size;

    public void addFirst(int data) {
        // create the new node with value
        Node newNode = new Node(data);
        size++;

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
        size++;
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

    public void addMiddle(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        // newNode.next 9 = temp.next =3; connect 9->3
        temp.next = newNode;
        // temp.next is empty now but temp has value of 2
        // that is why temp.next 2 = newNode;
    }

    public int removeFirst() {
        // all logic is head= head.next
        // if head move to the next node head
        // then previous node is unreachable that is why is remove first
        if (size == 0) { // if size is 0 means already linklist is empty
            System.err.println("Linklist is empty now");
            return Integer.MIN_VALUE;
        } else if (size == 1) { // the size ==1 means head and tail point to only one node
            int val = head.data;
            // we send head data to val
            head = tail = null;
            // after that head and tail makes null
            size = 0;
            // size make 0
            return val;

        }
        // if size has like 3 or 4 yaa multiple node is present
        // than we use this logic
        int val = head.data;
        // just shift the head data to val
        head = head.next;
        // make the head as next node head
        // using head= head.next value
        size--;
        // size --;
        return val;
    }


    public int removeLast(){
        if(size==0){
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for(int i =0 ;i <size-2;i++ )
        {
            prev=prev.next;
        }
        
        int val = prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    public static void main(String args[]) {
        Linked_list ll = new Linked_list();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addMiddle(2, 9);
        ll.print();
        ll.removeFirst();
        System.err.println();
        ll.print();
        System.err.println();
        ll.removeLast();
        ll.print();
        System.err.println();
        System.err.println("Size of Linklist = " + size);

    }
}
