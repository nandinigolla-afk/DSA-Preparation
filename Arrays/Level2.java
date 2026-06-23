package PreFixSum;

import java.util.Arrays;
import java.util.HashMap;

public class Level2 {
    public static int subArraySumCount(int[] arr,int k){
        int sum=0,count=0;
        HashMap<Integer,Integer> set=new HashMap<>();
        set.put(0,1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(set.containsKey(sum-k)){
                count+=set.get(sum-k);
            }
            set.put(sum,set.getOrDefault(sum,0)+1);
        }
        return count;
    }

    //count subarrays with sum=0
    public static int subArrayWithZero(int[] arr){
        int sum=0,count=0;
        HashMap<Integer,Integer> set=new HashMap<>();
        set.put(0,1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(set.containsKey(sum)){
                count+=set.get(sum);
            }
            set.put(sum,set.getOrDefault(sum,0)+1);
        }
        return count;
    }

    ///length of longest subarray with sum equals to k
    public static int lengthOfsubArray(int[] arr,int k){
        HashMap<Integer,Integer> set=new HashMap<>();
        int maxLen=0,sum=0;
        set.put(0,-1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(set.containsKey(sum-k)){
                maxLen=Math.max(maxLen,i-set.get(sum-k));
            }
            if(!set.containsKey(sum)){
                set.put(sum,i);
            }
        }
        return maxLen;
    }
    public static boolean remianderLengthOfsubArray(int[] arr,int k){
        HashMap<Integer,Integer> set=new HashMap<>();
        int maxLen=0,sum=0;
        set.put(0,-1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            int remainder=sum%k;
            if(set.containsKey(remainder)){
                if(i-set.get(remainder)>=2){
                    return true;
                }
            }
            if(!set.containsKey(remainder)){
                set.put(remainder,i);
            }
        }
        return false;
    }

    //subarrays divisible by k
public static int divisibleByK(int[] arr,int k){
        int sum=0,count=0;
        HashMap<Integer,Integer> set=new HashMap<>();
        set.put(0,1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            int remainder=sum%k;
            if(remainder<0) remainder+=k;
            if(set.containsKey(remainder)){
                count+=set.get(remainder);
            }
            set.put(remainder,set.getOrDefault(remainder,0)+1);
        }
        return count;

}

//----binary array-no of subarrays whose sum equals k
    public static int binarySubArrays(int[] arr,int k){
        int count=0,sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={1,1,1};
        System.out.println(subArraySumCount(arr,2));

        int[] arr1={2,-2,3,-3};
        System.out.println(subArrayWithZero(arr1));

        int[] arr2={1,-1,5,-2,3};
        System.out.println(lengthOfsubArray(arr2,3));

        int[] arr3={4,5,0,-2,-3,1};
        System.out.println(divisibleByK(arr3,5));

        int[] arr5={23,2,4,6,7};
        System.out.println(remianderLengthOfsubArray(arr5,6));
        int[] bin={1,0,1,0,1};
        System.out.println(binarySubArrays(bin,2));
    }
}
