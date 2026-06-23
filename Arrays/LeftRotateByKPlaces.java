package BasicArrays;

public class LeftRotateByKPlaces {
    //O(n*k)
//    public static void rotateByK(int[] arr,int k){
//        int d=0;
//        while(d<k){
//            int i=0;
//            for(int j=1;j<arr.length;j++){
//                int temp=arr[i];
//                arr[i]=arr[j];
//                arr[j]=temp;
//                i++;
//
//            }
//            d++;
//        }
//
//    }

    //O(n)
    public static void rotateByK(int[] arr,int k){
        int n=arr.length;
        if(n==0) return;
        //k=k%n;
        //better
        k=((k%n)+n)%n;
        reverse(arr,0,k-1);// first reverse k-1 elements
        reverse(arr,k,n-1);//second reverse remaining elements
        reverse(arr,0,n-1);//reverse entire array
    }
    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};

        rotateByK(arr,7);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
