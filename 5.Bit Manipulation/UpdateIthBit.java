public class UpdateIthBit {
    public static void main(String[] args){
        int a = 5;
        int i = 1;
        int v = 1;
        int mask = ~(1<<i);
        int ithBit = a&mask;
        int updatedBit = ithBit | (v<<i);
        System.out.println(updatedBit);
    }
}
