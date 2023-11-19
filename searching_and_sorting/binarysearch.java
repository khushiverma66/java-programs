

public class binarysearch {
    public static int binarySearch(int arr[], int size, int key){
        int start = 0;
        int end = size - 1;

        while(start <= end){
            int mid = start + (end-start)/2;
            
            if(arr[mid] == key){
                return mid;
            }

            //go to right wala part
            if(key > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
            mid = start + (end-start)/2;;
        }
        return -1;
    }
    public static void main(String[] args) {
        int even[] = {2,4,6,8,12,18};
        int odd[] = {3,8,11,14,16};

        int index = binarySearch(even,6,12);
        System.out.println(index);
    }
}
