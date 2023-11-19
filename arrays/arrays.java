import java.util.*;

public class arrays {
  // public static void main(String[] args) {
  // int currSum = 0;
  // int maxSum = Integer.MIN_VALUE;
  // int arr[] = new int[]{1,-3,2};
  // int prefix[] = new int[arr.length];
  // prefix[0]=arr[0];
  // for(int i=1;i<arr.length;i++){
  // prefix[i]=prefix[i-1] + arr[i];
  // }
  // for(int i=0;i<arr.length;i++){
  // int start = i;
  // for(int j=i;j<arr.length;j++){
  // int end = j;
  // currSum = start == 0 ? prefix[end] : prefix[end]-prefix[start-1];
  // // currSum = 0;
  // // for(int k=start;k<=end;k++){
  // // currSum += arr[k];
  // // }

  // // System.out.println(currSum);
  // if(maxSum<currSum){
  // maxSum=currSum;
  // }
  // }
  // }
  // System.out.println("max sum=" + maxSum);
  // }

  public static void main(String[] args) {
    // int arr[]= new int[]{-2,-3,4,-1,-2,1,5,-3};
    // int arr[]= new int[]{-1,-2,-3,-4};
    // int ms = Integer.MIN_VALUE;
    // int cs = 0;

    // for(int i=0;i<arr.length;i++){
    // cs += arr[i];
    // if(cs < 0){
    // cs = 0;
    // }
    // ms = Math.max(cs,ms);
    // }
    // System.out.println("max subarray sum is "+ ms);

    // int arr[] = new int[]{1,3,5,7,9};
    // int k = 4;
    // for(int i=0;i<arr.length;i++){
    // if(i<k){
    // System.out.print(arr[arr.length+i-k]+" ");
    // }
    // else{
    // System.out.print(arr[i-k]+" ");
    // }
    // }
    // System.out.println();

    // int arr[] = new int[]{1,3,5,7,9};
    // int k = 2;
    // for(int i=k+1;i<arr.length;i++){
    // System.out.print(arr[i]+" ");
    // }
    // for(int i=0;i<=k;i++){
    // System.out.print(arr[i]+" ");
    // }

    // int arr[] = new int[]{1,3,5,7,9};
    // for(int i=arr.length-1;i>=0;i--){
    // System.out.print(arr[i]+" ");
    // }
    // System.out.println();

    //two sum
    // int A[]= new int[]{1,5,2,7,8};
    // int x = 7;
    // for (int i = 0; i < (A.length - 1); i++) {
    // for (int j = (i + 1); j < A.length; j++) {
    // if (A[i] + A[j] == x) {
    // System.out.println(i + "," + j);
    // }
    // }
    // }

    //palindrome number
    // int r,sum=0,temp;
    // int n=454;//It is the number variable to be checked for palindrome
    // temp=n;
    // while(n>0){
    // r=n%10; //getting remainder
    // sum=(sum*10)+r;
    // n=n/10;
    // }
    // if(temp==sum)
    // System.out.println("palindrome number ");
    // else
    // System.out.println("not palindrome");

    // fibonacci
    // class Fibonacci {
    // static int fib(int n)
    // {
    // if (n==0)
    // return 0;
    // else if(n==1 || n==2)
    // return 1;
    // return fib(n - 1) + fib(n - 2);
    // }
    // public static void main(String args[])
    // {
    // int n = 9;
    // System.out.println(fib(n));
    // }
    // }

    //peak element
    // int [] arr = new int[]{1,3,20,4,1,0};
    // int n = arr.length;
    // if(n==1){
    // System.out.println("0");
    // }
    // else if(arr[0]>=arr[1]){
    // System.out.println("0");
    // }
    // else if(arr[n-1]>=arr[n-2]){
    // System.out.println(arr[n-1]);
    // }
    // for(int i=1;i<n-1;i++){
    // if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1]){
    // System.out.println(arr[i]+ i);
    // }
    // }


    //majority
    // int arr[] = { 1, 1, 2, 1, 3, 5, 1 };
    // int n = arr.length;
    // int maxcount =0;
    // int index = -1;
    // for(int i=0;i<n;i++){
    // int count =0;
    // for(int j=0;j<n;j++){
    // if(arr[i]==arr[j]){
    // count++;
    // }
    // }
    // if(maxcount<count){
    // maxcount=count;
    // index = i;
    // }
    // }
    // if(maxcount > n/2){
    // System.out.println(arr[index]);
    // }
    // else{
    // System.out.println("no majority");
    // }

    //missing number
    // int arr[] = { 1, 3, 7, 5, 6, 2 };
    // int n = arr.length;
    // int i;
    // int temp[] = new int[n + 1];
    // for (i = 0; i <= n; i++) {
    // temp[i] = 0;
    // }
    // for (i = 0; i < n; i++) {
    // temp[arr[i] - 1] = 1;
    // }
    // int ans = 0;
    // for (i = 0; i <= n; i++) {
    // if (temp[i] == 0)
    // ans = i + 1;
    // }
    // System.out.println(ans);

    //triplet
    // int arr[] = { 0, -1, 2, -3, 1 };
    // int n = arr.length;
    // for (int i = 0; i < n - 2; i++) {
    // for (int j = i + 1; j < n - 1; j++) {
    // for (int k = j + 1; k < n; k++) {
    // if (arr[i] + arr[j] + arr[k] == 0) {
    // System.out.println(arr[i] + " "
    // + arr[j] + " "
    // + arr[k]);
    // }
    // }
    // }
    // }

    //last occurence
    // int arr[] = { 1, 2, 2, 2, 2, 3, 4, 7, 8, 8 };
    // int x = 8;
    // int n = arr.length;
    // // for(int i=0;i<n;i++){
    // for(int i=arr.length-1;i>=0;i--){
    // if(arr[i]==x){
    // System.out.println(i);
    // break;
    // }
    // else{
    // System.out.println("no");
    // }
    // }

    //binary search
    int [] arr = new int[]{2,4,6,8,12,18};
    int key = 12;
    int start = 0;
    int end = arr.length-1;
    int mid = (start+(end-start))/2;
    while(start<=end){
      if(arr[mid] == key){
        System.out.println(mid);
      }
      if(arr[mid] < key){
        start = mid + 1;
      }
      else{
        end = mid -1;
      }
      mid = (start+(end-start))/2;
    }
    System.out.println("-1");
  }

}