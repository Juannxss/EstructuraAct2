package EstrcucturaAct2;

public class BubbleSort {
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
}




