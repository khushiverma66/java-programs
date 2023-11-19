import java.util.*;

public class endterm {
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    ///////////////// FIRST///////////////////
    // int n = sc.nextInt();
    // int arr[] = new int[n];
    // for(int i=0;i<n;i++){
    // arr[i]=sc.nextInt();
    // }
    // for(int i=arr.length-1;i>=0;i--){
    // System.out.print(arr[i]+" ");
    // }
    // System.out.println();

    /////////////// SECOND//////////////////
    // int n = sc.nextInt();
    // LinkedList<String> ll = new LinkedList<>();
    // for (int i = 0; i < n; i++) {
    // ll.add(sc.next());
    // }
    // String st = sc.next();
    // ll.removeIf(s -> s.compareTo(st) <= 0);

    // System.out.println(ll);

    /////////////// THIRD////////////////////
    // String str = sc.nextLine();
    // String[] stringArr = str.split("\\s");
    // String w=" ";
    // for(int i=0;i<stringArr.length;i++){

    // if(stringArr[i].length()>w.length()){
    // w=stringArr[i];
    // }
    // }
    // System.out.println(w.length());

    ////////////// FOUR////////////////////
    // String str = sc.nextLine();
    // String w = "";
    // for(int i = 0 ; i <str.length()-1;i++){
    // char ch = str.charAt(i);
    // if(str.charAt(i)!=str.charAt(i+1)){
    // w=w+ch;
    // }
    // else{
    // continue;
    // }
    // }
    // System.out.println(w+str.charAt(str.length()-1));

    /////////////////// FIVE////////////////////
    // int n = sc.nextInt();
    // int x = sc.nextInt();
    // int arr[] = new int[n];
    // for(int i=0;i<arr.length;i++){
    // arr[i]=sc.nextInt();
    // }
    // int arr1[] = new int[n];
    // for(int i=0;i<arr1.length;i++){
    // arr1[i]=sc.nextInt();
    // }
    // int count = 0;
    // for(int i=0;i<arr.length;i++){
    // if(arr[i]>=x){
    // count+=arr1[i];
    // }
    // }
    // System.out.println(count);

    ///////////////// SIX//////////////////
    // int n = sc.nextInt(); // Number of days
    // int[] A = new int[n]; // Array for Alice's distances
    // int[] B = new int[n]; // Array for Bob's distances
    // for (int i = 0; i < n; i++) {
    // A[i] = sc.nextInt();
    // }
    // for (int i = 0; i < n; i++) {
    // B[i] = sc.nextInt();
    // }
    // int count=0;
    // for(int i=0;i<n;i++){
    // if(A[i]*2<=B[i] || B[i]*2<=A[i]){
    // continue;
    // }
    // else{}
    // count++;
    // }
    // System.out.println(count);

    /////////////////// seventh//////////
    // String s = sc.nextLine();
    // String str = s.replaceAll(" ","");
    // System.out.println(str.substring(0, 1).toUpperCase()+str.substring(1));

    ////////////////// eigth////////////////
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // LinkedList <Integer> ll = new LinkedList<>();
    // while(true){
    // int x = sc.nextInt();
    // if(x==-1) break;
    // else{
    // ll.add(x);
    // }
    // }
    // int idx = sc.nextInt();
    // System.out.println(ll.get(idx));


    /////////////// ninth//////////////////
    // String str1 = sc.nextLine();
    // String str2 = sc.nextLine();
    // int [] positions = findSubstringOccurrences(str1,str2);
    // if(positions.length==0){
    // System.out.println("-1");
    // }
    // else{
    // for(int position : positions){
    // System.out.println(position + " ");
    // }
    // }
    // }
    // public static int[] findSubstringOccurrences(String str1, String str2){
    // int [] positions = new int[str1.length()];
    // int count = 0;
    // int foundIndex = str1.indexOf(str2);
    // while (foundIndex != -1) {
    // positions[count] = foundIndex;
    // count++;
    // foundIndex = str1.indexOf(str2,foundIndex + 1);
    // }
    // int [] result = new int[count];
    // System.arraycopy(positions,0,result,0,count);
    // return result;

    ///////////////// tenth//////////////////////////
    // String str = sc.nextLine();
    // String [] words = str.split(" ");
    // StringBuilder reversedString = new StringBuilder();
    // for (String word : words) {
    // StringBuilder reversedWord = new StringBuilder(word).reverse();
    // reversedString.append(reversedWord).append(" ");
    // }
    // String result = reversedString.toString().trim();
    // System.out.println(result);

