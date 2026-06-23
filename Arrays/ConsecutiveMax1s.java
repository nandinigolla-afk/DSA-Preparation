package BasicArrays;

public class ConsecutiveMax1s {
    public static int consecutive(int[] arr){
        int max=0;
        int count=0;
        if(arr==null){
            throw new IllegalArgumentException("Array is empty");
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                if(count>max)
                    max=count;
            }
            else count=0;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={0,1,1,1,0,2,1,1,1,1,1,2,1,1,1};
        System.out.println(consecutive(arr));
    }
}
