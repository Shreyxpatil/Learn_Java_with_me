public class CountingSort {
    public static void counting(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int count[] = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int k = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[k++] = i;
            }
        }
    }

    public static void print(int arr[]) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 9, 7, 4, 6, 2, 8};
        counting(arr);
        print(arr);
    }
    
}
