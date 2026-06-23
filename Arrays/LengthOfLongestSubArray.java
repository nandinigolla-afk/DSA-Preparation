package SlidingWindow;

public class LengthOfLongestSubArray {
    public static int length(int[] arr,int k){
        int maxLen=0;
        int currSum=0;
        int left=0;
        for(int right=0;right<arr.length;right++){
            currSum+=arr[right];
            while(currSum>k && left<=right){
                currSum-=arr[left];
                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr={4,2,1,7,8,1,2,8};
        System.out.println(length(arr,8));

        int[] arr1={1,2,3,4};
        System.out.println(length(arr1,5));
        int[] arr2={3,1,2,1};
        System.out.println(length(arr2,4));
        int[] arr3={1,1,1,1,1};
        System.out.println(length(arr3,3));

        int[] arr4={10,20,30};
        System.out.println(length(arr4,5));
    }
}
