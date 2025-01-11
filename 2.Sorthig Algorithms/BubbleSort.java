public class BubbleSort {

    public static void bubble(int arr[]){
        for(int turn =0; turn<arr.length; turn++){
            for(int j = 0; j<arr.length-1-turn;j++){
                if(arr[j]> arr[j+1]){
                    //swap
                    int temp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = temp;
                }
            }
        }

    }
    public static void print(int arr[]){
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.err.println();
    }
    public static void main(String[] args){
        int arr[]={1,5,3,9,7,4,6,2,8};
        bubble(arr);
        print (arr);
    }
    
}
