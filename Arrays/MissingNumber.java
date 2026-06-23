package BasicArrays;

public class MissingNumber {
    //given a range of numbers from 0 to n we need to find the missing number
    public static int missingNum(int[] arr){
        int n=arr.length;
        int maxSum=(n*(n+1))/2;
        int currentSum=0;
        for(int x:arr){
            currentSum+=x;
        }
        return maxSum-currentSum;
    }

    public static void main(String[] args) {
        int arr[]={7,1,5,9,3,0,2,6};
        System.out.println(missingNum(arr));

    }
}
