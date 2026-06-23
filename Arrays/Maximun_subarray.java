//----brute force algorithm-----------O(n^2)
/* class Maximun_subarray{
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        int sum[]=new int[15];
        for(int i=0;i<arr.length;i++){
            int p=0;
            for(int j=i;j<arr.length;j++){
                int s=0;
                for(int k=i;k<=j;k++){
                    s=s+arr[k];
                    sum[p++]=s;
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
                 System.out.print("\n Sum of this array is "+s+"\n");
                }
            
            System.out.println();
        }
        for(int i=0;i<sum.length;i++){
            System.out.print(sum[i]+" ");
        }
        int[] result=sort(sum);
        System.out.println("Minimum :"+result[1]+" Maximum:"+result[0]);

    }
    public static int[] sort(int sum[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<sum.length;i++){
            if(sum[i]>largest)
            largest=sum[i];
            else if(sum[i]<smallest){
                smallest=sum[i];
            }
        }
        return new int[]{largest,smallest};
    }
} */


//---------------------maximum sub array sum O(n^2)
/* public class Maximun_subarray {

    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        
        int max = Integer.MIN_VALUE, current = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                current = (start == 0) ? prefix[end] : prefix[end] - prefix[start - 1];
            }
            if (current > max) {
                max = current;
            }

        }
        System.out.print("The maximum subarray sum is " + max);
    }
} */



//---------------maximum sub array sum using kadanes algorithm  O(n)
/* import java.util.*;
class Maximun_subarray{
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        int current=0,max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            current=(arr[i]+current<0)?0:(current+arr[i]);
        
        if(current>max){
            max=current;
        }
    }
    System.out.println("The maximum sum of the sub array is "+max);
    }
} */
