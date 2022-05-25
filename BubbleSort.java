
public class BubbleSort {
	public static void main(String[] args) {
		//Example 1
		int N= 5;
		int arr[] = {4, 1, 3, 9, 7};
		bubbleSort(arr, N);
		for (int i=0; i<arr.length; i++) {
			  System.out.print(arr[i]  + " ");
		}
		 System.out.println();
		//Example 2
			int M = 10;
			int arr1[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
			bubbleSort(arr1, M);
			for (int i=0; i<arr1.length; i++) {
				  System.out.print(arr1[i] + " ");
			}
	}
	
	//method tp perform bubble sort
	 static int[] bubbleSort(int arr[], int N) {
	        int len = arr.length, tmp;
	        boolean flag;
	        for (int i = 0; i < N-1; i++) {
	            flag = false;
	            for (int j = 0; j < N - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    tmp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = tmp;
	                    flag = true;
	                }
	            }
	            if (!flag)
	                break;
	        }
	        return arr;
	    }
}
