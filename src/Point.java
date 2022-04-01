public class Point {
    private String name;
    private int x;
    private int y;

    public Point(String name, int x, int y){
        this.name = name;
        this.x = x;
        this.y = y;
    }
    @Override
    public boolean equals(Object other){
        if(other == null){
            return false;
        }
        return(x == ((Point)other).x && y == ((Point)other).y);
    }

    @Override
    public String toString(){
        return("Point " + name + " is at x = " + x + ", y = " + y);
    }
}
