import java.util.*;
public class alass16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> al = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            al.add(sc.nextInt());
        }
        System.out.println(al);
        int sum=0;
        for(int i=0;i<n;i++){
            sum +=al.get(i);
        }
        System.out.println(sum);
    }
}