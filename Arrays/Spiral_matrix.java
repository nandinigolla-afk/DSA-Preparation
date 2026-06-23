//----------------------------------spiral matrix
/* public class Spiral_matrix {

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4, 100},
        {5, 6, 7, 8, 200},
        {9, 10, 11, 12, 300},
        {13, 14, 15, 16, 400},
        {17, 18, 19, 20, 500}};
        spiral_array(arr);
    }

    public static void spiral_array(int arr[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length - 1;
        int endCol = arr[0].length - 1;
        while (startRow <= endRow && startCol <= endCol) {
            //printing top
            for (int i = startCol; i <= endCol; i++) {       //here startRow is fixed
                System.out.print(arr[startRow][i] + " ");
            }

            //printing right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");  //here endCol is fixed
            }

            //printing bottom
            for (int i = endCol - 1; i >= startCol; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(arr[endRow][i] + " ");  //here endRow is fixed
            }

            //printing right
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(arr[i][startCol] + " ");  //here startCol is fixed
            }
            //updating the variables
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }
}
 */

//------------------diagonal sum
/* import java.util.*;

class Spiral_matrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and coloumns :");
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (m != n) {
            System.out.println("Diagonol sum not possible");
            return;
        }
        int arr[][] = new int[n][m];
        System.out.println("Enter elements :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // int sum = 0;
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {
        //         if (i == j || i + j == n - 1) {
        //             sum += arr[i][j];
        //         }
        //     }
        // }

        int sum = 0;
        //--------optimised
        for (int i = 0; i < n; i++) {
            sum += arr[i][i];
            if (i != n - 1 - i) {
                sum += arr[i][n - 1 - i];
            }
        }

        System.out.println("Diagonal sum is " + sum);
    }
}
 */
//---transpose of a matrix
/* class Spiral_matrix {

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Before transpose ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int transpose[][] = new int[arr.length][arr[0].length];

        System.out.println("After transpose ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                transpose[i][j] = arr[j][i];

            }

        }
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
} */
//---------------search in sorted matrix
/* class Spiral_matrix {

    public static void main(String[] args) {
        int arr[][] = {{10, 20, 30, 40},
        {12, 21, 31, 41}, {13, 22, 33, 42}, {16, 27, 39, 80}};
        int key = 301;
        Staircase_search(arr, key);
    }

    //----------if we start searching with (0,m-1)th element
    // public static void Staircase_search(int arr[][], int key) {
    //     int row = 0, col = arr[0].length - 1;
    //     while (row != arr.length && col >= 0) {
    //         if (key == arr[row][col]) {
    //             System.out.println("Key Found at (" + row + "," + col + ")");
    //             return;
    //         } else if (key < arr[row][col]) {
    //             col--;
    //         } else {
    //             row++;
    //         }
    //     }
    //     System.out.println("Key not found!");
    //     return;
    // }
    //-------------------if we start searching with (n-1,0)th element
    public static void Staircase_search(int arr[][], int key) {
        int row = arr.length - 1, col = 0;
        while (col != arr[0].length && row > 0) {
            if (key == arr[row][col]) {
                System.out.println("Key found at (" + row + "," + col + ")");
                return;
            } else if (key > arr[row][col]) {
                col++;
            } else {
                row--;
            }
        }
        System.out.println("Key not found!");
        return;
    }
}
 */
//-------Print the number of 7’s that are in the 2d array.
/*class Spiral_matrix {

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 7}, {7, 2, 7, 2}, {1, 9, 8, 7}, {8, 3, 7, 9}};
        int key = 7;
        System.out.println("There are " + frequency(arr, key) + " " + key + "'s");
    }

    public static int frequency(int arr[][], int key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) {
                    count += 1;
                }
            }
        }
        return count;
    }
}
 */
//---------------------------Print out the sum of the numbers in the second row of the “nums” array.
import java.util.*;

class Spiral_matrix {

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 100, 1000}};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  row to get it's sum :");
        int n = sc.nextInt();
        System.out.println("The sum is " + sum(arr, n));
    }

    public static int sum(int arr[][], int n) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == n - 1) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
}
