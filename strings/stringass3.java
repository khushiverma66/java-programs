
import java.util.*;
public class stringass3 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    s = s.replaceAll("\\s+","");
    System.out.println(s);
}
}