public class InsertionSort {
    public static void insertion(int arr[]){
        for(int i = 1;i< arr.length; i++){
            int unsorted = arr[i];
            int sorted = i-1;
            while(sorted >=0 && arr[sorted] >unsorted){
                arr[sorted+1] = arr[sorted];
                sorted--;
            }
            arr[sorted+1] = unsorted;
        } 
    }

    public static void print(int arr[]){
        for( int k=0; k< arr.length ; k++){
            System.out.print(arr[k]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 9, 7, 4, 6, 2, 8};
        insertion(arr);
        print(arr);
    }
    
}
