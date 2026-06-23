//------traping rain water
/* import java.util.*;

public class Traping_Rain_water {

    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int left_max_array[] = new int[arr.length];
        int right_max_array[] = new int[arr.length];
        int max = Integer.MIN_VALUE, maxx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
            left_max_array[i] = max;
        }
        for (int j = arr.length - 1; j >= 0; j--) {
            if (arr[j] > maxx) {
                maxx = arr[j];

            }
            right_max_array[j] = maxx;
        }
        System.out.println("These are left_max and right_max boundries or arrays");
        //these two arrays like left_max_array and right_max_array is called auxillary arrays
        for (int i = 0; i < left_max_array.length; i++) {
            System.out.print(left_max_array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < right_max_array.length; i++) {
            System.out.print(right_max_array[i] + " ");
        }
        System.out.println();
        int traped_water = 0;
        for (int i = 0; i < arr.length; i++) {
            traped_water += (min(left_max_array[i], right_max_array[i]) - arr[i]);//min function is uded to find water-level 
            //because traped water=(water_level-heigth of the building)*width here width is 1  

        }
        System.out.println("The traped water is " + traped_water);
    }

    public static int min(int n, int m) {
        if (n < m) {
            return n;
        }
        return m;
    } 
}*/

//---------------Buy and sell stocks for single transaction
/* import java.util.*;

class Traping_Rain_water {

    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 3, 6, 4};
        int buying = Integer.MAX_VALUE;
        int Maxprofit = 0;
        for (int i = 0; i < arr.length; i++) {
            if (buying < arr[i]) {
                int profit = (arr[i] - buying);
                if (Maxprofit < profit) {
                    Maxprofit = profit;
                }
            } else {
                buying = arr[i];
            }
        }
        System.out.println("Profit is " + Maxprofit);
    }
}
 */
//buy and sell stocks for multiple transactions
class Traping_Rain_water {

    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 3, 6, 4};
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                max += arr[i] = arr[i - 1];
            }
        }
        System.out.println(max);
    }
}
