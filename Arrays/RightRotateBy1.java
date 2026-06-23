package BasicArrays;

public class RightRotateBy1 {
    public static void rightrotate(int[] arr){
        int i=arr.length-1;
        for(int j=i-1;j>=0;j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i--;
        }

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        rightrotate(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
