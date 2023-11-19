import java.util.*;
public class alfreqofelement {
    public static void main(String[] args) {
        //ArrayList al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        //ArrayList <String> ll = new ArrayList<>();
        LinkedList <String> ll = new LinkedList<>();
        for(int i=0;i<5;i++){
        ll.add(sc.nextLine());
        }
        //System.out.println(al);
        //Iterator <Integer> i = al.iterator();
        //while(i.hasNext()){
        //    System.out.println(i.next());
        //}
        Set<String>d= new HashSet<>(ll);
        for(String s: d){
            System.out.println(s + ": " + Collections.frequency(ll, s));
        }
    }
}
