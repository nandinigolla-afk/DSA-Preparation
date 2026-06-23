package BasicArrays;

public class ArraySortedOrNot {
    public static boolean Issorted(int[] arr){
        int j=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[j]){
                j++;
            }
            else
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={1,2,9,3,4,5};
        if(Issorted(arr)){
            System.out.println("Array is sorted");
        }
        else
            System.out.println("Not sorted");
    }
}
