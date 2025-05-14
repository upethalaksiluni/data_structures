public class SinglyLinkedList {
    private DltLinkedList head;

    public void insertAtEnd(int data) {
        DltLinkedList newNode = new DltLinkedList(data);
        if (head == null) {
            head = newNode;
        } else {
            DltLinkedList temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void insertAtFront(int data) {
        DltLinkedList newNode = new DltLinkedList(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtPosition(int data, int position) {
        DltLinkedList newNode = new DltLinkedList(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            DltLinkedList temp = head;
            for (int i = 0; i < position - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp != null) {
                newNode.next = temp.next;
                temp.next = newNode;
            } else {
                System.out.println("Position out of bounds");
            }
        }
    }

    public void deleteAtFront() {
        if (head != null) {
            head = head.next;
        } else {
            System.out.println("List is empty, nothing to delete.");
        }
    }

    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
        } else if (head.next == null) {
            head = null;
        } else {
            DltLinkedList temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
        } else if (position == 0) {
            head = head.next;
        } else {
            DltLinkedList temp = head;
            for (int i = 0; i < position - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp != null && temp.next != null) {
                temp.next = temp.next.next;
            } else {
                System.out.println("Position out of bounds");
            }
        }
    }

    public boolean search(int key) {
        DltLinkedList temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void display() {
        DltLinkedList temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
