package paquete1;

public class Clase1 {

    public int x;
    private  int y;
    private int z;
    int w;
    
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getZ() {
        return z;
    }
    public void setZ(int z) {
        this.z = z;
    }
    
    @Override
    public String toString() {
        return "Clase1 [y=" + y + ", z=" + z + "]";
    } 

}