    /////////////////// eleventh////////////////////////
    // try {
    // String name = sc.nextLine();
    // int id = sc.nextInt();
    // double salary = sc.nextInt();
    // if (!name.matches("[a-zA-Z]+")) {
    // throw new CustomException("Invalid Name");
    // }
    // if (id <= 0) {
    // throw new CustomException("Invalid ID");
    // }
    // if (salary < 0) {
    // throw new CustomException("Invalid Salary");
    // }
    // System.out.println("Data Processed");
    // } catch (CustomException e) {
    // System.out.println(e.getMessage());
    // } catch (NumberFormatException e) {
    // System.out.println("Invalid Input");
    // } finally {
    // sc.close();
    // }
    // }
    // }
    // class CustomException extends Exception {
    // public CustomException(String message) {
    // super(message);

    //////////////////// twelve///////////////////
    // String s = sc.next();
    // String ans = solve(s, 0);
    // System.out.println(ans);
    // }
    // public static String solve(String s, int ind){
    // if(ind >= s.length()){
    // return " ";
    // }
    // char curr = s.charAt(ind);
    // if(ind + 1 < s.length()){
    // char next = s.charAt(ind+1);
    // if(curr > next){
    // return curr + solve(s, ind+2);
    // }
    // else{
    // return next + solve(s, ind+2);
    // }
    // }
    // return (s.valueOf(curr));

    //////////////////// thirteen///////////////////
    // int x = sc.nextInt();
    // int y = sc.nextInt();
    // int z = sc.nextInt();
    // int arr[] = new int[x];
    // int brr[] = new int[y];
    // int crr[] = new int[z];
    // for(int i=0;i<x;i++){
    // arr[i]=sc.nextInt();
    // }
    // for(int i=0;i<y;i++){
    // brr[i]=sc.nextInt();
    // }
    // for(int i=0;i<z;i++){
    // crr[i]=sc.nextInt();
    // }
    // int target = sc.nextInt();
    // for(int i=0;i<x;i++){
    // for(int j=0;j<y;j++){
    // for(int k=0;k<z;k++){
    // if(arr[i]+brr[j]+crr[k]==target){
    // System.out.print(arr[i]+" ");
    // System.out.print(brr[i]+" ");
    // System.out.print(crr[i]+" ");
    // return;
    // }
    // }
    // }
    // }

    //////////////////// fourteen/////////////////////
    // public static boolean isValid(String s){
    // char[] temp = s.toCharArray();
    // Stack<Character> st = new Stack<Character>();
    // for(char ch: temp){
    // if(ch == '(' || ch == '{'){
    // st.push(ch);
    // }
    // else{
    // if(ch == ')' && st.peek() == '(' || ch == '}' && st.peek() == '{'){
    // st.pop();
    // }
    // }
    // }
    // if(st.isEmpty()){
    // return true;
    // }
    // return false;
    // }
    // public static void main(String[] args){
    // Scanner sc = new Scanner(System.in);
    // String s = sc.nextLine();
    // // System.out.println(s);
    // if (isValid(s)) {
    // System.out.println("True");
    // } else {
    // System.out.println("False");
    // }

    ///////////////// fiveteen///////////////////
    // public static void kadanes(int number[]){
    // int ms = Integer.MIN_VALUE;
    // int cs = 0;
    // for(int i=0;i<number.length;i++){
    // cs += number[i];
    // if(cs<0){
    // cs=0;
    // }
    // ms = Math.max(cs,ms);
    // }
    // System.out.println(ms);
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int number[] = new int[n];
    // for(int i=0;i<n;i++){
    // number[i]=sc.nextInt();
    // }
    // kadanes(number);
    // }

    ///////////////// 60/////////////////////
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int m = sc.nextInt();
    // int count = 1;
    // int i=1;
    // while(count<=n){
    // int x = (3*i)+2;
    // if(x%m!=0){
    // count ++;
    // System.out.println(x);
    // }
    // i++;
    // }
    // }

