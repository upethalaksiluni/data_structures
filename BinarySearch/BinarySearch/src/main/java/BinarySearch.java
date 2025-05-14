public class BinarySearch
{
    // Function to sort the array using bubble sort
    public static void bubbleSort(int array[])
    {
        int n = array.length;
        for (int a = 0; a < n-1; a++)
        {
            for (int b = 0; b < n-a-1; b++)
            {
                if (array[b] > array[b+1])
                {
                    // Swap arr[j] and arr[j+1]
                    int temp = array[b];
                    array[b] = array[b+1];
                    array[b+1] = temp;
                }
            }
        }
    }

    // Returns index of x if it is present in arr[].
    public static int binarySearch(int array[], int x)
    {
        int low = 0, high = array.length - 1;
        while (low <= high)
        {
            int mid = low + (high - low) / 2;

            // Check if x is present at mid
            if (array[mid] == x)
                return mid;

            // If x greater, ignore left half
            if (array[mid] < x)
                low = mid + 1;

                // If x is smaller, ignore right half
            else
                high = mid - 1;
        }

        // If we reach here, then the element was not present
        return -1;
    }

    // Function to print the array
    public static void printArray(int array[])
    {
        int n = array.length;
        for (int a = 0; a < n; a++)
        {
            System.out.print(array[a] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        BinarySearch ob = new BinarySearch();
        int array[] = {40, 10, 3, 4, 2 };
        int c = 10;

        // Print the array before sorting
        System.out.println("Array before sorting:");
        ob.printArray(array);

        // Sort the array before searching
        ob.bubbleSort(array);

        // Print the array after sorting
        System.out.println("Array after sorting:");
        ob.printArray(array);

        // Perform binary search
        int result = ob.binarySearch(array, c);
        if (result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index " + result);
    }

}

