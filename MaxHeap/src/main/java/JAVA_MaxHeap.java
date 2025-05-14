public class JAVA_MaxHeap
{
    private int[] heap;
    private int size;
    private int maxSize;

    // Constructor to initialize an empty heap with given maximum capacity
    public JAVA_MaxHeap(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        heap = new int[this.maxSize + 1];
        heap[0] = Integer.MAX_VALUE; // Set the first element to maximum value as a sentinel
    }

    // Helper methods to get the index of the parent/left child/right child of the current node
    private int parent(int pos) {
        return pos / 2;
    }

    private int leftChild(int pos) {
        return (2 * pos);
    }

    private int rightChild(int pos) {
        return (2 * pos) + 1;
    }

    // Method to check if a node is a leaf node
    private boolean isLeaf(int pos) {
        return pos > (size / 2) && pos <= size;
    }

    // Method to swap two nodes in the heap
    private void swap(int fpos, int spos) {
        int tmp = heap[fpos];
        heap[fpos] = heap[spos];
        heap[spos] = tmp;
    }

    // Method to heapify the node at the given position
    private void maxHeapify(int pos) {
        // If the node is a non-leaf node and less than any of its children
        if (!isLeaf(pos)) {
            if (heap[pos] < heap[leftChild(pos)] || heap[pos] < heap[rightChild(pos)]) {
                // Swap with the left child and heapify the left child
                if (heap[leftChild(pos)] > heap[rightChild(pos)]) {
                    swap(pos, leftChild(pos));
                    maxHeapify(leftChild(pos));
                } else {
                    // Swap with the right child and heapify the right child
                    swap(pos, rightChild(pos));
                    maxHeapify(rightChild(pos));
                }
            }
        }
    }

    // Method to insert a new element into the heap
    public void insert(int element) {
        if (size >= maxSize) {
            System.out.println("Heap is full. Cannot insert more elements.");
            return;
        }
        heap[++size] = element;
        int current = size;

        // Heapify the new node following the max-heap property
        while (heap[current] > heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    // Method to print the elements of the heap
    public void print() {
        for (int i = 1; i <= size / 2; i++) {
            System.out.print("Parent: " + heap[i] + " Left: " + heap[2 * i] + " Right: " + heap[2 * i + 1]);
            System.out.println();
        }
    }

    // Method to remove and return the maximum element from the heap
    public int remove() {
        int popped = heap[1];
        heap[1] = heap[size--];
        maxHeapify(1);
        return popped;
    }

    public static void main(String[] arg) {
        System.out.println("The Max Heap is ");
        JAVA_MaxHeap maxHeap = new JAVA_MaxHeap(15);
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(22);
        maxHeap.insert(9);

        maxHeap.print();
        System.out.println("The Max val is " + maxHeap.remove());
    }
}

