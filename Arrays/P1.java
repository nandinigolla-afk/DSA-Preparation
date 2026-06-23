//import java.util.Scanner;
//
//public class P1 {
//    public static int sum(int[] arr,int n){
//       if(n<=0){
//           return 0;
//       }
//       return arr[n-1]+sum(arr,n-1);
//    }
//
//    public static int max(int[] arr,int n){
////        int max=arr[0];
////        for(int i=0;i<arr.length;i++){
////            if(arr[i]>max){
////                max=arr[i];
////            }
////        }
////        return max;
//        if(n==1){
//            return arr[0];
//        }
//        int maxRest=max(arr,n-1);
//        if(arr[n-1]>maxRest){
//            return arr[n-1];
//        }
//        return maxRest;
//    }
//    //reversing array in place
//    public static void reverse(int[] arr){
//        int left=0;
//        int right=arr.length-1;
//        while(left<right){
//            int temp=arr[left];
//            arr[left]=arr[right];
//            arr[right]=temp;
//            left++;
//            right--;
//        }
//
//
//        for(int i:arr) {
//            System.out.print(i + " ");
//        }
//    }
//
//    //count even and odd
//    public static  int[] count(int[] arr,int index){
//        if(index==arr.length){
//            return new int[]{0,0};
//        }
////        int[] result=count(arr,index+1);
////        if(arr[index]%2==0){
////            result[0]++;
////        }
////        else {
////            result[1]++;
////        }
////        return result;
//
//        int even=0,odd=0;
//        for(int i:arr){
//            if(i%2==0)
//                even++;
//            else odd++;
//        }
//        return new int[] {even,odd};
//
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter no.of elements:");
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        System.out.println("Enter array elements:");
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        System.out.println("Sum of elements:"+sum(arr,arr.length));
//        System.out.println("Maximum element:"+max(arr,arr.length));
//        reverse(arr);
//        int result[]=count(arr,0);
//        System.out.println("Even : "+result[0]+" Odd: "+result[1]);
//
//    }
//}
//
//
//
//

//class P1{
//    public static int[] duplicates(int[] arr){
//        int left=0;
//        int right=arr.length-1;
//        while(left<right){
//            if(arr[left]==arr[right]){
//
//            }
//        }
//    }
//    public static void main(String[] args) {
//        int[] arr={1,2,3,2,4,5,2};
//        int[] result=duplicates(arr);
//    }
//}