//import java.net.SocketTimeoutException;
import java.util.*;
import java.util.Collections;
public class arraylist {
    static void linkedlistmethods(){
        LinkedList<Integer> ll = new LinkedList<>();
         
    }
    static void stack1(){
        Stack<String>s=new Stack<>();
         s.push("o");
         s.push("kl");
         System.out.println(s.peek());
         System.out.println(s.pop());
         System.out.println(s.peek());
         System.out.println(s.size());
         System.out.println(s.empty());
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(3);
        list.add(8);

        System.out.println(list);
        int element = list.get(1);
        System.out.println(element);

        list.add(1,1);
        System.out.println(list);

        list.set(0,5);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        int size = list.size();
        System.out.println(size);

        System.out.println(list.contains(10));


        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        Collections.sort(list);
        System.out.println(list);

        stack1();
    }
}
