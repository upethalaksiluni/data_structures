public class ArraySort
{
    // Method to perform bubble sort on an array
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            // Last i elements are already sorted
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (array[j] > array[j + 1]) {
                    // Swap elements array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Method to perform insertion sort on an array
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int a = 1; a < n; a++) {
            int key = array[a];
            int ii = a - 1;

            // Move elements of array[0..a-1], that are greater than key,
            // to one position ahead of their current position
            while (ii >= 0 && array[ii] > key) {
                array[ii + 1] = array[ii];
                ii = ii - 1;
            }

            // Place the key after the last element that was greater than it
            array[ii + 1] = key;
        }
    }

    // Method to perform selection sort on an array
    public static void selectionSort(int[] array) {
        int n = array.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[min_idx]) {
                    min_idx = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }

    // Method to print the elements of an array
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.println(i + " ");
        }
        System.out.println();
    }

    // Method to search for a value in the array
    public static int searchArray(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1; // Return -1 if the value is not found
    }

    public static void main(String[] args) {
        int[] array1 = {5, 3, 8, 4, 2};
        int[] array2 = {5, 3, 8, 4, 2};
        int[] array3 = {64, 25, 12, 22, 11};

        System.out.println("Original Array:");
        printArray(array1);
        System.out.println();

        System.out.println("Bubble Sort:");
        bubbleSort(array1);
        printArray(array1);
        System.out.println();

        System.out.println("Insertion Sort:");
        insertionSort(array2);
        printArray(array2);
        System.out.println();

        System.out.println("Selection Sort:");
        selectionSort(array3);
        printArray(array3);
        System.out.println();

        // Searching for a value in the sorted array
        int valueToSearch = 8;
        int index = searchArray(array1, valueToSearch);
        if (index != -1) {
            System.out.println("Value " + valueToSearch + " found at index: " + index);
        } else {
            System.out.println("Value " + valueToSearch + " not found in the array.");
        }
    }
}

