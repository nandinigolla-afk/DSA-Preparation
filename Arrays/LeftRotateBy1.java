package BasicArrays;

public class LeftRotateBy1 {
    //O(n*k)
    public static void leftrotate(int[] arr){
        int n=arr.length;
        int i=0;
        for(int j=1;j<n;j++){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
        }

    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        leftrotate(arr);
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
