public class MinHeap
{
    private int[] heap;
    private int size;
    private int maxSize;

    // Constructor to initialize an empty heap with given maximum capacity
    public MinHeap(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        heap = new int[this.maxSize + 1];
        heap[0] = Integer.MIN_VALUE; // Set the first element to minimum value as a sentinel
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
    private void minHeapify(int pos) {
        // If the node is a non-leaf node and greater than any of its children
        if (!isLeaf(pos)) {
            if (heap[pos] > heap[leftChild(pos)] || heap[pos] > heap[rightChild(pos)]) {
                // Swap with the left child and heapify the left child
                if (heap[leftChild(pos)] < heap[rightChild(pos)]) {
                    swap(pos, leftChild(pos));
                    minHeapify(leftChild(pos));
                } else {
                    // Swap with the right child and heapify the right child
                    swap(pos, rightChild(pos));
                    minHeapify(rightChild(pos));
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

        // Heapify the new node following the min-heap property
        while (heap[current] < heap[parent(current)]) {
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

    // Method to remove and return the minimum element from the heap
    public int remove() {
        int popped = heap[1];
        heap[1] = heap[size--];
        minHeapify(1);
        return popped;
    }

    public static void main(String[] arg) {
        System.out.println("The Min Heap is ");
        MinHeap minHeap = new MinHeap(15);
        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(17);
        minHeap.insert(10);
        minHeap.insert(84);
        minHeap.insert(19);
        minHeap.insert(6);
        minHeap.insert(22);
        minHeap.insert(9);

        minHeap.print();
        System.out.println("The Min val is " + minHeap.remove());
    }
}

