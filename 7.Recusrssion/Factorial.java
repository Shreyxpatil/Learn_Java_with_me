public class Factorial {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm = fact(n-1); //fnm = factorial n-1
        int fn = n * fnm; 
        return fn;
    }

    public static void main(String[] args) {
        int n = 5;
        fact(n);
        System.out.println(fact(n));
    }
    
}
