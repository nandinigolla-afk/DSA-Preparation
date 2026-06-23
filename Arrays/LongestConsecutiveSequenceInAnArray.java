package BasicArrays;

import java.util.HashSet;

public class LongestConsecutiveSequenceInAnArray {
    public static int longestSequence(int[] arr){
        if(arr.length==0)return 0;
        HashSet<Integer> set=new HashSet<>();
        for(int x:arr)
            set.add(x);
        int longest=0;
        for(int x:set){
            if(!set.contains(x-1)){
                int currentElement=x;
                int large=1;
                while(set.contains(currentElement+1)){
                    currentElement++;
                    large++;
                }
                longest=Math.max(longest,large);
            }

        }
        return longest;
    }
    public static void main(String[] args) {
        //The problem asks us to find the longest consecutive sequence in an array
        //One possible approach is to sort the array and check if the number exist or not.But sorting an array takes
        //O(nlogn) time complexity.To make it faster we store all the numbers in a hashset,so we check if a number
        //exist in constant time.The number (num) is the start of the sequence only if num-1 is not present.
        //this whole process takes O(n) time  example: arr={100,4,200,1,3,2} the longest consecutive sequence is
        //1,2,3,4 so we need to return 4

        int arr[]={100,4,200,1,3,2,9,10,23,40,5,7,8,6};
        System.out.println(longestSequence(arr));
    }
}
