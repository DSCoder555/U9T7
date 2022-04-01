public class ThreeDPoint extends Point{
    private int z;
    public ThreeDPoint(String name, int x, int y, int z){
        super(name, x, y);
        this.z = z;
    }

    @Override
    public boolean equals(Object other){
        return(super.equals(other) && z == ((ThreeDPoint)other).z);
    }

    @Override
    public String toString(){
        return(super.toString() + ", z = " + z);
    }
}
