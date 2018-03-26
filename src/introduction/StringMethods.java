package introduction;

public class StringMethods {
    public static void main(String[] args) {
        String str = "This is a test string";
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "Welcome";
        String str4 = "";
        String str5 = "      Spaces all around     ";
        String str6 = "Hello";


        System.out.println("String length: " + str.length());
        System.out.println("Char value at the given index: " + str.charAt(3));
        System.out.println("Concat example: " + str.concat(" This is appended test string"));
        System.out.println("Contains example 1: " + str.contains("is"));
        System.out.println("Contains example 2: " + str.contains("si"));
        System.out.println("Starts with Example 1: " + str.startsWith("This"));
        System.out.println("Starts with Example 2: " + str.startsWith("this"));
        System.out.println("Ends with Example 1: " + str.endsWith("string"));
        System.out.println("Ends with Example 2: " + str.endsWith("welcome"));
        System.out.println("Equals Example 1: " + str1.equals(str2));
        System.out.println("Equals Example 2: " + str1.equals(str3));
        System.out.println("Index Example: " + str.indexOf("a"));
        System.out.println("Empty Example 1: " + str4.isEmpty());
        System.out.println("Empty Example 2: " + str5.isEmpty());
        System.out.println("Replace Example 1: " + str6.replace("e", "a"));
        System.out.println("Replace Example 1: " + str6.replace("l", "1"));
        System.out.println("Substring Example 1: " + str.substring(5));
        System.out.println("Substring Example 2: " + str.substring(5, 10));
        System.out.println("Trim Example: " + str5.trim());

        char[] charArray = str.toCharArray();
        for (int i = 0; i<charArray.length; i++){
            System.out.println("Index " + i + " is: " + charArray[i]);
        }

        System.out.println("Lowercase Example: " + str.toLowerCase());
        System.out.println("Uppercase Example: " + str.toUpperCase());
    }
}
