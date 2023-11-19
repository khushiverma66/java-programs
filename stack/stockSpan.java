import java.util.*;
public class stockSpan {
    public static int[] calculateSpan(int price[], int n)
    {
        Stack<Integer> st = new Stack<Integer>();
        int[] arr = new int[n];
        st.push(0);
        arr[0] = 1;
        
        for(int i=1;i<n;i++){
            while(!st.isEmpty() && price[st.peek()] <= price[i]){
                st.pop();
            }
            int ans = st.isEmpty()?i+1 :i-st.peek();
            arr[i] = ans;
            
            st.push(i);
        }
        
        return arr;
    }
    public static void main(String[] args) {
        
    }
}
