import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class queue{
      static void queueexamples(){
        LinkedList<Integer>q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.size());
        System.out.println(q);
      }
      static void priorityqueue(){
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        PriorityQueue<Integer>pqc=new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(10);
        pq.add(2);
        pq.add(4);
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.peek());

        pqc.add(10);
        pqc.add(2);
        pqc.add(4);
        System.out.println(pqc.peek());
        System.out.println(pqc);
        System.out.println(pqc.poll());
        System.out.println(pqc.peek());
      }
      static void dequeue(){
         //ArrayDeque<Integer> d = new Deque<>();
         Deque<Integer> dq = new ArrayDeque<>();
         dq.addFirst(1);
         dq.addFirst(2); 
         dq.addLast(3);
         dq.addLast(4);
         System.out.println(dq);
         System.out.println(dq.pollFirst());
         System.out.println(dq.pollLast());
         System.out.println(dq);
      }
    public static void main(String[] args) {
        queueexamples();
        priorityqueue();
        dequeue();
    }
}