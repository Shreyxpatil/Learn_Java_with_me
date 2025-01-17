public class Polymorphism {
    public static void main(String[] args) {
    Calculator cal = new Calculator();
    int z = 5;
    int y = 4;
    System.out.println(cal.sum(y,z));
    System.out.println(cal.sum(3.3f ,2.1f));
    System.out.println(cal.sum(3,7,9));
    

    Animal a1 = new Animal();   // Calls eats() in Animal
    a1.eats();

    Deer d1 = new Deer();     // Calls overridden eats() in Deer
    d1.eats();
    }
}

// Method Overloading
//Multiple functions with same name but different parameters
class Calculator{
    int sum(int a, int b){
        return a+b;
    }

    float sum( float a , float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}

//Method Overiding
// parent and child contains same function eats but diffeerent defination

class Animal{
    void eats(){
        System.out.println("Eats anything");
    }
}

class Deer{
    void eats(){
        System.out.println("Eats grass");
    }
}