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

        //Se crean los objetos que se guardaran en la lista
        ProductoComprado arroz = new ProductoComprado(1, "Diana", "42456", "desconocido", "30-09-2004", "gr", 120000, 120000, 120000, "1234", "Arroz", "Diana", "blanco", 500, "Cereal", 120000, 150000, 12, 30);
        ProductoComprado maiz = new ProductoComprado(2, "Diana", "47371", "desconocido", "30-09-2004", "gr", 110000, 110000, 110000, "1235", "Maiz", "Diana", "blanco", 1000, "Grano", 110000, 135000, 9, 25);
        ProductoComprado frijoles = new ProductoComprado(3, "Diana", "32444", "desconocido", "30-09-2004", "gr", 110000, 110000, 110000, "1236", "Frijoles", "Diana", "rojos", 1000, "Grano", 110000, 145000, 9, 15);
        ProductoComprado papas = new ProductoComprado(4, "Papafacil", "43421", "desconocido", "30-09-2004", "gr", 24000, 24000, 24000, "1237", "Papas", "Papafacil", "amarillas", 1000, "Tuberculo", 24000, 35000, 6, 10);
        ProductoComprado avena = new ProductoComprado(5, "Quaker", "99494", "desconocido", "30-09-2004", "gr", 50000, 50000, 50000, "1238", "Avena", "Quaker", "blanco", 500, "Cereal", 50000, 60000, 10, 5);
        ProductoComprado arepas = new ProductoComprado(6, "Donmaiz", "42424", "desconocido", "30-09-2004", "gr", 15000, 15000, 15000, "1239", "arepas", "Donmaiz", "blanco", 1000, "Grano", 15000, 20000, 5, 99);
        ProductoComprado cafe = new ProductoComprado(7, "Sello Rojo", "96346", "desconocido", "30-09-2004", "gr", 300000, 300000, 300000, "12310", "Cafe", "Sello Rojo", "negro", 500, "Grano", 300000, 300000, 20, 40);

        System.out.println();
        //Se inicializa la lista personalizada
        ListaSimple listt = new ListaSimple();
        //Se agregan los productos a la lista
        listt.insertarPrimero(arroz);
        listt.insertarFinal(papas);
        listt.insertarFinal(maiz);
        listt.insertarFinal(frijoles);
        listt.insertarFinal(arepas);
        listt.insertarFinal(avena);
        listt.insertarFinal(cafe);

        //Se llama a la clase Scanner para guardar los datos por teclado
        Scanner teclado = new Scanner(System.in);
        try {

            System.out.println("Estos son los codigos de los productos existentes");

            //bucle para imprimir los porductos de la lista con su codigo
            for (byte i = 0; i < listt.tamaño(); i++) {

                ProductoComprado j = new ProductoComprado();//Se crea un objeto como variable 
                j = listt.traerElemento(i);//Se guardan los objetos en la variable
                //imprimir codigo y prodcuto de la lista
                System.out.println("Codigo: " + j.getCodigoProducto() + " Producto: " + j.getNombre());

            }
            System.out.println();
            System.out.println("Actualizar datos de productos");
            System.out.println("Si desea atualizar los datos de un producto escriba SI, de lo contrario esciba NO");
            System.out.print("R//");
            String yesOrNo = teclado.next();

            //Bucle while para actualizar los datos de los productos
            while (yesOrNo.equalsIgnoreCase("Si")) {
                System.out.println();
                System.out.println("Digite el codigo del producto");
                System.out.print("R//");
                String codigoActualizar = teclado.next();//Se almacena el codigo del producto por teclado

                System.out.println("Digite el precio de compra a acualizar (numero entero)");
                System.out.print("R//");
                int actualizarPrecioCompra = teclado.nextInt();//Se alamcena el precio de compra por teclado

                System.out.println("Digite el porcentaje maximo de descuento de la compra a acualizar (numero entero)");
                System.out.print("R//");
                int actualizarPorcentajeMax = teclado.nextInt();//se almacena el porcentaje maximo por teclado

                //bucle para recorrer la lista
                for (byte i = 0; i < listt.tamaño(); i++) {

                    ProductoComprado j = new ProductoComprado();
                    j = listt.traerElemento(i);

                    //verificacion de que el codigo ingresado por teclado sea igual al del producto requerido
                    if (codigoActualizar.equalsIgnoreCase(j.getCodigoProducto())) {
                        j.setPrecioCompra(actualizarPrecioCompra);//Se actualiza el precio de venta 
                        int actualizarPrecioVenta = (int) (actualizarPrecioCompra * 0.4);//se crea una variable para actualizar el precio de venta con el 40%
                        j.setPrecioVenta(actualizarPrecioVenta);//Se actualiza el precio de venta 
                        j.setPorcentajeDescuentoMax(actualizarPorcentajeMax);//se actualiza el porcentaje maximo de descuento
                        int unidadesExistentes = j.getUnidadesEnExistencia();

                        int sumaUnidades = unidadesExistentes + unidadesExistentes;//se calculan las unidades existentes
                        j.setUnidadesEnExistencia(sumaUnidades);//se actualizan las unidades existentes del producto
                        System.out.println("Se actualizaron los datos del producto " + j.getNombre());

                    }

                }
                System.out.println();
                System.out.println("Quiere actualizar los datos de otro producto?");
                System.out.print("R//");
                yesOrNo = teclado.next();
            }

        } catch (Exception e) {
            System.out.println("-----Error!!-----");
            System.out.println("verifique que el precio y porcentaje sean numeros enteros");
        }

        System.out.println();

        //Se crean los objetos de tipo cliente Iteresado con sus atributos
        ClienteInteresado juan = new ClienteInteresado(1, "20-10-2004", "1043963744", "targeta", "domicilio", "Juan", "Lopez", "Castañeda", "30-09-2004", "3145379015", "juanitoalcachofa@gmail.com", "Turbana-Bolivar", "desconocido", 'M', 0);
        ClienteInteresado jose = new ClienteInteresado(2, "11-12-2004", "1043998967", "targeta", "domicilio", "Jose", "Muñoz", "Lamadrid", "10-07-2004", "3003232342", "juanitoalcachofavip@gmail.com", "Los Angeles-Bolivar", "desconocido", 'M', 0);
        ClienteInteresado martha = new ClienteInteresado(3, "12-02-2005", "39554745", "efectivo", "directa", "Martha", "Lopez", "Castañeda", "13-02-1995", "32076789", "martikaalcachofa@gmail.com", "Girardota-Antioquia", "desconocido", 'F', 0);
        ClienteInteresado thamis = new ClienteInteresado(4, "21-11-2006", "105445589", "efectivo", "directa", "Thamis", "Espinosa", "De Arco", "15-06-2003", "315839567", "alejandraalcachofa@gmail.com", "Membrillal-Bolivar", "desconocido", 'F', 0);

        int numVentas = 0;//Se crea una variable para llevar el control de las ventas
        System.out.println("Lista de productos");
        for (byte i = 0; i < listt.tamaño(); i++) {
            ProductoComprado j = new ProductoComprado();
            j = listt.traerElemento(i);
            System.out.println("Producto: " + j.getNombre() + " unidades: " + j.getUnidadesEnExistencia());

        }
        System.out.println();
        System.out.println("Cuantos prodcutos va a vender");
        System.out.print("R//");
        int cant = teclado.nextInt();//Se almacena la cantidad de productos que se van a vender
        System.out.println();
        long cantidadRecuperada = 0;//variable para saber cuato dinero se recupero de las ventas
        try {

            String motivo;//variable para guardar el motivo en caso de cancelar la venta

            for (int o = 1; o <= cant; o++) {

                System.out.println("Que producto desea vender");
                System.out.print("R//");
                String productoVender = teclado.next();//se guarda el nombre del producto a vender por teclado

                System.out.println("Ingrese SI para continuar o NO para cancelar ");
                System.out.print("R//");
                String palabra = teclado.next();//palabra de control
                System.out.println();

                for (byte i = 0; i < listt.tamaño(); i++) {

                    ProductoComprado j = new ProductoComprado();
                    j = listt.traerElemento(i);

                    String pal = j.getNombre();//se guarda el nombre del producto en una variable
                    if (palabra.equalsIgnoreCase("SI")) {//Se verifica si la palabra del control es SI
                        if (productoVender.equals(pal)) {//Se verifica si l nombre del producto a vender es igual al objeto en la iteracion
                            j.setEstadoVenta("Exito");//Se actualiza el estado de la venta 

                            System.out.println("El estado de la venta cambio a Exito");
                            System.out.println();
                            numVentas++;//la variable aumneta por cada venta exitosa
                            cantidadRecuperada = j.getPrecioVenta() + cantidadRecuperada;//se suma el dinero de las ventas para cacular el dinero recuperado
                            break;
                        }

                    } else {
                        j.setEstadoVenta("Cancelada");
                        System.out.println();
                        System.out.println("El estado de la venta cambio a Cancelada");
                        System.out.println();
                        System.out.println("Motivo por el cual fue cancelada la venta ");
                        System.out.print("R//");
                        motivo = teclado.nextLine();
                        break;
                    }

                }
            }

        } catch (Exception e) {
            System.out.println("Asegurese de que la respuesta sea SI o NO y el numero de productos a vender se un numero entero para evitar errores");
        }
        System.out.println();

        for (int i = 0; i < listt.tamaño(); i++) {

            ProductoComprado k = new ProductoComprado();
            k = listt.traerElemento(i);
            if (k.getEstadoventa().equalsIgnoreCase("Exito")) {//Se verifica si el estado de la venta coincide con la palabra
                int val = k.getUnidadesEnExistencia();

                k.setUnidadesEnExistencia(val - cant);//desminuye las unidades del prodcuto dependiendo de cuantos se compraron

            }

        }
        System.out.println();
        System.out.println("Las unidades existentes fueron actualizadas ");
        for (int i = 0; i < listt.tamaño(); i++) {

            ProductoComprado k = new ProductoComprado();
            k = listt.traerElemento(i);
            System.out.println("Producto: " + k.getNombre() + " Unidades: " + k.getUnidadesEnExistencia());
        }

        System.out.println();
        System.out.println("Digite el primer nombre del cliente en minuscula");
        String primer = teclado.next();//variable para almacenar el nombre del cliente 
        System.out.println();
        System.out.println("En caso de ser su primera compra digite Si, de lo contrario digite NO");
        String il = teclado.next();//variable de control

        System.out.println(juan.getNombre());
        System.out.println(jose.getNombre());
        System.out.println(martha.getNombre());
        System.out.println(thamis.getNombre());
        System.out.println();

        switch (primer) {//switch para cada caso de cliente 
            case "juan":

                if (il.equalsIgnoreCase("si")) {//si es la primera vez que compra su estado es referido, de lo contrario es VIP
                    juan.setEstado("Referido");
                } else {
                    juan.setEstado("VIP");
                }
                juan.setNumeroCompras(numVentas);//se actualiza en numero de compras realizadas
                break;

            case "jose":
                if (il.equalsIgnoreCase("si")) {
                    jose.setEstado("Referido");
                } else {
                    jose.setEstado("VIP");
                }
                jose.setNumeroCompras(numVentas);
                break;
            case "martha":
                if (il.equalsIgnoreCase("si")) {
                    martha.setEstado("Referido");
                } else {
                    martha.setEstado("VIP");
                }
                martha.setNumeroCompras(numVentas);
                break;
            case "thamis":
                if (il.equalsIgnoreCase("si")) {
                    thamis.setEstado("Referido");
                } else {
                    thamis.setEstado("VIP");
                }
                thamis.setNumeroCompras(numVentas);

                break;

            default:
                System.out.println("NO se encotro el cliente");
                System.out.println("Si esta seguro que ese es el nombre digitelo en minuscula");

        }

        System.out.println("Estos son los productos que necesitan ser abastecidos");
        for (byte i = 0; i < listt.tamaño(); i++) {

            ProductoComprado k = new ProductoComprado();
            k = listt.traerElemento(i);

            if (k.getUnidadesEnExistencia() < 5) {//imprime los productos cuyas unidades existentes son menores a 5
                System.out.println("Producto: " + k.getNombre() + " unidades: " + k.getUnidadesEnExistencia());

            }

        }
        System.out.println();

        long total = 0;//variable para saber cual es el total de dinero invertido 
        System.out.println("---Balance financiero del negocio---");
        System.out.println();

        for (byte i = 0; i < listt.tamaño(); i++) {

            ProductoComprado k = new ProductoComprado();
            k = listt.traerElemento(i);

            total = k.getPrecioComprado() + total;//se suma el precio de compra de cada producto 

        }
        System.out.println("El total fue de dinero invertido en productos fue " + total + " $");//se imprime el dinero total invertido

        System.out.println("El total de dinero recuperado es de " + cantidadRecuperada + " $");//se imprime el dinero recuperado por las ventas

        long ganancia;//variable para saber cuales fueron las ganancias
        if (cantidadRecuperada > total) {//se verifica si el dinero recuperado es mayor al dinero invertido
            ganancia = cantidadRecuperada - total;//calcula la ganacia restando el dinero recuperado por el dinero total invertido

            System.out.println("El total las ganacias fueron de " + ganancia + " $");//imprime la ganacia
        }

        double pagarIVA = 0;//variable para saber cual es el valor total que pago con IVA
        for (byte i = 0; i < listt.tamaño(); i++) {

            ProductoComprado k = new ProductoComprado();
            k = listt.traerElemento(i);

            pagarIVA = k.getValorPagarConIVA() + pagarIVA;//Se suma todos los precios con IVA de los productos

        }
        System.out.println("El total del dinero que ha pagado con IVA es " + pagarIVA + " $");//Se imprime el total pagado con IVA

    }

}
