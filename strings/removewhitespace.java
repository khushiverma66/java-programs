//package strings;
import java.util.Scanner;

public class removewhitespace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        //String x = " ";
        System.out.println(s.replace(" ", ""));
        //System.out.println(s.trim(x));
        //System.out.println(s.trim());
    }
}
