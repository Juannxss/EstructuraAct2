
package EstrcucturaAct2;

import java.util.Date;

public class ClienteInteresado extends Cliente{
    
    private int consecutivo;
    private String fecha, cedula, medioDePago,
            modalidad;//directa o domicilio

    public ClienteInteresado(int consecutivo, String fecha, String cedula, String medioDePago, String modalidad) {
        this.consecutivo = consecutivo;
        this.fecha = fecha;
        this.cedula = cedula;
        this.medioDePago = medioDePago;
        this.modalidad = modalidad;
    }

    public ClienteInteresado(int consecutivo, String fecha, String cedula, String medioDePago, String modalidad, String nombre, String primerApellido, String segundoApellido, String fechaNacimiento, String numeroTelefono, String email, String direccion, String estado, char genero) {
        super(nombre, primerApellido, segundoApellido, fechaNacimiento, numeroTelefono, email, direccion, estado, genero);
        this.consecutivo = consecutivo;
        this.fecha = fecha;
        this.cedula = cedula;
        this.medioDePago = medioDePago;
        this.modalidad = modalidad;
    }
    
    
    
  
    
    
    
}
