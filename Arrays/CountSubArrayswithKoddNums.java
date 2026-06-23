package PreFixSum;

import java.util.HashMap;

public class CountSubArrayswithKoddNums {
    public static int countArray(int[] arr,int k){
        HashMap<Integer,Integer> set=new HashMap<>();
        int currentOdd=0;
        int result=0;
        set.put(0,1);
        for(int x:arr)
        {
            if((x&1)!=0){
                currentOdd++;
            }
            if(set.containsKey(currentOdd-k)){
                result +=set.get(currentOdd-k);
            }
            set.put(currentOdd, set.getOrDefault(currentOdd,0)+1);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr={1,10,9,21,2,1,5,9,11};
        System.out.println(countArray(arr,3));
    }

}
