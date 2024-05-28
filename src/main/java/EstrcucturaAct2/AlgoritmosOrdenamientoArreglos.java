package EstrcucturaAct2;

public class AlgoritmosOrdenamientoArreglos {

    public static void bubbleSort(int[] arr) {
        int index;
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {

                    index = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = index;
                }
            }

        }
    }
    
    public static void insertionSort(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;

            }
            arr[j + 1] = key;

        }
    }

    public static void quickSort(int[] arr, int low, int hight) {
        if (low < hight) {
            int indexPivot = partition(arr, low, hight);
            quickSort(arr, low, indexPivot - 1);
            quickSort(arr, indexPivot + 1, hight);
        }
    }

    public static int partition(int[] arr, int low, int hight) {
        int pivot = arr[hight];
        int i = low - 1;
        for (int j = low; j < hight; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[hight];
        arr[hight] = temp;
        return i + 1;

    }

    public static void randomSort(int[] arr) {

        for (int i = arr.length - 1; i > 0; i--) {
            int random = (int) (Math.random() * (i + 1));
            int temp = arr[i];
            arr[i] = arr[random];
            arr[random] = temp;
        }
    }

    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int indexMin = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[indexMin]) {
                    indexMin = j;
                }

            }

            int temp = arr[i];

            arr[i] = arr[indexMin];
            arr[indexMin] = temp;
        }
    }

}
