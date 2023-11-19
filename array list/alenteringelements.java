import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class alenteringelements {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(); 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int temp = sc.nextInt();
            if(!a.contains(temp)){
                a.add(temp);
            }
        }
        Collections.sort(a);
        System.out.println(a);
    }
}
