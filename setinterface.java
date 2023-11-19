import java.util.*;
public class setinterface {
    static void hashset(){
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(48);
        hs.add(89);
        hs.add(15);
        System.out.println(hs);
        hs.add(1);
        hs.add(2);
        hs.add(3);
        System.out.println(hs);
        hs.remove(2);
        System.out.println(hs.contains(3));
        System.out.println(hs.size());

    }
    static void LinkedHashSet(){
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(1);
        lhs.add(2);
        lhs.add(3);
        lhs.add(48);
        lhs.add(89);
        lhs.add(15);
        System.out.println(lhs);
    }
    static void Treeset(){
        TreeSet <Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(48);
        ts.add(89);
        ts.add(15);
        System.out.println(ts);
    }
    public static void main(String[] args) {
        hashset();
        LinkedHashSet();
        Treeset();
    }
}
