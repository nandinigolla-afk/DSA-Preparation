package PreFixSum;

import java.util.HashMap;

public class NoOfSubArraySumEqualsK {
    public static int subLength(int[] arr,int k){
        int sum=0;
        int count=0;
        HashMap<Integer,Integer> set=new HashMap<>();
        set.put(0,1);
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(set.containsKey(sum-k)) {
                count+=set.get(sum-k);
            }
                set.put(sum,set.getOrDefault(sum,0)+1);


        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={1,1,1};
        System.out.println(subLength(arr,2));
    }
}
