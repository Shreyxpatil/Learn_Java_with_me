public class lastOccurrence {
    public static int last(int arr[] , int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return last(arr, key, i-1);
        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,5,7};
        int key = 5;
        int i = arr.length-1;
        System.err.println(last(arr,key,i));
    }
    
}
