public class SetIthBit {
    public static void main(String[] args){
        int a = 5;
        int i = 1;
        int mask = 1<<i;
        int ithBit = a|mask;
        System.out.println(ithBit);
    }
}
