package loops;
import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        if(number%2==0){
            System.out.println("even");
        }
        if(number!=0){
            System.out.println("odd");
        }
        
    }    
}

// INTEGER DIVISIBLE BY OR NOT
/*import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num:");
        int n = sc.nextInt();
        if(n%5==0){
            System.out.println("divisible");
        }
        else{
            System.out.println("not divisible");
        }
    }
}*/