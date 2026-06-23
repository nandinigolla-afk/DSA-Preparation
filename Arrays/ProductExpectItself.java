package BasicArrays;

public class ProductExpectItself {
    public static int[] product(int[] arr){
        int product=1;
        for(int i=0;i<arr.length;i++){
            product=product*arr[i];
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=product/arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] result=product(arr);
        for(int x:result)
            System.out.print(x+" ");
    }
}
