import java.util.Scanner;

//import javax.sound.sampled.SourceDataLine;

public class countoccofsubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String su = sc.nextLine();
    int count=0;
    for(int i=0;i<=su.length()-s.length();i++){
        int j;
        for(j=0;j<s.length();j++){
            if(su.charAt(i+j)!=s.charAt(j)){
                break;
            }
        }
        if( j==s.length()){
            count++;
            j=0;
        }
    }
    System.out.println(count);
}
}
