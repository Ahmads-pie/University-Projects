class Sorter {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
    
    void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex])
                    min_idx = j;
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}