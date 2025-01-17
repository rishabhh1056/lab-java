/*Write a Java program to get the contents of a given string as a character array.

Sample Output:

The char array equals "[C@2a139a55" */
package String;

public class Exercise14 {
    public static void main(String[] args)
    {
        String str = "This is a sample string.";

        // Copy the contents of the String to a byte array.
        // Only copy characters 4 through 10 from str.
        // Fill the source array starting at position 2.
        char[] arr = new char[] { ' ', ' ', ' ', ' ',
                                  ' ', ' ', ' ', ' ' };
        str.getChars(4, 10, arr, 2);

        // Display the contents of the byte array.
        System.out.println("The char array equals \"" +  arr + "\"");
    }
}
