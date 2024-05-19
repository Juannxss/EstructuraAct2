package EstrcucturaAct2;

public class QuickSort {

    public static void quickSort(int[] arr, int low, int hight) {
        if (low < hight) {
            int indexPivot = partition(arr, low, hight);
            quickSort(arr, low, indexPivot - 1);
            quickSort(arr, indexPivot + 1, hight);
        }
    }

    public static int partition(int[] arr, int low, int hight) {
        int pivot = arr[hight];
        int i = low -1;
        for (int j = low; j < hight; j++) {
            if (arr[j]<pivot){
                i++;
                
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                
                
                
            }
        }
        
        int temp = arr[i+1];
        arr[i+1]=arr[hight];
        arr[hight]=temp;
        return i+1;

    }
   

}


