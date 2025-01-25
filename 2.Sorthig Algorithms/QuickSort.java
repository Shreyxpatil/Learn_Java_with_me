public class QuickSort {
    public static void quick(int arr[], int si, int ei){
        if(si>= ei){
            return;
        }
        int pivIndex = partition(arr,si,ei);
        quick(arr,si,pivIndex-1);
        quick(arr, pivIndex+1, ei);
    }
    public static int partition(int arr[] , int si, int ei){
        int pivot = arr[ei];
        int i = si -1;// to make space smaller then pivot
        
        for(int j=si; j<ei;j++){
            if(arr[j]<= pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }i++;

        int temp = pivot;
        arr[ei]=arr[i]; //pivot = arr[i]
        arr[i]= temp;
        return  i;
    }

    public static void printArr(int arr[]){
        for(int i = 0; i< arr.length; i++){
            System.err.print(arr[i] + " ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,8,2,5};
        quick(arr, 0, arr.length-1);
        printArr(arr);
    }
}
