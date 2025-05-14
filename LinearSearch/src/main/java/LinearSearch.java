public class LinearSearch
{
    public static void main(String[] args) {
        int[] array = {13, 27, 12, 19, 15, 13, 27};
        int targetValue = 13;

        // Basic linear search
        int index = linearSearch(array, targetValue);
        if (index != -1) {
            System.out.println("Value " + targetValue + " found at index: " + index);
        } else {
            System.out.println("Value " + targetValue + " not found");
        }

        // First occurrence
        int firstIndex = findFirstOccurrence(array, targetValue);
        System.out.println("First occurrence of " + targetValue + ": " + firstIndex);

        // Last occurrence
        int lastIndex = findLastOccurrence(array, targetValue);
        System.out.println("Last occurrence of " + targetValue + ": " + lastIndex);

        // All indices
        int[] allIndices = findAllOccurrences(array, targetValue);
        System.out.print("All occurrences of " + targetValue + ": ");
        if (allIndices.length > 0) {
            for (int idx : allIndices) {
                System.out.print(idx + " ");
            }
            System.out.println();
        } else {
            System.out.println("None found.");
        }

        // Test empty array
        int[] emptyArray = {};
        int result = linearSearch(emptyArray, 5);
        System.out.println("Search in empty array returned: " + result);
    }

    // Basic linear search: returns the index of the first match
    public static int linearSearch(int[] array, int targetValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == targetValue) {
                return i;
            }
        }
        return -1;
    }

    // Find the first occurrence of the target value
    public static int findFirstOccurrence(int[] array, int targetValue) {
        return linearSearch(array, targetValue);
    }

    // Find the last occurrence of the target value
    public static int findLastOccurrence(int[] array, int targetValue) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == targetValue) {
                return i;
            }
        }
        return -1;
    }

    // Return all indices where the target value occurs
    public static int[] findAllOccurrences(int[] array, int targetValue) {
        int count = 0;
        for (int value : array) {
            if (value == targetValue) {
                count++;
            }
        }

        if (count == 0) {
            return new int[0];
        }

        int[] indices = new int[count];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == targetValue) {
                indices[j++] = i;
            }
        }
        return indices;
    }
}

