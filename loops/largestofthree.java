package loops;
import java.util.Scanner;
public class largestofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first no.");
        int a = sc.nextInt();
        System.out.println("enter second no.");
        int b = sc.nextInt();
        System.out.println("enter third no:");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("a is largest");
        }
        else if(b>a && b>c){
            System.out.println("b is largest");
        }
        else{
            System.out.println("c is largest");
        }
    }        
    }
