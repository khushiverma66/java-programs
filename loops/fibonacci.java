package loops;
/*import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no.:");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
    } 
    while(c<n){
        c = a + b;
        a = b;
        b = c;
        if(c==n){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }   
}*/
import java.util.Scanner;
 
public class fibonacci 
{    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter positive number :");
         
        int inputNumber = sc.nextInt();     
        int firstTerm = 0;         
        int secondTerm = 1;
        int thirdTerm = 0;
        while (thirdTerm < inputNumber)
        {
            thirdTerm = firstTerm + secondTerm;
            firstTerm = secondTerm; 
            secondTerm = thirdTerm;
        }
        if(thirdTerm == inputNumber)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }   
}
