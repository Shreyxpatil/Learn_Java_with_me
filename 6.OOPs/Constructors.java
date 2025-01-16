

public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Shreyas");
        Student s3 = new Student(41, 123);

        s1.name = "John";
        System.out.println(s1.name);
        s1.rollno = 45;
        System.out.println(s1.rollno);
        s1.pass = 789;

        Student s4 = new Student(s1);
        s2.pass=124; // this takes all the properties of s1 and only pass is changed 

    }
    
}

class Student{
    String name;
    int rollno;
    int pass ;

    //Non Parameterized Constructor
    Student(){
        System.out.println("Constructor is called");
    }

    //Parameterized Constructor
    Student(String name){
        this.name = name;
        System.out.println(name);
    }

    Student(int rollno, int pass){
        this.rollno = rollno;
        this.pass = pass;
        System.out.println(rollno);
    }
    

    //Copy Const
    Student( Student s1){
        this.rollno = s1.rollno; 
        this.name = s1.name;
    }
}
