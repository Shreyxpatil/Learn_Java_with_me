import java.util.Arrays;
import java.util.Collections;

public class Inbuild {
    public static void main(String[] args) {
        Integer arr[] = {1, 5, 3, 9, 7, 4, 6, 2, 8};
        
        // Sort in ascending order
        Arrays.sort(arr);
        System.out.println("Ascending Order: " + Arrays.toString(arr));
        
        // Sort in descending order
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Descending Order: " + Arrays.toString(arr));
    }
}
