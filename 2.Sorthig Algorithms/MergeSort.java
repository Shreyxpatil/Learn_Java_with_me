public class MergeSort {
    public static void mergeSort(int arr[], int si, int ei){
        if(si >=ei){
            return;
        }
        int mid = si + ( ei -si)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);

        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[], int si, int mid, int ei){

    }
    
    public static void printArr(int arr[]){
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int arr[] = {6,3,9,5,2,8};
        mergeSort(int arr[], 0, arr.length-1);
    }

}
