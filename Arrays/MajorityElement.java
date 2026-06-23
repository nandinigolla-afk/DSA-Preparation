package TwoPointers;

import java.util.HashMap;

public class MajorityElement {
    //brute force
    public static int bruteMajority(int[] arr){
        for(int i=0;i<arr.length;i++){
            int c=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    c++;
                }
            }
            if(c> arr.length/2) return arr[i];
        }
        return -1;
    }

    //using hashmap space complexity O(n) time O(nlogn)
    //usually it takes extra space so use optimal solution
    public static int hashMajority(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:arr){
            int count=map.getOrDefault(x,0)+1;
                map.put(x,count);
                if(count>arr.length/2)
                    return x;

        }
        return -1;

    }
    //optimal
    public static int optimalMajority(int[] arr){
        int count=0;
        int element=0;
        //boores voting algo
        for(int i=0;i<arr.length;i++){
            if(count==0){
                count=1;
                element=arr[i];
            }
            else if(arr[i]==element){
                count++;
            }
            else
                count--;
        }
        //verification
        int count1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                count1++;
            }

        }
    if(count1>arr.length/2)
        return element;
    return -1;
    }

    public static void main(String[] args) {
        int[] arr={7,7,5,7,5,1,5,7,5,5,7,7,5,5,5};
        System.out.println(optimalMajority(arr));
        System.out.println(hashMajority(arr));
        System.out.println(bruteMajority(arr));
    }
}
