
public class linkedlist {
    Node head = null;
    Node tail = null;
    void insertAtEnd(int val){
        Node temp = new Node(val);
        if(head==null){
            head=temp;
        }
        else{
            tail.next=temp;6
            tail=temp;
        }
        //tail=temp;
    }
    public static int length(Node head){
        int count = 0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }
    public static void displayreverse(Node head){
        if(head==null) return; 
        displayreverse(head.next);
        System.out.print(head.data+" ");    
        }
    public static void displayrecursively(Node head){
        if(head==null) return;
        System.out.print(head.data+" ");  
        displayrecursively(head.next);   
        }/* */
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static class Node{
        int data; //value
        Node next; //address of next node
        Node(int data){
            this.data=data;  
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        //System.out.println(a.data);
        //System.out.println(a);
         //System.out.println(a.next);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        //Node temp = a;
        //System.out.println(temp.data);
        //for(int i=1;i<=5;i++){
         //   System.out.print(temp.data +" ");
         //   temp = temp.next;
        //}
        display(a);
        System.out.println();
        displayrecursively(a);
        System.out.println();
        displayreverse(a);
        System.out.println();
        System.out.println(length(a));
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.display(a);
    }
}