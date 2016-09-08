/*
 * @GWAIHIR
 */
package polimorfismo;

/**
 *
 * @author mauricio.oliveros
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Asigna la referencia a la superclase a una variable de la superclase.
        EmpleadoPorComision epc = new EmpleadoPorComision("Mauricio","Oliveros","1017159672",1000,0.6);
        // Asigna la referencia a la subclase a una variable de la subclase.
        EmpleadoBaseMasComision ebmc = new EmpleadoBaseMasComision("Euclides","Oliveros","1101384411",1100,0.8,300);
        //
        // invoca a toString() en un objeto de la superclase, usando una variable de la superclase.
        System.out.printf("%s %s:\n\n%s\n\n","Llamada a toString() de EmpleadoPorComision con ref de superclase","a un objeto de superclase", epc.toString() );
        // 
        // invoca a toString() en un objeto de la subclase, usando una variable de la subclase..
        System.out.printf("%s %s:\n\n%s\n\n","Llamada a toString() de EmpleadoBaseMas Comision con ref","de subclase a un objeto de la subclase", ebmc.toString() );
        //
        // invoca a toString() en un objeto de la subclase, usando una variable de la superclase.
        EmpleadoPorComision epc2 = ebmc;
        //
        System.out.printf("%s %s:\n\n%s\n","Llamada a toString() de EmpleadoBaseMasComision con ref de superclase","a un objeto de la subclase", epc2.toString() );
    }
    
}


// end main program...