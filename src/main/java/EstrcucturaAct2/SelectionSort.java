package EstrcucturaAct2;

public class SelectionSort {

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


