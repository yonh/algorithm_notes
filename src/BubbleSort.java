
import java.util.Arrays;

/**
 * Created by yonh on 9/4/16Sunday.
 */
public class BubbleSort {

    public static void main(String[] args) {
        for (int i=2; i<10; i++) {
            int[] arr = new int[i];
            for (int j=0;j<i;j++) {
                arr[j] = (int)(Math.random()*100);
            }

            bubbleSort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void bubbleSort(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            for (int j=i; j<arr.length; j++) {

                if (arr[i] < arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
    }

}
