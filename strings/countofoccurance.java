package strings;
import java.util.Scanner;

class countofoccurance{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.nextLine().charAt(0);
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                count++;
            }
        }
        System.out.println(count);
    }
}