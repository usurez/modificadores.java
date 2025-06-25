package paquete1;

public class Clase2 {
    
    public class Clase2 {

    public class Clase2 extends Clase1 {

    // clase hereda de clase1, y ambas estan en el mismo paquete
    // por eso puede usar los datos de clase1 como s1 fueran suyas 

    public void setData(){
        this.x = 15; // public 
        this.y = 9; // protected 
        setZ(15); // private 
        this.w = 39; 
    }

    public String getData(){
        return "Datos de clase2: x=" + this.x + "y= " + this.y + "z=" + getZ();

    }

    
}

}
