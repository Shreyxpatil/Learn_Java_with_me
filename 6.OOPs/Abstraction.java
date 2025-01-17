public class Abstraction {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.eats();
        h1.legs();

        Hen h2 = new Hen();
        h2.eats();
        h2.legs();

        System.out.println(h1.color); // Access directly
        System.out.println(h2.color); // Access directly

        
        // Animal a1 = new Animal();
        // we cannot create obj of abstract classes
    }
    
}

// Abstract Classes
//Abstract classes in Java allow you to define methods without implementations (abstract methods)
// that must be implemented by any non-abstract subclass.
abstract class Animal{
    
    String color;

    // set default color to brown
    Animal(){
        color = "brown";
    }

    void eats(){
        System.out.println("eats");
    }

    abstract void legs();
}

class Horse extends Animal{

    //changed color to white
    void changeColor(){
        color= "White";
    }

    void legs(){
        System.out.println("4 legs");
    }
}

class Hen extends Animal{

      //changed color to red
    void changeColor(){
        color = "Red";
    }

    void legs(){
        System.out.println("2 legs");
    }
}