public class firstOccurrence {
public static int first(int arr[], int key, int i){
    if(i == arr.length){
        return -1;
    }
    if(arr[i]== key){
        return i;
    }
    return first(arr, key, i+1);
}

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,5,7};
        int key = 5;
        int i = 0;
        System.err.println(first(arr, key, i));

        
    }
    
}
