import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class alsecondlargestelement {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //ArrayList <Integer> al= new ArrayList<>();
    LinkedList <Integer> al = new LinkedList<>();
    int n = sc.nextInt();
    for(int i=0;i<n;i++){
        al.add(sc.nextInt());
    }
    Collections.sort(al);
    int e = al.get(n-2);
    System.out.println(e);
}
}
