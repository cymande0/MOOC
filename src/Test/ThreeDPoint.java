package Test;

public class ThreeDPoint extends Point {

    private int z;

    public ThreeDPoint(int x, int y, int z){
            super(x, y);
            this.z = z;
    }

    @Override
    protected String location() {
            return super.location() + ", " + z;    // printing as "x, y, z"
    }

    @Override
    public int manhattanDistanceFromOrigin() {
            // first, we ask the superclass for the distance of x+y
            // and then we add the value of z to it
         return super.manhattanDistanceFromOrigin() + Math.abs(z);
    }

//    @Override
//    public String toString() {
//            return "(" + this.location() + ") distance " + this.manhattanDistanceFromOrigin();
//    }
}
