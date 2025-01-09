package DSA;

public class BinarySearch {

    public static int binary(int[] arr, int key){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == key){
                return mid;
            }
            if (arr[mid] < key){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1; // return -1 if the key is not found
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int key = 8;   
        int result = binary(arr, key);
        System.out.println("The key is at index: " + result);
    }
}
