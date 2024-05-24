package EstrcucturaAct2;

import java.util.Date;

public class ProductoComprado extends Producto {

    /* realizar calculo de la cantidad de dinero que debe pagar por esa compra
    Para eso tiene en cuenta el impuesto del IVA que es
    del 19% para todos los productos, anotando el valor a pagar sin IVA, el
    valor a pagar por concepto de IVA y el valor total a pagar
    
     */
    private String  provedor, codigoProducto, fecha,
            cantidades;//kg litros

    private int precioComprado, valorPagarSinIVA, valorPagarConIVA, valorTotalPagar = valorPagarConIVA + valorPagarSinIVA, consecutivo;
    private final float IVA = 0.19f;

    public ProductoComprado() {
    }

    

    public ProductoComprado(int consecutivo, String provedor, String codigoProducto, String fecha, String cantidades, int precioComprado, int valorPagarSinIVA, int valorPagarConIVA, String codigo, String nombre, String marca, String color, int medida, String categoria, int precioCompra, int precioVenta, int unidadesEnExistencia, float porcentajeDescuentoMax) {
        super(codigo, nombre, marca, color, medida, categoria, precioCompra, precioVenta, unidadesEnExistencia, porcentajeDescuentoMax);
        this.consecutivo = consecutivo;
        this.provedor = provedor;
        this.codigoProducto = codigoProducto;
        this.fecha = fecha;
        this.cantidades = cantidades;
        this.precioComprado = precioComprado;
        this.valorPagarSinIVA = valorPagarSinIVA;
        this.valorPagarConIVA = valorPagarConIVA;
    }


    

    public int getValorPagarSinIVA() {
        return valorPagarSinIVA;
    }

    public void setValorPagarSinIVA(int valorPagarSinIVA) {
        this.valorPagarSinIVA = valorPagarSinIVA;
    }

    public float getValorPagarConIVA() {
        return valorPagarConIVA;
    }

    public void setValorPgarConIVA(int valorPgarConIVA) {
        this.valorPagarConIVA = valorPgarConIVA * (int) IVA;
    }

    public int getValorTotalPagar() {
        return valorTotalPagar;
    }

    public void setValorTotalPagar(int valorTotalPagar) {
        this.valorTotalPagar = valorTotalPagar;
    }

    public int getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(int consecutivo) {
        this.consecutivo = consecutivo;
    }

    public String getProvedor() {
        return provedor;
    }

    public void setProvedor(String provedor) {
        this.provedor = provedor;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getCantidades() {
        return cantidades;
    }

    public void setCantidades(String cantidades) {
        this.cantidades = cantidades;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getPrecioComprado() {
        return precioComprado;
    }

    public void setPrecioComprado(int precioComprado) {
        this.precioComprado = precioComprado;
    }

    public float getIVA() {
        return IVA;
    }
    
    /* realizar calculo de la cantidad de dinero que debe pagar por esa compra
    Para eso tiene en cuenta el impuesto del IVA que es
    del 19% para todos los productos, anotando el valor a pagar sin IVA, el
    valor a pagar por concepto de IVA y el valor total a pagar
    
     */
   
    

}
