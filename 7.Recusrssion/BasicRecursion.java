public class BasicRecursion {
    public static void printDec(int n){
        //Base Case
        if(n==1){ 
            System.out.println(n);
            return; //return to main function
        }
        System.out.print(n + " ");
        printDec(n-1); // printDec is recursive means its runs until n==1 first
    }

    public static void printIn(int a){
        if(a==1){
            System.out.print(a + " ");
            return;
        }    
        printIn(a-1);
        System.out.print(a + " ");
    }


    public static void main(String[] args) {
        int n = 10;
        printDec(n);

        int a = 10;
        printIn(a);
    }
    
}
