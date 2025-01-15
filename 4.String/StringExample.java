import java.util.*;
public class StringExample {
    public static void main(String args[]) {
        String str = "Hello World";
        String str2 = new String("xyz");
        System.out.println(str);
        System.out.println(str2);

        Scanner sc = new Scanner(System.in);
        String str3 = sc.nextLine();
        System.out.println(str3);
        System.out.println("length of string is: "+str3.length());

        //concatenation
        String FirstName = "John";
        String LastName = "Doe";
        String FullName = FirstName + " " + LastName;
        System.out.println(FullName);
        System.out.println(FullName.charAt(1));
    }
     
}
