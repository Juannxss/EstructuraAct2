package EstrcucturaAct2;

import static EstrcucturaAct2.InsertionSort.insertionSort;
import static EstrcucturaAct2.BubbleSort.bubbleSort;
import static EstrcucturaAct2.QuickSort.quickSort;
import static EstrcucturaAct2.RandomSort.randomSort;

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

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + ", ");
        }
        System.out.println();
        System.out.println();

        System.out.println("---RandomSort---");
        randomSort(arr3);

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + ", ");
        }

        System.out.println();
        System.out.println();

    }

}
