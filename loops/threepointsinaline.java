package loops;
import java.util.Scanner;
public class threepointsinaline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1=1, x2=2, x3=3, y1=1, y2=2, y3=4;
        double m1 = (y2-y1)/(x2-x1);
        double m2 = (y3-y2)/(x3-x2);
        if(m1==m2){
            System.out.println("three points lie on a single line");
        }
        else{
            System.out.println("they do not lie on a single line");
        }

    }    
}
