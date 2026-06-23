//-------------------------linear search
/* public class Search {
    public static void main(String[] args) {
        int arr[]={1,2,3,6,10,33,121,13,4,232,5};
        int key=1;
        if(linear_search(arr,key)){
            System.out.println("Found it");
        }
        else{
            System.out.println("Not Found");
        }
    }
    public static boolean linear_search(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key)
            return true;
        }
        return false;
    }
} */

//---------------largest Number in an array
/* class Search{
    public static void main(String[] args) {
        int arr[]={5,23,1,7,22,11,24,17};
        System.out.println("The largest among the array is : "+largest(arr) );
    }
    public static int largest(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
          if(largest<arr[i]){
            largest=arr[i];
           }
        }
        return largest;
    }
} */


//------------------smallest
/* class Search{
    public static void main(String[] args) {
        int arr[]={5,23,1,0,7,22,11,24,17};
        System.out.println("The largest among the array is : "+largest(arr) );
    }
    public static int largest(int arr[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
          if(smallest>arr[i]){
            smallest=arr[i];
           }
        }
        return smallest;
    }
} */


//--------------binary search
/* class Search{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int key=10;
        System.out.println("Found at  "+search(arr,key));
    }
    public static int search(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
} */


//binary search for an array which is unsorted
/* import java.util.*;
class Search{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of elements:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter key element:");
        int key=sc.nextInt();
        int sorted[]=sorted(arr);
        System.out.println("After sorting:");
        for(int i=0;i<n;i++){
            System.out.print(sorted[i]+" ");
        }
        System.out.println("\nFound at index "+search(sorted,key));
    }
    public static int search(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
           int  mid=(start+end)/2;
            if(arr[mid]==key)
            return mid;
            else if(arr[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static int[] sorted(int arr[]){
        // int sorted[]=new int[arr.length];
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        }
        return arr;
    }


} */



//-----------------reversing of an array
/* class Search{
    public static void main(String[] args) {
        int arr[]={3,1,9,2,10,13,5};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int arr[]){
        int first=0,last=arr.length-1;
        while(first<last){
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
    }
} */


//pairs in an array
/* class Search{
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10},tp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+" ) ");
                tp++;
            }
        }
        System.out.println("Total pairs: "+tp);
    }
} */



//-------------sub arrays in an array
/* class Search{
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10},t=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(+arr[k]+" ");
                    
                }
                t++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total no.of sub arrays: "+t);
    }
} */



//--------------------------find sub arrays,and sum of each sub array and find min max from that
/* class Search{
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

