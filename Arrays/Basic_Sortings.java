
//---------------bubble sorting
/* 
public class Basic_Sortings {

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("After Sorting:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
} */
//------------selection sort
/* class Basic_Sortings {

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 7, 6, 3, 2};
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
 */
//--insertion sort
/* class Basic_Sortings {

    public static void main(String[] args) {
        int arr[] = {5, 2, 3, 1, 6, 4};
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > current) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = current;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
} */
//--counting sort
/* import java.util.*;

class Basic_Sortings {

    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 1, 2, 1, 4};
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                count[i]--;
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
} */
//--inbuilt sorting
/* import java.util.Arrays;
import java.util.Collections;

class Basic_Sortings {

    public static void main(String[] args) {
        Integer arr[] = {4, 3, 8, 1, 5, 2};
        //Arrays.sort(arr);
        // Arrays.sort(arr, 0, 3);
        // Arrays.sort(arr, 0, 3);

        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
 */
//---------sort arrays in descending order
//---bubble sort
/* class Basic_Sortings {

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 2, 9};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
 */
//selection sort
/* class Basic_Sortings {

    public static void main(String[] args) {
        int arr[] = {5, 2, 1, 4, 3};
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] < arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
 */
//insertion sort
/* class Basic_Sortings {

    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 3, 4};
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] < current) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = current;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
 */
