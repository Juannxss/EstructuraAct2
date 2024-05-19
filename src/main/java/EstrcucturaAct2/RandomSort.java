package EstrcucturaAct2;

public class RandomSort {

    public static void randomSort(int[] arr) {

        for (int i = arr.length - 1; i > 0; i--) {
            int random = (int) (Math.random() * (i + 1));
            int temp = arr[i];
            arr[i] = arr[random];
            arr[random] = temp;
        }
    }
    
}



