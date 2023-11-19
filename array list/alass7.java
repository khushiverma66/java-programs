import java.util.*;
public class alass7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer>al=new LinkedList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            al.add(sc.nextInt());
        }
        int e = sc.nextInt();
        if(al.contains(e)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
}
