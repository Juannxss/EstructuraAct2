package EstrcucturaAct2;

import static EstrcucturaAct2.AlgoritmosOrdenamientoArreglos.insertionSort;
import static EstrcucturaAct2.AlgoritmosOrdenamientoArreglos.bubbleSort;
import static EstrcucturaAct2.AlgoritmosOrdenamientoArreglos.quickSort;
import static EstrcucturaAct2.AlgoritmosOrdenamientoArreglos.randomSort;
import static EstrcucturaAct2.AlgoritmosOrdenamientoArreglos.selectionSort;
import java.util.*;
import java.util.stream.Stream;

public class EstrcucturaAct2 {
    
    public static void main(String[] args) {
        
        int[] arr = {21, 43, 77, 11, 8, 1, 35, 100};
        
        System.out.println("---InsertionSort---");
        insertionSort(arr);//Se llama al metodo para ordenar el arreglo 

        for (byte i = 0; i < arr.length; i++) {//Se recorre e imprime el arreglo ordenado
            System.out.print(arr[i] + ", ");
        }
        
        System.out.println(" ");
        System.out.println(" ");
        
        System.out.println("---BubbleSort---");
        int[] arr2 = {33, 55, 86, 17, 26};
        
        bubbleSort(arr2);//Se llama al metodo para ordenar el arreglo

        for (byte i = 0; i < arr2.length; i++) {//Se recorre e imprime el arreglo ordenado
            System.out.print(arr2[i] + ", ");
        }
        System.out.println();
        
        System.out.println();
        
        System.out.println("---QuickSort---");
        int[] arr3 = {1, 3, 99, 57, 3, 20, 14};
        
        quickSort(arr3, 0, arr3.length - 1);
        
        for (byte i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + ", ");
        }
        System.out.println();
        System.out.println();
        
        System.out.println("---RandomSort---");
        randomSort(arr3);
        
        for (byte i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + ", ");
        }
        
        System.out.println();
        System.out.println();
        
        System.out.println("---SelectionSort---");
        selectionSort(arr3);
        
        for (byte i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + ", ");
        }
        
        System.out.println();
        System.out.println();
        
        System.out.println("-----LISTA PERSONALIZADA----");
        
        ProductoComprado arroz = new ProductoComprado(1, "Diana", "42456", "30-09-2004", "gr", 120000, 120000, 120000, "1234", "Arroz", "Diana", "blanco", 500, "Cereal", 120000, 150000, 12, 30);
        ProductoComprado maiz = new ProductoComprado(2, "Diana", "47371", "30-09-2004", "gr", 110000, 110000, 110000, "1235", "Maiz", "Diana", "blanco", 1000, "Grano", 110000, 135000, 9, 25);
        ProductoComprado frijoles = new ProductoComprado(3, "Diana", "32444", "30-09-2004", "gr", 110000, 110000, 110000, "1236", "Frijoles", "Diana", "rojos", 1000, "Grano", 110000, 145000, 9, 15);
        ProductoComprado papas = new ProductoComprado(4, "Papafacil", "43421", "30-09-2004", "gr", 24000, 24000, 24000, "1237", "Papas", "Papafacil", "amarillas", 1000, "Tuberculo", 24000, 35000, 6, 10);
        ProductoComprado avena = new ProductoComprado(5, "Quaker", "99494", "30-09-2004", "gr", 50000, 50000, 50000, "1238", "Avena", "Quaker", "blanco", 500, "Cereal", 50000, 60000, 10, 5);
        ProductoComprado arepas = new ProductoComprado(6, "Donmaiz", "42424", "30-09-2004", "gr", 15000, 15000, 15000, "1239", "arepas", "Donmaiz", "blanco", 1000, "Grano", 15000, 20000, 5, 99);
        ProductoComprado cafe = new ProductoComprado(7, "Sello Rojo", "96346", "30-09-2004", "gr", 300000, 300000, 300000, "12310", "Cafe", "Sello Rojo", "negro", 500, "Grano", 300000, 300000, 20, 40);
        
        ListaSimple listt = new ListaSimple();
        
        listt.insertarPrimero(arroz);
        listt.insertarFinal(papas);
        listt.insertarFinal(maiz);
        listt.insertarFinal(frijoles);
        listt.insertarFinal(arepas);
        listt.insertarFinal(avena);
        listt.insertarFinal(cafe);
        /*
        Por cada compra que Fulanito realiza toma la libreta donde tiene
        anotados los productos que ha comprado, busca el producto por su
        código para actualizar el precio de compra, el precio de venta (el 40%
        del precio de compra), el porcentaje máximo de descuento y las
        unidades de existencia (suma las unidades compradas a las a
        unidades actuales)
         */
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite el codigo del producto");
        System.out.print("R//");
        String codigoActualizar = teclado.nextLine();
        
        System.out.println("Digite el precio de compra a acualizar");        
        System.out.print("R//");
        int actualizarPrecioCompra = teclado.nextInt();
        
        System.out.println("Digite el porcentaje maximo de descuento de la compra a acualizar");        
        System.out.print("R//");
        int actualizarPorcentajeMax = teclado.nextInt();
        
        for (int i = 0; i < listt.tamaño(); i++) {
            
            ProductoComprado j = new ProductoComprado();
            j = listt.traerElemento(i);
           
            if (codigoActualizar.equalsIgnoreCase(j.getCodigoProducto())) {
                j.setPrecioCompra(actualizarPrecioCompra);
                int actualizarPrecioVenta = (int) (actualizarPrecioCompra * 0.4);
                j.setPrecioVenta(actualizarPrecioVenta);
                j.setPorcentajeDescuentoMax(actualizarPorcentajeMax);
                int unidadesExistentes = j.getUnidadesEnExistencia();
                
                int sumaUnidades = unidadesExistentes + unidadesExistentes;
                j.setUnidadesEnExistencia(sumaUnidades);
                System.out.println("Se actualizaron los datos del producto "+j.getNombre());
           
            }
            
        }
        
    }
    
}
