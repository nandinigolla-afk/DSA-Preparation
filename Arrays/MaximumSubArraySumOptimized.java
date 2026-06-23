package SlidingWindow;
import java.util.*;
public class MaximumSubArraySumOptimized {
    public static int maxSum(int[] arr,int k){
        int wSum=0;
        int mSum=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            wSum+=arr[i];
        }
         if(wSum>mSum) mSum=wSum;
        for(int i=k;i<arr.length;i++){
            wSum=wSum-arr[i-k]+arr[i];
            mSum=Math.max(wSum,mSum);

        }
        return mSum;

    }
    public static void main(String[] args) {
        int arr[]={211,2,4,10,5,7,8};
        System.out.println(maxSum(arr,3));
    }
}
