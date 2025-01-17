public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eats();
        shark.breath();
        shark.color ="red";
        System.out.println(shark.color);

        Whale w1 = new Whale();
        w1.eats();
        w1.breath();
        w1.swim();
        w1.danger();

        Bird crow = new Bird();
        crow.eats();
        crow.breath();
        crow.fly();
    }
    
}
class Animal{
    String color;
    void eats(){
        System.out.println("Eats");
    }

    void breath(){
        System.out.println("breathes");
    }
}

//Single level Inheritance

class Fish extends Animal{
    int swims;

    void swim(){
        System.out.println("swims");
    }
}

//Multilevel Inheritance
// here class shark take properties from Fish and fish takes properties from animal
class Whale extends Fish{
    void danger(){
        System.err.println("It is danger");
    }

}

//Hierarchial Inheritance
// here Animal is Parent class and Fish and Bird are Child classes
class Bird extends Animal{
    void fly(){
        System.out.println("Can fly");
    }

}

// Hybrid Inheritance
//All this combines into hybrid inheritance because it is combinatin of more than one type