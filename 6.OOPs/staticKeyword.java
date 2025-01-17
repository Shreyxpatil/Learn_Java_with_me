public class staticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "DYP";

        //DYP is set for all students now
        Student s2 = new Student();
        System.out.println(s2.schoolName);
        
    }
    
}
class Student{
    static String schoolName;
}
