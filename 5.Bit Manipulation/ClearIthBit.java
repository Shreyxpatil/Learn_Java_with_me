public class ClearIthBit {
    public static void main(String[] args){
        int a = 5;
        int i = 2;
        int mask = ~(1<<i);
        int ithBit = a&mask;
        System.out.println(ithBit);
    }
}
