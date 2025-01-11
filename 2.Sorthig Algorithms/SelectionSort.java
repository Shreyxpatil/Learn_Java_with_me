

public class SelectionSort {
    public static void selection(int arr[]){
        for(int turn = 0; turn< arr.length-1; turn++){
            int minPos= turn;
            for(int j=turn +1; j< arr.length-1;j++){
                if(arr[j]<arr[minPos]){
                    minPos = j;
                }
            }
            //swap
            int temp = arr[turn];
            arr[turn] = arr[minPos];
            arr[minPos] = temp;
        }
    }
    public static void print(int arr[]){
        for(int i =0; i< arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 9, 7, 4, 6, 2, 8};
        selection(arr);
        print(arr);
    }
}
