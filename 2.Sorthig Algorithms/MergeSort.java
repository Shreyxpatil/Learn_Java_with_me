public class MergeSort {

    // Recursive function to perform merge sort
    public static void mergeSort(int arr[], int si, int ei) {
        // Base case: If the starting index is greater or equal to the ending index, return
        if (si >= ei) {
            return;
        }

        // Find the mid-point of the current array segment
        int mid = si + (ei - si) / 2;

        // Recursively sort the left half
        mergeSort(arr, si, mid);

        // Recursively sort the right half
        mergeSort(arr, mid + 1, ei);

        // Merge the two sorted halves
        merge(arr, si, mid, ei);
    }

    // Function to merge two sorted halves into a single sorted array
    public static void merge(int arr[], int si, int mid, int ei) {
        // Temporary array to store the merged result
        int temp[] = new int[ei - si + 1];

        // Pointers for left half, right half, and temp array
        int i = si;     // Pointer for left half
        int j = mid + 1; // Pointer for right half
        int k = 0;      // Pointer for temp array

        // Compare elements from both halves and add the smaller one to temp
        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Add any remaining elements from the left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Add any remaining elements from the right half
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy the sorted elements from temp back to the original array
        for (k = 0; k < temp.length; k++) {
            arr[si + k] = temp[k];
        }
    }

    // Function to print the array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main function to test the merge sort implementation
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8}; // Input array to be sorted

        // Perform merge sort on the array
        mergeSort(arr, 0, arr.length - 1);

        // Print the sorted array
        printArr(arr);
    }
}
