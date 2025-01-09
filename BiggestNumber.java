

public class BiggestNumber {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int max = Integer.MIN_VALUE;
        max = findMax(arr,max);
        System.out.println("The biggest number is:"+max);
    }
    public static int findMax(int arr[] , int max){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max =arr[i];
            }
        } 
        return max;
    }
}
