public class Main
{
    public static void main(String[] args) {
        CustomLinkedList customList = new CustomLinkedList();
        customList.add(10);
        customList.add(20);
        customList.add(30);
        customList.add(40);

        // customList.add(20); // Uncomment to test duplicate removal

        System.out.println("Linked List:");
        customList.display();
        System.out.println();

        customList.remove(20);
        System.out.println("After removing 20:");
        customList.display();
        System.out.println();

        customList.remove(10);
        System.out.println("After removing 10:");
        customList.display();

        SinglyLinkedList singlyList = new SinglyLinkedList();

        int[] elements = {30, 85, 90, 55, 66, 45};
        for (int element : elements) {
            singlyList.insertAtEnd(element);
        }

        System.out.println("Linked List after inserting elements at the end:");
        singlyList.display();

        singlyList.insertAtFront(10);
        System.out.println("Linked List after inserting 10 at the front:");
        singlyList.display();

        singlyList.insertAtPosition(50, 3);
        System.out.println("Linked List after inserting 50 at position 3:");
        singlyList.display();

        singlyList.deleteAtFront();
        System.out.println("Linked List after deleting the front element:");
        singlyList.display();

        singlyList.deleteAtEnd();
        System.out.println("Linked List after deleting the end element:");
        singlyList.display();

        singlyList.deleteAtPosition(2);
        System.out.println("Linked List after deleting the element at position 2:");
        singlyList.display();

        int key = 100;
        if (singlyList.search(key)) {
            System.out.println("Element " + key + " found in the linked list.");
        } else {
            System.out.println("Element " + key + " not found in the linked list.");
        }
    }
}
