/*import java.util.Scanner;

public class nonrepeatedchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        /*for(int i=1;i<s.length();i++){
                if(s.charAt(i)!=s.charAt(i-1)){
                    break;
                }
            }
            for(int i=0;i<s.length();i++){
                if ( s.indexOf(i) == s.lastIndexOf(i)) {
                    System.out.println("First non-repeating character is: "+ i);
                    break;
        }
    }
}
}*/
//package strings;
import java.util.*;

public class nonrepeatedchar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            
            for (int j = i + 1; j < str.length(); j++) {

                // if(str.charAt(i)==str.charAt(j)){
                // break;
                // //j=i+1;
                // }

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }

            }

            if (count == 0) {
                System.out.println(str.charAt(i));
                break;
            }

            count = 0;

        }

    }
}

