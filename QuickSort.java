
public class QuickSort {

	public static void main(String[] args) {
		//Example1
		int N = 5;
		int arr[] = { 4, 1, 3, 9, 7};
		quickSort(arr,0, N-1);
        System.out.println("\nThe sorted array : "+" ");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        //Example2
        int M = 9;
       	int arr1[] = { 2, 1, 6, 10, 4, 1, 3, 9, 7};
       	quickSort(arr1,0, M-1);
        System.out.println("\nThe sorted array : " +" ");
        for (int i = 0; i < M; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
	}
	
	 /**
     * @param arr   The array/sub-array to be sorted
     * @param lower lower index
     * @param upper upper index
     */
    static void quickSort(int arr[], int lower, int upper) {
        if (lower >= upper)
            return;
        int p = partition(arr, lower, upper);
        quickSort(arr, lower, p - 1);
        quickSort(arr, p + 1, upper);
        
    }

    /**
     * @param arr   The array of elements
     * @param lower The lower index of the elements
     * @param upper The upper index of the elements
     * @return The index of the pivot element
     */
    private static int partition(int arr[], int lower, int upper) {
        int pivot = arr[upper];
        int j = lower;
        int tmp;
        for (int i = lower; i <= upper; i++) {
            if (arr[i] < pivot) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                j++;
            }
        }
        tmp = arr[upper];
        arr[upper] = arr[j];
        arr[j] = tmp;

        return j;
    }
}
