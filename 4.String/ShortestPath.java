public class ShortestPath {
    public static float shortest(String directions){
        int x =0;
        int y =0;
        for(int i = 0; i<directions.length(); i++){
            
            //North
            if(directions.charAt(i)=='N'){
                y++;
            }
            //South
            else if(directions.charAt(i)=='S'){
                y--;
            }
            //East
            else if(directions.charAt(i)=='E'){
                x++;
            }
            //West
            else{
                x--;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        String directions = "WNEENESENNN";
        System.out.println(shortest(directions));
    }
}
