import java.util.ArrayList;
import java.util.Arrays;

public class arrayList
{
    public static void main(String[] args) {
        String[] arr = {"Hello", "World", "Java", "Programming"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Hello", "World", "Java", "Programming"));

        System.out.println(arr[0]); // Accessing the first element of the array
        System.out.println(arrayList.get(0));

        System.out.println(arr.length);
        System.out.println(arrayList.size());

        // Adding an element to the ArrayList
        arrayList.add("New Element");
        System.out.println("After adding an element: " + arrayList);

        // Removing an element from the ArrayList
        arrayList.remove("Java");
        System.out.println("After removing an element: " + arrayList);

        // replace an element
        arr[1] = "New World";
        System.out.println("After replacing an element: " + Arrays.toString(arr));
        arrayList.set(1, "New World");
        System.out.println("After replacing an element: " + arrayList);

    }
}

