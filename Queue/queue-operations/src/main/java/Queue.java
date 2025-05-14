public class Queue
{
    private int maxSize;    // Size of the queue array
    private int[] queArray; // Array to hold queue elements
    private int front;      // Index of the front item
    private int rear;       // Index of the rear item
    private int nItems;     // Number of items in the queue

    // Constructor
    public Queue(int s) {
        maxSize = s;
        queArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    // Insert element at the rear
    public void insert(int j) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot insert: " + j);
        } else {
            queArray[++rear] = j;
            nItems++;
        }
    }

    // Remove and return the front element
    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot remove.");
            return -99;
        } else {
            int temp = queArray[front++];
            if (front == maxSize) front = 0; // wrap around
            nItems--;
            return temp;
        }
    }

    // Peek at front element
    public int peekFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -99;
        } else {
            return queArray[front];
        }
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return (nItems == 0);
    }

    // Check if queue is full
    public boolean isFull() {
        return (nItems == maxSize);
    }

    // Return number of items in the queue
    public int size() {
        return nItems;
    }

    // Display all elements of the queue
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue elements: ");
        int count = 0;
        int i = front;
        while (count < nItems) {
            System.out.print(queArray[i] + " ");
            i = (i + 1) % maxSize;
            count++;
        }
        System.out.println();
    }

    // Main method for demonstration
    public static void main(String[] args) {
        Queue theQueue = new Queue(10);

        // Insert elements
        theQueue.insert(10);
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);
        theQueue.insert(50);
        theQueue.insert(60);
        theQueue.insert(70);
        theQueue.insert(80);
        theQueue.insert(90);
        theQueue.insert(100);
        theQueue.insert(110); // should show "Queue is full"

        // Display
        theQueue.displayQueue();

        // Remove a few elements
        theQueue.remove();
        theQueue.remove();
        theQueue.displayQueue();

        // Peek front
        int frontElement = theQueue.peekFront();
        System.out.println("Front element is: " + frontElement);

        // Queue size
        System.out.println("Current queue size: " + theQueue.size());

        // Insert again
        theQueue.insert(110);
        theQueue.insert(120); // should show "Queue is full" if already full
        theQueue.displayQueue();
    }
}

