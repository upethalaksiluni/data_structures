public class ArrayOperations
{
    private int[] arr;
    private int size;        // Current number of elements
    private int capacity;    // Maximum capacity of the array

    public ArrayOperations(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        size = 0;
        System.out.println("INITIALIZATION: Created new array with capacity " + capacity);
    }

    /**
     * 1. TRAVERSAL OPERATION
     * Print all elements in the array
     */
    public void traverse() {
        System.out.println("\n-----TRAVERSAL OPERATION-----");
        if (size == 0) {
            System.out.println("Array is empty. Nothing to traverse.");
            return;
        }

        System.out.print("Array Elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nArray Size: " + size + " / " + capacity);
    }

    /**
     * 2. INSERTION OPERATION
     * Add element at the end of the array
     * @param value The value to insert
     * @return true if insertion successful, false otherwise
     */
    public boolean insert(int value) {
        System.out.println("\n-----INSERTION OPERATION-----");
        if (size < capacity) {
            arr[size] = value;
            size++;
            System.out.println("Inserted value " + value + " at index " + (size - 1));
            return true;
        } else {
            System.out.println("Insertion Failed: Array is full (capacity: " + capacity + ")");
            return false;
        }
    }

    /**
     * 3. UPDATE OPERATION
     * Update element at a specific index
     * @param index The position to update
     * @param newValue The new value to set
     * @return true if update successful, false otherwise
     */
    public boolean update(int index, int newValue) {
        System.out.println("\n-----UPDATE OPERATION-----");
        if (index >= 0 && index < size) {
            int oldValue = arr[index];
            arr[index] = newValue;
            System.out.println("Updated index " + index + " from " + oldValue + " to " + newValue);
            return true;
        } else {
            System.out.println("Update Failed: Invalid index " + index + " (valid range: 0 to " + (size - 1) + ")");
            return false;
        }
    }

    /**
     * 4. DELETION OPERATION
     * Delete element at a specific index
     * @param index The position to delete
     * @return true if deletion successful, false otherwise
     */
    public boolean delete(int index) {
        System.out.println("\n-----DELETION OPERATION-----");
        if (index >= 0 && index < size) {
            int deletedValue = arr[index];
            for (int i = index; i < size - 1; i++) {
                arr[i] = arr[i + 1]; // Shift elements to the left
            }
            size--;
            System.out.println("Deleted element " + deletedValue + " from index " + index);
            System.out.println("Shifted all elements to fill the gap");
            return true;
        } else {
            System.out.println("Deletion Failed: Invalid index " + index + " (valid range: 0 to " + (size - 1) + ")");
            return false;
        }
    }

    /**
     * 5. SEARCH OPERATION
     * Find the index of a specific value in the array
     * @param value The value to search for
     * @return the index if found, -1 otherwise
     */
    public int search(int value) {
        System.out.println("\n-----SEARCH OPERATION-----");
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                System.out.println("Found value " + value + " at index " + i);
                return i;
            }
        }
        System.out.println("Value " + value + " not found in the array");
        return -1;
    }

    // Getter for array size (number of elements)
    public int getSize() {
        return size;
    }

    // Getter for array capacity
    public int getCapacity() {
        return capacity;
    }

    // Getter for specific element
    public int getElement(int index) {
        if (index >= 0 && index < size) {
            return arr[index];
        } else {
            System.out.println("Invalid index " + index);
            return -1; // Indicate error with -1
        }
    }

    // Setter for array capacity (creates new array)
    public void setCapacity(int newCapacity) {
        System.out.println("\n-----RESIZE OPERATION-----");
        if (newCapacity <= 0) {
            System.out.println("Invalid capacity: " + newCapacity);
            return;
        }

        if (newCapacity < size) {
            System.out.println("Warning: New capacity is less than current size. Some elements will be lost.");
        }

        int[] newArr = new int[newCapacity];
        // Copy elements to new array
        for (int i = 0; i < Math.min(size, newCapacity); i++) {
            newArr[i] = arr[i];
        }

        int oldCapacity = capacity;
        arr = newArr;
        capacity = newCapacity;
        if (size > capacity) {
            size = capacity; // Adjust size if new capacity is smaller
        }

        System.out.println("Array resized from capacity " + oldCapacity + " to " + newCapacity);
    }

    /**
     * Main method for testing all operations
     */
    public static void main(String[] args) {
        System.out.println("===== ARRAY OPERATIONS DEMONSTRATION =====");

        // Create array with capacity 5
        ArrayOperations ao = new ArrayOperations(5);

        // Test insertion
        ao.insert(10);
        ao.insert(20);
        ao.insert(30);

        // Test traversal
        ao.traverse();

        // Test update
        ao.update(1, 25);
        ao.traverse();

        // Test deletion
        ao.delete(0);
        ao.traverse();

        // Test search
        ao.search(25);
        ao.search(10);

        // Test getter methods
        System.out.println("\n-----USING GETTERS-----");
        System.out.println("Current size: " + ao.getSize());
        System.out.println("Array capacity: " + ao.getCapacity());
        System.out.println("Element at index 0: " + ao.getElement(0));

        // Test capacity change
        ao.setCapacity(10);
        ao.insert(40);
        ao.insert(50);
        ao.insert(60);
        ao.traverse();
    }
}

