//1.true if there any duplicate or else false
/* public class Arrays_assignment {
    public static void main(String[] args) {
        int arr[]={1,1,1,2,3,2,3,4,2,3,4,4};
        System.out.println(check(arr));
    }
    public static boolean check(int arr[]){
        for(int i=0;i<arr.length;i++){
            int n=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    n=n+1;
                }
            }
            if(n>1)
            return true;
        }
        return false;
    }
} */


//3.buy  or sell stocks
/* import java.util.*;
class Arrays_assignment{
    public static void main(String[] args) {
        int arr[]={7, 6, 4, 3, 1};
        System.out.println(buyorsell(arr));
    }
    public static int buyorsell(int arr[]){
        int buying=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<arr.length;i++){
            if(buying<arr[i]){
                int profit=arr[i]-buying;
                maxprofit=Math.max(maxprofit,profit);
            }
            else
            buying=arr[i];
        }
        return maxprofit;
        }} */


//4. traping rain water with width 1

/* import java.util.*;
class Arrays_assignment{
    public static void main(String[] args) {
        int arr[]={0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(traped_water(arr));
    }
    public static int traped_water(int arr[]){
        int left_boundary[]=new int[arr.length];
        int right_boundary[]=new int[arr.length];
        int traped_water=0;
        int max=Integer.MIN_VALUE;
        int maxx=Integer.MIN_VALUE;
        for(int i=0;i<left_boundary.length;i++){
            max=Math.max(max, arr[i]);
            left_boundary[i]=max;
        }
        for(int j=right_boundary.length-1;j>=0;j--){
            maxx=Math.max(maxx,arr[j]);
            right_boundary[j]=maxx;
        }
        for(int i=0;i<arr.length;i++){
            traped_water+=Math.min(left_boundary[i],right_boundary[i])-arr[i];
        }
        return traped_water;
    }
} */

//-------5
/* class Arrays_assignment{
    public static void main(String[] args) {
        int arr[]={-1, 0, 1, 2, -1, -4};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(i!=j && i!=k && j!=k && arr[i]+arr[j]+arr[k]==0){
                        System.out.println(" [ "+arr[i]+","+arr[j]+","+arr[k]+ " ] ");
                    }
                }
            }
        }
    }
}
 */