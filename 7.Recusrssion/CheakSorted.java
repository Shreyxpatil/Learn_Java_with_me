public class CheakSorted {
    public static boolean sorted(int arr[], int i){
        if( i == arr.length - 1){
            return true;
        }
        if(arr[i]<arr[i+1]){
            return true;
        }
        boolean sr = sorted(arr, i+1);
        return sr;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int i =0;
        sorted(arr,i);
        System.err.println(sorted(arr,i));
    }
}