    ////////////// 61////////////////////
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int T = sc.nextInt();
    // sc.nextLine();
    // for (int t = 0; t < T; t++) {
    // String s = sc.nextLine();
    // s = s.replace("10", "");
    // s = s.replace("00", "");
    // System.out.println(s.length());
    // }
    // }
    ////////////// 62////////////////////
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int [] A = new int[n];
    // for(int i=0;i<n;i++){
    // A[i] = sc.nextInt();
    // }
    // for(int i=0;i<n-1;i++){
    // if(A[i]-A[i+1]==1){

    // }
    // }
    // }

    /////////////// 63///////////////////
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int m = sc.nextInt();
    // for(int i=1;i<n*m;i++){
    // if(i%m==0 && i%n==0){
    // System.out.println(i);
    // break;
    // }
    // }
    // }

    //////////// 64/////////////////
    // public static void main(String[] args) {
    // Scanner sc=new Scanner(System.in);
    // int n=sc.nextInt();
    // int sum=0;
    // for(int i=0;i<=n;i++){
    // sum+=Integer.bitCount(i);
    // }
    // System.out.println(sum);
    // }
    // }

    ///////////// 65///////////////
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int A[] = new int[n];
    // for(int i=0;i<n;i++){
    // A[i]=sc.nextInt();
    // }
    // Arrays.sort(A);
    // for(int i=0;i<n;i++){
    // System.out.print(A[i] + " ");
    // }
    // }

    ////////////// 66///////////////
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int A[] = new int[n];
    // for(int i=0;i<n;i++){
    // A[i]=sc.nextInt();
    // }
    // Arrays.sort(A);
    // for(int i=0;i<n;i++){
    // System.out.print(A[i] + " ");
    // }
    // }

