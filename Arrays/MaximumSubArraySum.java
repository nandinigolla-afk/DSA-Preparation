package Kadanes;

public class MaximumSubArraySum {
    //brute force
    public static int bruteMax(int[] arr){
        int Max=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum>Max){
                    Max=sum;
                }
            }

        }
        return Max;
    }
    //kadanes algorithm
    public static int optimalMax(int[] arr){
        int maxSum=arr[0];
        int sum=arr[0];

        for(int i=1;i<arr.length;i++){
            if(sum>=0){
                sum+=arr[i];
            }
            else
                sum=arr[i];
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr={-2,-3,4,-1,-2,1,5,-3};
        System.out.println(bruteMax(arr));
        System.out.println(optimalMax(arr));
    }
}
