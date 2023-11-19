import java.util.*;
public class ll {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    //methods

    public void addFirst(int data){
        //step1 = create new node
        Node newNode = new Node(data);
        size++;

        if(head==null)//mtlb kuch h hi ni node 
        {
            head = tail = newNode;
            return;
        }

        //step2 = newNode next = head
        newNode.next = head;

        //step3 = head = newNode
        head = newNode;
    } 
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null || tail == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print(){
        // Node temp = head;
        // if(head == null){
        //     System.out.println("LL is empty");
        //     return;
        // }
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data + "");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void addinmid(int idx,int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public int removeFirst() {
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = tail.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev : i = size-2;
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data; //tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val; 
    }

    public int itrSearch(int key){
        Node temp = head;
        int i = 0;

        while(temp != null){
            if(temp.data == key){
                return i; //key found
            }
            temp = temp.next;
            i++;
        }
        return -1; //not found
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthfromEnd(int n){
        //to calculate size
        //ll.size();
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        if(n == sz){
            head = head.next; //remove first
            return;
        }
        //sz-n
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        } 
        prev.next =  prev.next.next;
        return;
    }

    
    public static void main(String[] args) {
        //LinkedList <Integer> ll = new LinkedList<>();
        //LinkedList ll = new LinkedList();
        ll ll = new ll();
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.addinmid(2,3);
        // ll.print(); //1,2,3,4,5
        // //System.out.println(ll);
        // //System.out.println(ll.size);
        // ll.removeFirst();
        // ll.print();

        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);

        // System.out.println(ll.itrSearch(3));
        // System.out.println(ll.itrSearch(10));
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addinmid(2,3);

        ll.print();
        // ll.reverse();
        // ll.print();

        ll.deleteNthfromEnd(3);
        ll.print();
    }
}
