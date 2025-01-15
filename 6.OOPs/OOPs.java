public class OOPs {
    public static void main(String[] args) {
        pen p1= new pen();
        p1.setColor("Red");
        p1.setTip(10);
        System.out.println(p1.color);
        System.out.println(p1.tip);

        p1.setColor("yellow");
        System.out.println(p1.color);
        
    }
    
}
class pen{
    String color;
    int tip;

    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
