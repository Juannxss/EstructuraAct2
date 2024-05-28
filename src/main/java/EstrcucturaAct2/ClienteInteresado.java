
package EstrcucturaAct2;



public class ClienteInteresado extends Cliente{
    
    private int consecutivo, numeroCompras;
    private String fecha, cedula, medioDePago,
            modalidad;//directa o domicilio

    public ClienteInteresado(int consecutivo, String fecha, String cedula, String medioDePago, String modalidad, int numeroCompras) {
        this.consecutivo = consecutivo;
        this.fecha = fecha;
        this.cedula = cedula;
        this.medioDePago = medioDePago;
        this.modalidad = modalidad;
        this.numeroCompras = numeroCompras;
    }

    public ClienteInteresado(int consecutivo, String fecha, String cedula, String medioDePago, String modalidad, String nombre, String primerApellido, String segundoApellido, String fechaNacimiento, String numeroTelefono, String email, String direccion, String estado, char genero, int numeroCompras) {
        super(nombre, primerApellido, segundoApellido, fechaNacimiento, numeroTelefono, email, direccion, estado, genero);
        this.consecutivo = consecutivo;
        this.fecha = fecha;
        this.cedula = cedula;
        this.medioDePago = medioDePago;
        this.modalidad = modalidad;
        this.numeroCompras = numeroCompras;
    }

    public int getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
    }

    public int getNumeroCompras() {
        return numeroCompras;
    }

    public void setNumeroCompras(int numeroCompras) {
        this.numeroCompras = numeroCompras;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getMedioDePago() {
        return medioDePago;
    }

    public void setMedioDePago(String medioDePago) {
        this.medioDePago = medioDePago;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }


    
    
    
  
    
    
    
}
