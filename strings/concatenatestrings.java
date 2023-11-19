//package strings;
import java.util.Scanner;

public class concatenatestrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        StringBuilder a = new StringBuilder(s1);
        StringBuilder b = new StringBuilder(s2);
        StringBuilder sb = a.append(b);
        System.out.println(sb.toString());

    }
}
