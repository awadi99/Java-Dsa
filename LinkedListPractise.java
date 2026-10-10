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
        public static int  size;
        

        // addFirst

        public void addNew (int data){
            Node newNode = new Node(data);
            size++;
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
            size++;
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

            size++;

            Node temp = head;
            int i =0 ;

            while(i < idx-1){
                temp=temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next=newNode;
        }

        // remove first

        public int removefirst (){
            if(size==0){
                System.err.println("LL is Empty");
                return Integer.MIN_VALUE;
            }
            if(size == 1){
                int val = head.data;
                head =tail =null;
                size --;
                return val;
            }
            int val = head.data;
            head= head.next;
            size --;
            return val;
        }

        // removeLast

        public int removeLast(){
            if(size==0){
                System.err.println("LL is empty");
                return Integer.MIN_VALUE;
            }
            if(size==1){
                int val =head.data;
                head=tail=null;
                size--;
                return val;
            }

            Node prev=head;
            for(int i =0;i<size-2;i++){
                prev=prev.next;
            }

            int val = prev.next.data;//tail data
            prev.next=null;
            tail=prev;
            size--;
            return val;
        }


        // search Linked List using Iterative

        public int itrSearch(int key){

            Node temp =head;
            for(int i = 0; i < size; i++){

                if(temp.data==key){
                    return i;
                }
                temp=temp.next;
            }
            return -1;
        }

        // search Recursive

        public int helperFun(Node head, int key){

            if(head == null){
                return -1;
            }

            if(head.data==key){
                return  0;
            }

            int idx = helperFun(head.next, key);

            if(idx==-1){
                return -1;
            }

            return idx+1;
        }


        public int searchRecursive(int key){
            return helperFun(head, key);
        }



        // reverse itr

        public void reverseItr(){
            Node prev =null; //before a head  all null;
            Node current = tail = head;
            Node next;

            while(current != null){
                next = current.next;
                current.next =prev;
                prev=current;
                current=next;
            }
            head = prev;
        }


        // print

        public void printList(){
            Node temp=head;
            while(temp!=null){
                System.err.print(" "+ temp.data+" ->");
                temp= temp.next;
            }
            System.err.print(" null");
        } 
        
        


    public static void main(String[] args) {
        LinkedListPractise llp = new LinkedListPractise();
        llp.addNew(3);
        llp.addNew(2);
        llp.addNew(1);

        // 
        llp.addLast(4);
        llp.addLast(5);
        llp.addLast(7);

        // add mid

        llp.addMid(2, 9);


        // print
        llp.printList();
        System.err.println();
        // removeFirst
        llp.removefirst();

        // print
        llp.printList();
        System.err.println();


        // removeLast
        llp.removeLast();


        // print
        llp.printList();
        System.err.println();
        // search
        System.err.print(" Search present = "+llp.itrSearch(4));




        // Reverse Itr 
        System.err.println();
        llp.reverseItr();
        llp.printList();

        System.err.println();
        System.err.println(" "+llp.size);
    }
}
 