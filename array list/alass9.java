import java.util.*;
public class alass9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> al = new ArrayList<>();
        int n = sc.nextInt();
        //System.out.println(al);
        for(int i=0;i<n;i++){
            al.add(sc.nextInt());
        }
        System.out.println(al);
        Integer array[]= new Integer[al.size()];
        for(int i=0;i<al.size();i++){
            array[i]=al.get(i);
        }
        System.out.print("[");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+",");
        }
        System.out.println("]");
    }
}
