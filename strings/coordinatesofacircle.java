import java.util.Scanner;
public class coordinatesofacircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = 0;
        double y = 0;
        double r = 24;
        double x1 = 4;
        double y1 = 5;
        double m1 = (x1-x)/(y1-y);
        if((m1*m1)>r){
            System.out.println("outside the circle");
        }
        else if((m1*m1)<r){
            System.out.println("Inside the circle");
        }
        else if(m1==r){
            System.out.println("On the circle");
        }

    }    
}
