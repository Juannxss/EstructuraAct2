package EstrcucturaAct2;

public class Producto {

    private String codigo, nombre, marca, color, categoria;
    private int precioCompra, precioVenta, unidadesEnExistencia,medida;
    private float porcentajeDescuentoMax;
    
    public Producto(){
        
    }
    

    public Producto(String codigo, String nombre, String marca, String color, int medida, String categoria, int precioCompra, int precioVenta, int unidadesEnExistencia, float porcentajeDescuentoMax) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.color = color;
        this.medida = medida;
        this.categoria = categoria;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.unidadesEnExistencia = unidadesEnExistencia;
        this.porcentajeDescuentoMax = porcentajeDescuentoMax;
    }
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMedida() {
        return medida;
    }

    public void setMedida(int medida) {
        this.medida = medida;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getUnidadesEnExistencia() {
        return unidadesEnExistencia;
    }

    public void setUnidadesEnExistencia(int unidadesEnExistencia) {
        this.unidadesEnExistencia = unidadesEnExistencia;
    }

    public float getPorcentajeDescuentoMax() {
        return porcentajeDescuentoMax;
    }

    public void setPorcentajeDescuentoMax(float porcentajeDescuentoMax) {
        this.porcentajeDescuentoMax = porcentajeDescuentoMax;
    }
    
    
        

}
