public class Interface {
    public static void main(String[] args) {
        Queen queen = new Queen();
        Elephant elephant = new Elephant();
        Camel camel = new Camel();
        Horse horse = new Horse();
        King king = new King();
        
        queen.moves();
        elephant.moves();
        camel.moves();
        horse.moves();
        king.moves();

        Bear bear = new Bear();
        System.out.println(bear.eats());
    }
    
}



interface ChessPlayer{
    void moves();
}

class Queen implements  ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, daigonal");
    }
}

class Elephant implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}

class Camel implements ChessPlayer{
    public void moves(){
        System.out.println("diagonal");
    }
}

class Horse implements ChessPlayer{
    public void moves() {
        System.out.println("two and half");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal");
    }   
}

// unite 2 classes
interface veg{
    String eats();
}

interface nonveg{
    String eats();
}

class Bear implements veg, nonveg{
     public String eats(){
        return "both";
    }
}