public class SubArray {
    public static void sub(int arr[]){
        for(int i =0; i< arr.length; i++){
            int start = i;
            for(int j =i+1; j< arr.length; j++){
                int end = j;
                for(int k= start; k<= end; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }

    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        sub(arr);
    }
    
}
