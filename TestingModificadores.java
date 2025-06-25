

public class TestingModificadores {
    public static  void main(String [] args){
        Padre papa = new Padre();
        Hijo Chamaco = new Hijo();
        Hijo Chamaca = new Hijo();
        Clase2 objeto2 = new clase2()

        // Asignar valores a miembros de la clase padre 
        // Asignar valores es un metodo de accesos a los miembros 

        papa.setVariable2(12); // Propiedad privada 
        papa.Variable1 = 25; // Popiedad publica 

        // Leer valores de los miembros de la clase padre 
        // Leer valores es otro método de acceso a los miembros 
        System.err.println("Valor de variable1: " + papa.Variable1);
        System.err.println("Valor de variable2: " + papa.Variable1);
       
        Chamaco.setVariable3(16);
        Chamaco.setVarsPadre(); // modificacion desde la clase hijo 
        System.err.println("Info del chamaco: " + Chamaco.toString());

        Chamaca.setVariable3(98);
        Chamaca.Variable1 = 32; // Modificacion  desde el testing
        Chamaca.setVariable2(29); // modificacion desde el testing 
        System.err.println("Info de la chamaca: " + Chamaca.toString());

        System.err.println();
        objeto2.x = 250;
        // Esto no se puede hacer porque y es protected y testing  esta 
        // fuera del paquete1
        // objeto2.y = 300;
        objeto2.setZ(200);
        System.err.println(objeto2.getData());  
        }
        


}
