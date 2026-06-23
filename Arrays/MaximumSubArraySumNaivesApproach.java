package SlidingWindow;

public class MaximumSubArraySumNaivesApproach {
    public static int maxSum(int[] arr,int k){
        int MaxSum=Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-k;i++){
            int cSum=0;
            for(int j=i;j<i+k;j++){
                cSum+=arr[j];

            }
            if(cSum>MaxSum){
                MaxSum=cSum;
            }
        }
        return MaxSum;
    }

    public static void main(String[] args) {
        int[] arr={1,2,4,5,6,9};
        System.out.println(maxSum(arr,3));
    }
}
