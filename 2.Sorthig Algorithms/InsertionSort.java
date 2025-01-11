// reference = https://youtu.be/pN8rLn8bAlc?si=Iy0gzHJ5EHvWuRRY

public class InsertionSort {
    public static void insertion(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; // Current element to be placed
            int j = i - 1;    // Index of the last element in the sorted part
            
            // Shift elements of the sorted part that are greater than 'key'
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j= j-1; // Move to the previous element
            }
            
            // Place 'key' in the correct position
            arr[j + 1] = key;
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
