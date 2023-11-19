import java.util.Scanner;

//1     1
//      11
//      111
//      1111
//2     1
//      11
//      202
//      3003
//3     1
//      11
//      121
//      1221
public class pattern {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int r = sc.nextInt();
       /*1 for(int i=0;i<=r;i++){
        for(int j=0;j<=i;j++){
            System.out.print("1");
        }
        System.out.println();
       }*/




       /*2 for(int i=0;i<=r;i++){
        for(int j=0;j<=i;j++){
            if(i==0){
                System.out.print("1");
            }
            else if(j==0 || j==i){
                System.out.print(i);
            }
            else{
                System.out.print("0");
            }
        }
        System.out.println();
       }*/



       /*3for(int i=0;i<=r;i++){
        for(int j=0;j<=i;j++){
            if(i==0 || j==0 || j==i){
                System.out.print("1");
            }
            //else if(j==0 || j==i){
              //  System.out.print("1");
            //}
            else{
                System.out.print("2");
            }
        }
        System.out.println();
    }
        }*/



        /*4for(int i=r;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }*/


          
       /*5  for(int i=1;i<=r;i++){
            for(int j=i;j<=(i*2)-1;j++){             
                System.out.print(j);
            }
            System.out.println();
    } */
        

        
      for(int i=r;i<=(i*2)-1;i++){
        for(int j=1;j<=r;j++){
            System.out.print(j);
        }
        System.out.println();
      }

    }
}    

