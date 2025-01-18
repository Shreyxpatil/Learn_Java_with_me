public class NaturalSum {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int nmo = sum(n-1); //n -1
        int sm = n + nmo; //sum
        return sm;
    }
    public static void main(String[] args){
        int n= 5;
        sum(n);
        System.out.println(sum(n));
    }
    
}
