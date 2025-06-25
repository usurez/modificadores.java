public class Padre {
    // Miembros de la clase padre 
    public int Variable1; // Solo debe de aceptar valores positivos 
    private  int Variable2; // Solo debe de aceptar valores negativos 

    public int getVariable2() {
        return Variable2;
    }
    public  void setVariable2(int variable2){
        if (variable2 < -0)
            this.Variable2 = variable2;
        else 
            this.Variable2 = 0; 
        
    }
    @Override
    public String toString() {
        return "Padre [Variable1=" + Variable1 + ", Variable2=" + Variable2 + "]";
    }

   
}