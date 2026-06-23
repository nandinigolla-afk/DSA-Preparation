//// Assignment 1: Implement Array Operations
//public class ArrayMaster {
//    // Task 1: Implement linear search
//    public static int linearSearch(int[] arr, int target) {
//        for(int i=0;i<arr.length-1;i++){
//        	if(arr[i]==target){
//        		return i;
//        		break;
//        	}
//        	}
//        	return -1;
//    }
//
//    // Task 2: Find maximum and minimum in array
//    public static int[] findMinMax(int[] arr) {
//        	int max=Integer.MIN_VALUE;
//        	int min=Integer.MAX_VALUE;
//        	for(int i=0;i<arr.length-1;i++){
//        		if(arr[i]>max){
//        			max=arr[i];
//        		}
//        		else if(arr[i]<min){
//        			min=arr[i];
//        		}
//        		}
//        		return {max,min};
//
//    }
//
//    // Task 3: Reverse an array
//    public static void reverseArray(int[] arr) {
//        for(int i=arr.length-1;i>=0;i--){
//        System.out.println(arr[i]+" ");
//    }
//}
//
//
//
////--------------maximum numbers
//public class ArrayMax {
//    public static int findMax(int[] arr) {
//       int max=arr[0];
//       for(int i=0;i<arr.length;i++){
//       	if(arr[i]>max){
//       	max=arr[i];
//	}
//}
//return max;
//    }
//
//    public static void main(String[] args) {
//        int[] numbers = {3, 5, 7, 2, 8, -1, 4, 10, 12};
//        System.out.println("Maximum: " + findMax(numbers));
//    }
//}
//
//




class practice{
	//minimum number
	public static int findMin(int[] arr) {
		if(arr==null){
			throw new IllegalArgumentException("An array cannot be null");
		}
		if(arr.length==0){
			return Integer.MAX_VALUE;
		}

		int min=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		return min;

//		time complexity:O(n);
//		space complexity :O(1)
	}
	//second largest
	public static int secondLarge(int[] arr){
		if(arr==null){
			throw new IllegalArgumentException("An array cannot be null");
		}
		if(arr.length<2){
			return Integer.MIN_VALUE;
		}
		int large=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		for(int i:arr){
			if(i>large){
				second=large;
				large=i;
			}
			else if(i>second && i<large ){
				second=i;
			}
		}
		return (second ==Integer.MIN_VALUE)?Integer.MIN_VALUE:second;
		//time complexity:O(n);
		//space complexity :O(1)
	}

	//maximum product of two numbers
	public static int product(int[] arr) {
		if (arr == null) {
			throw new IllegalArgumentException("An Array should not be null");
		}
		if (arr.length < 2) {
			return 0;
		}
		int max1 = Integer.MIN_VALUE;//large
		int max2 = Integer.MIN_VALUE;//second large
		int min1 = Integer.MAX_VALUE;//min
		int min2 = Integer.MAX_VALUE;//second min
		for(int num:arr){
			if(num>max1){
				max2=max1;
				max1=num;
			}
			else if(max2>num && num<max1){
				max2=num;
			}

			if(num<min1){
				min2=min1;
				min1=num;
			}
			else if(num<min2){
				min2=num;
			}
		}
		return Math.max(max1*max2,min1*min2);


	}

		//time complexity:O(n);
		//space complexity :O(1)

	public static void main(String[] args){
		//second largest
		int arr[]={5,1,3,2};
		System.out.println("Second largest:"+secondLarge(arr));//3
		int arr1[]={5,5,4,3};
		System.out.println("Second largest:"+secondLarge(arr1));//4
		int arr2[]={1,1,1};
		System.out.println("Second largest:"+secondLarge(arr2));//1


		//maximum product
		int arr3[]={2,3,5,7};
		System.out.println("MAximum product of two numbers: "+product(arr3));//35
		int arr4[]={-10, -3, 5, 2};
		System.out.println("MAximum product of two numbers: "+product(arr4));//30
		int arr5[]= {-1, -2, -3, -4};
		System.out.println("MAximum product of two numbers: "+product(arr5));//12
		int arr6[]={2,3,-5,-7};
		System.out.println("Minimum: " + findMin(arr6));//-7

	}
}
