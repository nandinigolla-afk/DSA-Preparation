package PreFixSum;

public class Level1 {
    //running sum
    public static int[] runningSum(int[] arr){

        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i]+arr[i-1];
        }
        return arr;
    }

    //range sum query
    public static int sumQuery(int[] arr,int left,int right){
        int sum=0;
        if(left<0 || right>=arr.length)
            return -1;
        for(int i=left;i<=right;i++){
            sum+=arr[i];
        }
        return sum;
    }

    //finding pivot index
    public static int pivot(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(sumQuery(arr,0,i-1)==sumQuery(arr,i+1,arr.length-1)){
                return i;
            }

        }
        return -1;
    }
    //finding pivot index other way
    public static int pivot1(int[] arr){
        int left=0,totalSum=0;
        for(int x:arr)
            totalSum+=x;
        for(int i=0;i<arr.length;i++){
            totalSum-=arr[i];
            if(left==totalSum)
                return i;
            left+=arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
//        int arr[]={1,2,3,4};
//        int result[]=runningSum(arr);
//        for(int x:result){
//            System.out.print(x+" ");
//        }

//        int arr[]={2,4,6,8,10};
//        System.out.println(sumQuery(arr,1,3));
//        System.out.println(sumQuery(arr,0,2));
//        System.out.println(sumQuery(arr,-1,3));
//        System.out.println(sumQuery(arr,0,10));

        int[] arr={1,7,3,6,5,6};
        System.out.println(pivot(arr));
        int[] arr1={1,2,3,4,5,6,1,2,3,4,5};
        System.out.println(pivot(arr1));
    }
}
