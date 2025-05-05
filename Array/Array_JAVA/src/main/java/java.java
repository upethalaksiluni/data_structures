public class java
{
    public static void main(String[] args) {
        String var1 = "Hello World";

        // substring
        System.out.println(var1.substring(2, 4)); // "ll"
        System.out.println(var1.substring(1));    // "ello World"

        // toUpperCase
        System.out.println(var1.toUpperCase());   // "HELLO WORLD"

        // replace
        System.out.println(var1.replace("l", "a")); // "Heaao Worad"

        // split
        String str = "Hello, hi";
        String[] splitArray = str.split(",");
        for (String s : splitArray) {
            System.out.println(s);  // Since no comma, prints "Hello"
        }

        // toLowerCase
        System.out.println(var1.toLowerCase());   // "hello world"

        // Reverse the string
        String reversed = new StringBuilder(var1).reverse().toString();
        System.out.println("Reverseds: " + reversed); // "dlroW olleH"

        String reversedvar = "";

        for (int i = var1.length() - 1; i >= 0; i--) {
            reversedvar += var1.charAt(i);
        }

        System.out.println("Reversedss: " + reversedvar); // "dlroW olleH"

        StringBuffer sb = new StringBuffer(var1);
        sb.reverse();

        System.out.println("Reversed: " + sb); // "dlroW olleH"
    }
}

