
public class GetterSetter {
    public static void main(String[] args){
        Pen p1 =new Pen();
        p1.setColor("red");
        p1.setTip(5);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());        
    }
    
}

class Pen{
    private int tip;
    private String color;

    //getter
    String getColor(){
        return color;
    }
    int getTip(){
        return tip;
    }

    //Setters
    void setColor(String setColor){
        this.color = setColor;
    }
    void setTip(int setTip){
        this.tip = setTip;
    }
}