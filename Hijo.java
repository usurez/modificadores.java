
import paquete1.Clase1;

public class Hijo extends Padre {
    
    private int Variable3;
    public int variable1;
    
    public Hijo(){
        super();
    }

    public int getVariable3() {
        return Variable3;
    }

    public void setVariable3(int variable3) {
        Variable3 = variable3;
    }

    // Modificar la variables de la clase padre 
    public void setVarsPadre(){
        // Propiedad publica 
        Variable1 = 250; // propiedad publica 
        super.setVariable2(-12); // propiedad privada 

    }

    public void setDataClase1(){
        Clase1 objeto1 = new Clase1();
        objeto1.x = 15; //public
        // Datos protegidos no se pueden usar fuera del paquete1 
        //objeto1.y = 16;

        objeto1.setZ(25);
        
        // Datos tipo defaut no se puede usar fuera fuera del paquete1 comportamiento semejante a protected 
        //objeto1.w = 25; 
    }



    @Override
    public String toString() {
        return super.toString() + "Hijo [Variable3=" + "variable1= " + this.Variable1 + "]";
    }

}
