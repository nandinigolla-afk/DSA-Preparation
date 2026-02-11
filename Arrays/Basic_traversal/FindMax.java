public class FindMax{
    public static int find(int []arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={87,3,1,56,333,-1,3};
        System.out.println("Maximum element is "+find(arr));
    }
}