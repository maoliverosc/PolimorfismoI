/*
 * by themaoc
 */
package polimorfismo;

/**
 *
 * @author Mauricio Oliveros C
 */
public class EmpleadoPorComision {
    // Private
    private String FirstName;
    private String LastName;
    private String NumSegSocial;
    private double VentasBrutas;
    private double TarifaComision;
    
    // Public - Constructor
    public EmpleadoPorComision(String FN, String LN, String NSS, double VB, double TC){
        FirstName = FN;
        LastName = LN;
        NumSegSocial = NSS;
        VentasBrutas = VB;
        TarifaComision = TC;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getNumSegSocial() {
        return NumSegSocial;
    }

    public void setNumSegSocial(String NumSegSocial) {
        this.NumSegSocial = NumSegSocial;
    }

    public double getVentasBrutas() {
        return VentasBrutas;
    }

    public void setVentasBrutas(double VentasBrutas) {
        if (VentasBrutas >= 0.0)
            this.VentasBrutas = VentasBrutas;
        else
            throw new IllegalArgumentException("Ventas > 0.0");
    }

    public double getTarifaComision() {
        return TarifaComision;
    }

    public void setTarifaComision(double TarifaComision) {
        if (TarifaComision > 0.0 && TarifaComision < 1.0)
            this.TarifaComision = TarifaComision;
        else
            throw new IllegalArgumentException("Tarifa > 0.0 & < 1.0");
    }
    
    // Calculo de Ingresos.
    public double ingresos(){
        return this.getTarifaComision()*this.getVentasBrutas();
        //return TarifaComision*VentasBrutas;
    }
    
    @Override
    public String toString(){
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
                "Empleado por comision", this.getFirstName(), this.getLastName(),
                "Numero seguro social", this.getNumSegSocial(),
                "Ventas Brutas", this.getVentasBrutas(),
                "Tarifa Comision", this.getTarifaComision() );
    }
}

// end class
