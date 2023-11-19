import java.util.*;

public class altoarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> al = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            al.add(sc.nextLine());
        }
        String array[]= new String[al.size()];
        for(int i=0;i<al.size();i++){
            array[i]=al.get(i);
        }
        for(String k:array){
            System.out.println(k);
        }
    }
}
