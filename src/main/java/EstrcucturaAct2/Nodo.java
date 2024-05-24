package EstrcucturaAct2;

public class Nodo {

     private ProductoComprado elemento;
     Nodo siguiente;

    public Nodo(ProductoComprado element, Nodo  sig) {
        elemento = element;
        siguiente = sig;

    }

    public ProductoComprado getElemento() {
        return elemento;
    }

    public void setElemento(ProductoComprado elemento) {
        this.elemento = elemento;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    

}
