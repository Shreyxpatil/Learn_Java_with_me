public class GetIthBit {
    public static void main(String[] args){
        int a = 5;
        int i = 2;
        int mask = 1<<i;
        int ithBit = a&mask;
        if(ithBit == 0){
            System.out.println("0");
        }else{
            System.out.println("1");
        }
    }
    
}
