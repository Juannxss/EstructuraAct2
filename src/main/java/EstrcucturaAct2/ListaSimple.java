package EstrcucturaAct2;

public class ListaSimple<T>{

    private Nodo primero;//puntero que indica el inicio de la lista
    private int NumElement;//tamaño de la lista

    public ListaSimple() {

    }

        public ProductoComprado traerElemento(int index) {
        Nodo actual = primero;
        for (int i = 0; i < index; i++) {
            actual = actual.getSiguiente();
            
        }
        return actual.getElemento();
    }
        
  

    public void insertarPrimero(ProductoComprado elemento) {
        Nodo nuevo = new Nodo(elemento, null);
        nuevo.siguiente = primero;
        primero = nuevo;
        NumElement++;

    }

    public void insertarFinal(ProductoComprado elemento) {
        Nodo nuevo = new Nodo(elemento, null);
        
        if (primero == null) {
            primero = nuevo;
        } else {
            Nodo actual = primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();

            }
            actual.setSiguiente(nuevo);
            NumElement++;
        }
    }

    public void borrar(ProductoComprado element) {
        if (primero == null) {
            System.out.println("Esta vacia");
        } else if (primero.getElemento() == element) {
            primero = primero.getSiguiente();
            NumElement--;
        } else {
            Nodo actual = primero;

            while (actual.getSiguiente() != null && actual.getSiguiente().getElemento() != element) {
                actual = actual.getSiguiente();
            }
            if (actual.getSiguiente() == null) {
                System.out.println("Elemento " + element + " no esta en la lista");
            } else {
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
                NumElement--;

            }

        }
    }

    public void listar() {
        Nodo actual = primero;
        System.out.print("[");
        while (actual.getSiguiente() != null) {
            System.out.print(actual.getElemento() + ", ");
            actual = actual.getSiguiente();
        }

        System.out.print(actual.getElemento());
        System.out.print("]");
    }

    public boolean esVacia() {
        return primero == null;

    }

    public int tamaño() {
        return NumElement;
    }

    public Nodo getPrimero() {
        return primero;
    }

    

   
}
