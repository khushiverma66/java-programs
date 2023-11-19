import java.util.*;
public class phonebook {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        HashMap <String,String> map = new HashMap<>();
        int numFriends = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<numFriends;i++){
            String name = sc.nextLine();
            String phone = sc.nextLine();
            map.put(name,phone);
        }
        while(sc.hasNext()){
            String givename = sc.nextLine();
            if(map.containsKey(givename)){
                System.out.println(givename + "=" + map.get(givename));
            }
            else{
                System.out.println("Not found");
            }
        }
	}
}

