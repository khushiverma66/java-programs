import java.util.*;
public class mapinterface {
    static void hashmap(){
        HashMap <Integer, String> mp = new HashMap<>();
        mp.put(3,"aman");
        mp.put(1,"rohan");
        mp.put(2,"ram");
        mp.put(1, "priya");
        mp.putIfAbsent(2, "shila");
        System.out.println(mp);
        System.out.println(mp.get(2));
        System.out.println(mp.containsKey(4));
        System.out.println(mp.containsValue("ram"));
        System.out.println(mp.isEmpty());
        System.out.println(mp.entrySet());
        System.out.println(mp.keySet());
        System.out.println(mp.values());

        for(Integer i:mp.keySet()){
            System.out.print(i);
        }
        
        System.out.println();

        for(String i:mp.values()){
            System.out.print(i);
        }

        System.out.println();

        for(var e:mp.entrySet()){
            System.out.print(e);
        }

    }
    public static void main(String[] args) {
        hashmap();
    }
}
