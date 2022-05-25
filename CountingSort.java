
public class CountingSort {
	 char[] countSort(char arr[], int len) 
    { 
        int n = len; 
  
        // The output character array that will have sorted arr 
        char output[] = new char[n]; 
  
        // Create a count array to store count of inidividual 
        // characters and initialize count array as 0 
        int count[] = new int[256]; 
        for (int i=0; i<256; ++i) 
            count[i] = 0; 
  
        // store count of each character 
        for (int i=0; i<n; ++i) 
            ++count[arr[i]]; 
  
        // Change count[i] so that count[i] now contains actual 
        // position of this character in output array 
        for (int i=1; i<=255; ++i) 
            count[i] += count[i-1]; 
  
        // Build the output character array 
        // To make it stable we are operating in reverse order. 
        for (int i = n-1; i>=0; i--) 
        { 
            output[count[arr[i]]-1] = arr[i]; 
            --count[arr[i]]; 
        } 
  
        // Copy the output array to arr, so that arr now 
        // contains sorted characters 
        for (int i = 0; i<n; ++i) 
            arr[i] = output[i]; 
        
        return arr;
    } 
  
    // Driver method 
    public static void main(String args[]) 
    { 
        //Example1
    	CountingSort ob = new CountingSort(); 
        int N = 5;
        String S = "edsab";
        char arr[] = S.toCharArray();
        char[] ch = ob.countSort(arr, N); 
  
        System.out.print("Sorted character array is "); 
        for (int i=0; i<ch.length; ++i) 
            System.out.print(ch[i]); 
        
        //Example2
    	CountingSort ob1 = new CountingSort(); 
        int M = 13;
        String str = "geeksforgeeks";
        char arr1[] = str.toCharArray();
        char[] ch1 = ob.countSort(arr1, M); 
  
        System.out.print("\n Sorted character array is "); 
        for (int i=0; i<ch1.length; ++i) 
            System.out.print(ch1[i]); 
    } 
}
