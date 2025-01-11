
public class linearSearch{
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int key = 5;
        linear(arr,key);

    }
    public static void linear(int arr[], int key){
        for (int i = 0; i< arr.length; i++){
            if ( arr[i]== key){
                System.out.println("Element found at index:"+i);
            }
        }
    }
}