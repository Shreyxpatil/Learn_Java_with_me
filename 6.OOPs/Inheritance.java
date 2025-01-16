public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eats();
        shark.breath();
        shark.color ="red";
        System.out.println(shark.color);
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

class Fish extends Animal{
    int swims;

    void swim(){
        System.out.println("swims");
    }
}
