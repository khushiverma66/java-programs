import java.util.*;
public class alass6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>al=new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            al.add(sc.nextInt());
        }
        // //Set<String>s=new HashSet<>(al);
        // Set<String>d= new HashSet<>(al);
        // for(String s: d){
        //     System.out.println(s + ": " + Collections.frequency(al, s));
        // }
        System.out.println(al);
        int count=0;
        for(int i=0;i<al.size();i++){
            for(int j=i;j<al.size();j++){
                if(al.get(i)==al.get(j)){
                    count++;
                    if(j>i){
                        al.remove(j);
                    }
                }
            }
            System.out.println("the freq of" +" "+ al.get(i)+ "is: "+count);
            count=0;
        }
    }
}
