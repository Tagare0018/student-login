public class MergeSort {
    public static void mergeSort(int[] array) {
        if (array.length < 2) {
            return; // Base case: arrays with fewer than 2 elements are already sorted
        }

        int mid = array.length / 2; // Find the midpoint
        int[] left = new int[mid]; // Create left subarray
        int[] right = new int[array.length - mid]; // Create right subarray

        // Fill the left and right subarrays
        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int i = mid; i < array.length; i++) {
            right[i - mid] = array[i];
        }

        // Recursively sort the left and right subarrays
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted subarrays back into the original array
        merge(array, left, right);
    }

    public static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Merge the left and right arrays
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        // Copy any remaining elements from the left array
        while (i < left.length) {
            array[k++] = left[i++];
        }

        // Copy any remaining elements from the right array
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        mergeSort(array);
        System.out.println("Sorted array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
