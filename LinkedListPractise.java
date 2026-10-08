public class LinkedListPractise {
    public static class Node {
        int data;
        Node next;


        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
        public static Node head;
        public  static Node tail;
        

        // addFirst

        public void addNew (int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail =newNode;
                return;
            }
            newNode.next = head;
            head=newNode;
        }

        // addLast

        public void addLast (int data){
            Node newNode = new Node(data);
            if(head ==null){
                head = tail = newNode;
                return ;
            }
            tail.next = newNode;
            tail = newNode;
        }


        // add mid

        public void addMid (int idx, int data){
            if(idx==0){
                addNew(data);
                return;
            }
            Node newNode = new Node(data);
            Node temp = head;
            int i =0 ;

            while(i < idx-1){
                temp=temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next=newNode;
        }

        
        // print

        public void printList(){
            Node temp=head;
            while(temp!=null){
                System.err.print(" "+ temp.data);
                temp= temp.next;
            }
        } 
        
        


    public static void main(String[] args) {
        LinkedListPractise llp = new LinkedListPractise();
        llp.addNew(3);
        llp.addNew(2);
        llp.addNew(1);

        // 
        llp.addLast(4);
        llp.addLast(5);
        llp.addLast(6);

        // add mid

        llp.addMid(2, 9);


        // print

        llp.printList();
    }
}
 