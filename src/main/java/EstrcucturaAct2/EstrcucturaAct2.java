package EstrcucturaAct2;

import static EstrcucturaAct2.AlgoritmosOrdenamientoArreglos.insertionSort;
import static EstrcucturaAct2.AlgoritmosOrdenamientoArreglos.bubbleSort;
import static EstrcucturaAct2.AlgoritmosOrdenamientoArreglos.quickSort;
import static EstrcucturaAct2.AlgoritmosOrdenamientoArreglos.randomSort;
import static EstrcucturaAct2.AlgoritmosOrdenamientoArreglos.selectionSort;
import java.util.*;

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

        ProductoComprado arroz = new ProductoComprado(1, "Diana", "42456", "desconocido", "30-09-2004", "gr", 120000, 120000, 120000, "1234", "Arroz", "Diana", "blanco", 500, "Cereal", 120000, 150000, 12, 30);
        ProductoComprado maiz = new ProductoComprado(2, "Diana", "47371", "desconocido", "30-09-2004", "gr", 110000, 110000, 110000, "1235", "Maiz", "Diana", "blanco", 1000, "Grano", 110000, 135000, 9, 25);
        ProductoComprado frijoles = new ProductoComprado(3, "Diana", "32444", "desconocido", "30-09-2004", "gr", 110000, 110000, 110000, "1236", "Frijoles", "Diana", "rojos", 1000, "Grano", 110000, 145000, 9, 15);
        ProductoComprado papas = new ProductoComprado(4, "Papafacil", "43421", "desconocido", "30-09-2004", "gr", 24000, 24000, 24000, "1237", "Papas", "Papafacil", "amarillas", 1000, "Tuberculo", 24000, 35000, 6, 10);
        ProductoComprado avena = new ProductoComprado(5, "Quaker", "99494", "desconocido", "30-09-2004", "gr", 50000, 50000, 50000, "1238", "Avena", "Quaker", "blanco", 500, "Cereal", 50000, 60000, 10, 5);
        ProductoComprado arepas = new ProductoComprado(6, "Donmaiz", "42424", "desconocido", "30-09-2004", "gr", 15000, 15000, 15000, "1239", "arepas", "Donmaiz", "blanco", 1000, "Grano", 15000, 20000, 5, 99);
        ProductoComprado cafe = new ProductoComprado(7, "Sello Rojo", "96346", "desconocido", "30-09-2004", "gr", 300000, 300000, 300000, "12310", "Cafe", "Sello Rojo", "negro", 500, "Grano", 300000, 300000, 20, 40);

        System.out.println();
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
        /*         try {
        
        System.out.println("Estos son los codigos de los productos existentes");
        
        for (byte i = 0; i < listt.tamaño(); i++) {
        
        ProductoComprado j = new ProductoComprado();
        j = listt.traerElemento(i);
        System.out.println("Codigo: " + j.getCodigoProducto() + " Producto: " + j.getNombre());
        
        }
        System.out.println();
        System.out.println("Digite el codigo del producto");
        System.out.print("R//");
        String codigoActualizar = teclado.nextLine();
        
        System.out.println("Digite el precio de compra a acualizar");
        System.out.print("R//");
        int actualizarPrecioCompra = teclado.nextInt();
        
        System.out.println("Digite el porcentaje maximo de descuento de la compra a acualizar");
        System.out.print("R//");
        int actualizarPorcentajeMax = teclado.nextInt();
        
        for (byte i = 0; i < listt.tamaño(); i++) {
        
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
        System.out.println("Se actualizaron los datos del producto " + j.getNombre());
        
        }
        
        }
        
        } catch (Exception e) {
        System.out.println("-----Error!!-----");
        System.out.println("verifique que el precio y porcentaje sean numeros enteros");
        }
        */ 
        System.out.println();
        //consecutivo ,fecha, cedula , medio de pago , modalidad(directa o domicilio), nombre, primer apellido, segundo apellido, fecha nacimiento, numero telefono, email, direccion , estado(VIP o referido), genero
        ClienteInteresado juan = new ClienteInteresado(1, "20-10-2004", "1043963744", "targeta", "domicilio", "Juan", "Lopez", "Castañeda", "30-09-2004", "3145379015", "juanitoalcachofa@gmail.com", "Turbana-Bolivar", "VIP", 'M');
        ClienteInteresado jose = new ClienteInteresado(2, "11-12-2004", "1043998967", "targeta", "domicilio", "Jose", "Muñoz", "Lamadrid", "10-07-2004", "3003232342", "juanitoalcachofavip@gmail.com", "Los Angeles-Bolivar", "VIP", 'M');
        ClienteInteresado martha = new ClienteInteresado(3, "12-02-2005", "39554745", "efectivo", "directa", "Martha", "Lopez", "Castañeda", "13-02-1995", "32076789", "martikaalcachofa@gmail.com", "Girardota-Antioquia", "referido", 'F');
        ClienteInteresado thamis = new ClienteInteresado(4, "21-11-2006", "105445589", "efectivo", "directa", "Thamis", "Espinosa", "De Arco", "15-06-2003", "315839567", "alejandraalcachofa@gmail.com", "Membrillal-Bolivar", "referido", 'F');

        /*
         En caso de que la venta se realice, Fulanito consulta la libreta de ventas
         para buscar el codigo de esa venta y modifica al estado de la venta
         para cambiarle el valor por éxito, pero, si la venta no se realiza,
         entonces, Fulanito cambia el estado a cancelada y agrega un breve
         motivo
         */
        System.out.println("Lista de productos");
        for (byte i = 0; i < listt.tamaño(); i++) {
            ProductoComprado j = new ProductoComprado();
            j = listt.traerElemento(i);
            System.out.println(j.getNombre());

        }
        String motivo;
        
        System.out.println();
        try {
            System.out.println("Que producto desea vender");
            System.out.print("R//");
            String productoVender =teclado.next();
            
          
            System.out.println("Ingrese SI para continuar o NO para cancelar ");
            System.out.print("R//");
            String palabra = teclado.next();

            for (byte i = 0; i < listt.tamaño(); i++) {

                
                ProductoComprado j = new ProductoComprado();
                j = listt.traerElemento(i);
                System.out.println(j.getNombre());
                String pal = j.getNombre();
                if (  palabra.equalsIgnoreCase("SI")) {
                    if(productoVender.equals(pal)){
                          j.setEstadoVenta("Exito");
                    System.out.println("El estado de la venta cambio a Exito");
                    break;
                    }

                  

                } else {
                    j.setEstadoVenta("Cancelada");
                    System.out.println("El estado de la venta cambio a Cancelada");
                    System.out.println();
                    System.out.println("Motivo por el cual fue cancelada la venta ");
                    System.out.print("R//");
                    motivo = teclado.nextLine();
                    break;
                }

            }

        } catch (Exception e) {
            System.out.println("Asegurese de que la respuesta sea SI o NO para evitar errores");
        }
        System.out.println();
        System.out.println("");
        System.out.println("Digite el primer nombre del cliente que esta interesado en realizar una compra");
        System.out.print("R//");
        String var = teclado.nextLine();

        switch (var) {
            case "juan":

                break;

            case "jose":

                break;

            case "thamis":

                break;
            case "martha":

                break;

            default:
                System.out.println("No se econctro el nombre del ciente");
                System.out.println("Si esta seguro de que ese es el nombre digitelo en minuscula");
                break;
        }

    }

}