    /////////////// 67//////////////
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int A = sc.nextInt();
//         int count = 0;
//         int number = 1;

//         while (count < A) {
//             if (isBinaryPalindrome(number)) {
//                 count++;
//             }
//             number++;
//         }

//         System.out.println(number - 1);
//     }

//     // Function to check if the binary representation of a number is a palindrome
//     public static boolean isBinaryPalindrome(int num) {
//         String binary = Integer.toBinaryString(num);
//         int left = 0;
//         int right = binary.length() - 1;

//         while (left < right) {
//             if (binary.charAt(left) != binary.charAt(right)) {
//                 return false;
//             }
//             left++;
//             right--;
//         }

//         return true;
//     }
// } 

////////////// 70///////////////
// public static void solve(char str[],int n){
// for(int i=1;i<=n;i++){
// for(int j=0;j<=n-i;j++){
// int k = j+i-1;
// for(int l=j;l<=k;l++){
// System.out.print(str[l]);
// }
// System.out.println();
// }
// }
// }
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String s = sc.nextLine();
// char[] ch = s.toCharArray();
// solve(ch, s.length());
// }

///////////// 71///////////////
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int t = sc.nextInt();
// for(int i=0;i<t;i++){
// int n = sc.nextInt();
// int result = sol(n);
// System.out.println(result);
// }
// }
// public static int sol(int n){
// while(!isValid(n)){
// n--;
// }
// return n;
// }
// public static boolean isValid(int num){
// String str = Integer.toString(num);
// for(int i=1;i<str.length();i++){
// if(str.charAt(i)<str.charAt(i-1)){
// return false;
// }
// }
// return true;
// }

/////////////// 61/////////////////
// Arrays.sort();

////////////// 62//////////////
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
// int n = sc.nextInt();
// char [][]answers = new char[n][keys.length];
// for(int i=0;i<n;i++){
// System.out.println("Enter answers for students" + (i+1) + ":");
// for(int j=0;j<keys.length;j++){
// answers[i][j]=sc.next().charAt(0);
// }
// }
// for (int i=0;i<n;i++) {
// int correctCount = gradeExam(answers[i], keys);
// System.out.println(correctCount);
// }
// }
// public static int gradeExam(char [] studentAnswers, char [] correctAnswers){
// int correctCount = 0;
// for (int i=0; i<correctAnswers.length; i++) {
// if (studentAnswers[i] == correctAnswers[i]) {
// correctCount++;
// }
// }
// return correctCount;
// }

///////////////// 63/////////////////
// public static String reverse(String str){
// StringBuilder reversed = new StringBuilder(str);
// return reversed.reverse().toString();
// }
// public static String rightRotate(String s, int d){
// int n = s.length();
// if(n<d){
// return "-1";
// }
// return s.substring(d)+s.substring(0, d);
// }
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String inputString = sc.nextLine();
// int d = sc.nextInt();
// String rightRotated = rightRotate(inputString,d);
// String reversedString = reverse(rightRotated);
// System.out.println(rightRotated);
// System.out.println(reversedString);
// sc.close();
// }

////////////////// 64////////////////////
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int arr[]=new int[n];
// for(int i=0;i<n;i++){
// arr[i]=sc.nextInt();
// }
// boolean result = canMakeEqual(arr);
// if(result){
// System.out.println("yes");
// }
// else{
// System.out.println("no");
// }
// }
// public static boolean canMakeEqual(int []arr){
// for(int i=0;i<arr.length;i++){
// while(arr[i]%2==0){
// arr[i]/=2;
// }
// while(arr[i]%3==0){
// arr[i]/=3;
// }
// }
// for(int i=1;i<arr.length;i++){
// if(arr[i]!=arr[0]){
// return false;
// }
// }
// return true;
// }

/////////////// 66///////////////////
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// boolean isLucky = luckyNumber(n);
// if(isLucky){
// System.out.println(n + " is a lucky number");
// }
// else{
// System.out.println(n + " is not a lucky number");
// }
// sc.close();
// }
// public static boolean luckyNumber(int num){
// int originalNumber = num;
// int sum = 0;
// int order = orderofnum(num);
// while(num>0){
// int digit = num%10;
// sum += Math.pow(digit,order);
// num = num/10;
// }
// return sum == originalNumber;
// }
// public static int orderofnum(int num) {
// int count = 0;
// while (num > 0) {
// count++;
// num /= 10;
// }
// return count;
// }

///////////////// 67///////////////////
// public static void main(String[] args) {
// Scanner sc=new Scanner(System.in);
// String str=sc.nextLine();
// int arr[]=new int[2];
// StringBuffer sb= new StringBuffer(str);
// for(int i=0;i<2;i++)
// {
// arr[i]=sc.nextInt();
// char ch='*';
// sb.insert(arr[i]+i,ch);
// }
// System.out.println(sb);
// }

///////////////// 68//////////////////
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int result = isGovindNumber(n);
// System.out.println(result);
// }
// public static int isGovindNumber(int num){
// int sumOfDigits = sumOfDigits(num);
// int sumOfPrimeFactors = sumOfDigitsOfPrimeFactors(num);
// return (sumOfDigits == sumOfPrimeFactors) ? 1 : 0;
// }
// public static int sumOfDigits(int num) {
// int sum = 0;
// while (num > 0) {
// sum += num % 10;
// num /= 10;
// }
// return sum;
// }
// public static int sumOfDigitsOfPrimeFactors(int num) {
// int sum = 0;
// for (int i = 2; i <= num; i++) {
// while (num % i == 0) {
// sum += sumOfDigits(i);
// num /= i;
// }
// }
// return sum;
// }

/////////////// 70/////////////////
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// sc.nextLine();
// String[] name = new String[n];
// String[] phonenumber = new String[n];
// String[] email = new String[n];
// for (int i = 0; i < n; i++) {
// name[i] = sc.next();
// phonenumber[i] = sc.next();
// email[i] = sc.next();
// }
// String res = sc.next();
// int result = search(name, res);
// if (result != -1) {
// System.out.println(name[result]);
// System.out.println(phonenumber[result]);
// System.out.println(email[result]);
// } else {
// System.out.println("-1");
// }

// }

// static int search(String[] names, String target) {
// for (int i = 0; i < names.length; i++) {
// if (names[i].equals(target)) {
// return i;
// }
// }
// return -1;
// }

////////////////// 71/////////////////////
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// sc.nextLine(); // Consume the newline
// String[] arr = sc.nextLine().split(" ");
// Arrays.sort(arr);
// String target = sc.nextLine();
// int result = binarySearch(arr, target);
// System.out.println(result);
// }

// public static int binarySearch(String[] arr, String target) {
// int left = 0, right = arr.length - 1;
// while (left <= right) {
// int mid = left + (right - left) / 2;
// int cmp = target.compareTo(arr[mid]);
// if (cmp == 0) {
// return mid;
// } else if (cmp < 0) {
// right = mid - 1;
// } else {
// left = mid + 1;
// }
// }
// return -1;
// }
