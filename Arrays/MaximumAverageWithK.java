package SlidingWindow;

public class MaximumAverageWithK {
    public static double maxAverage(int arr[],int k){
        double maxaverage=Double.NEGATIVE_INFINITY;
        int windowSum=0;
        for(int i=0;i<k;i++){
            windowSum+=arr[i];
        }
        maxaverage=Math.max(maxaverage,(double)windowSum/k);
        for(int i=k;i<arr.length;i++){
            windowSum=windowSum-arr[i-k]+arr[i];
            maxaverage=Math.max(maxaverage,(double)windowSum/k);//here use double for type casting other decimals should wrap
        }
        return maxaverage;

    }

    public static void main(String[] args) {
        int[] arr={1,12,-5,-6,50,3};

        System.out.println(maxAverage(arr,4));
        int[] arr1={5,5,5,5};
        System.out.println(maxAverage(arr1,2));

        int[] arr2={0,4,0,3,2};
        System.out.println(maxAverage(arr2,1));
        int[] arr3={-1,-12,-5,-6,-50,-3};
        System.out.println(maxAverage(arr3,2));

        int[] arr4={10,20,30};
        System.out.println(maxAverage(arr4,3));
    }
}
