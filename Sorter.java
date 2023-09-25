class Sorter {
    public static void main(String[] args) {
        return;
    }
<<<<<<< HEAD
    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
                    
            // Swap the found minimum element with the first
            // element
=======

    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
>>>>>>> e98c0c5caaf1e1bd9f403ef3ee7af8da0eda1d56
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
