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

        // company problem remove the nth Node


        public void removeNth (int n){
        
            int sz =0;
            Node temp = head;
            while (temp != null){
                temp = temp.next;
                sz++;
            }

            if(n==sz){
                head = head.next;
                return;
            }

            Node prev = head;

            
            for(int i =1; i<sz-n; i++){
                prev=prev.next;
            }
            prev.next=prev.next.next;
            return;
        }


        //  leetcode  palindrome

        public Node findMid (Node head){
            Node slow = head;
            Node fast =head;
            while(fast != null && fast.next != null ){
                slow=slow.next;  // slow +1;
                fast = fast.next.next; // fast + 2
            }
            return slow;
        }

        public boolean checkPalindrome(){
            if(head == null && head.next!=null){
                return true;
            } 

            Node midNode = findMid(head);

            Node prev = null;
            Node currtent = midNode;
            Node next;

            while(currtent != null){
                next = currtent.next;
                currtent.next=prev;
                prev=currtent;
                currtent=next;
            }
            

            Node right = prev;
            Node left = head;

            while(right !=null){
                if(left.data != right.data){
                    return false;
                }
                left=left.next;
                right=right.next;
            }

            return true;
        }





        // 92. Reverse Linked List II
        

        //Given the head of a singly linked list and two integers left and right 
        // where left <= right, reverse the nodes of the list from position 
        // left to position right, and return the reversed list.



        public Node reverseBetween (/*Node head*/ int left ,int right){

            if (head==null || head.next==null){
                return head;
            }
            
            Node dummy = new Node(0);
            dummy.next= head;

            Node prev = dummy;

            for(int i=1; i< left; i++){
                prev=prev.next;
            }

            Node current = prev.next;

            for(int i =1; i<=right-left; i++){

                Node temp = prev.next;
                prev.next=current.next;
                current.next= current.next.next;
                prev.next.next= temp;
            }

            return dummy.next;
        }




        // 83. Remove Duplicates from Sorted List
        // Given the head of a sorted linked list,
        //  delete all duplicates such that each element appears only once. 
        // Return the linked list sorted as well.

        public Node deleteDuplicates(){

            if(head !=null || head.next ==null){
                return head;
            }
            Node current = head;

            while(current !=null && current.next != null){
                if(current.data == current.next.data){
                    current.next=current.next.next;
                }
                else{
                    current=current.next;
                }
            }
            return head;
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


        // company problem remove nth element of node

        llp.removeNth(3);
        System.err.println();
        llp.printList();
        System.err.println();
        System.err.println(" "+llp.size);




        System.err.println(llp.deleteDuplicates());
    }
}
 