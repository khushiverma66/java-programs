//package strings;

import java.util.Scanner;

public class rotatestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.nextLine();
        for(int i=s.length()-1;i>0;i--){
            System.out.println(s.substring(n));
        }
    }
}
