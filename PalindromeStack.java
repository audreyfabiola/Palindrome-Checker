import java.util.Stack;
import java.util.Scanner;

public class PalindromeStack {
    private static String buildReverse(String inputString) {
        //Create an empty stack
        Stack<Character> charStack = new Stack<>();
        //Loop through each character in the input and push it onto the stack
        for (int i = 0; i < inputString.length(); i++) {
            charStack.push(inputString.charAt(i));
        }

        String result = "";
        //Pop each character off the stack and append it to the result string
        while (!charStack.isEmpty()) {
            result = result+(charStack.pop());
        }
        return result.toString();
    }

    //Checks whether the input is a palindrome or not
    public static boolean isPalindrome(String inputString) {
        return inputString.equalsIgnoreCase(buildReverse(inputString));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string: ");
        String inputString = input.nextLine();
        System.out.println("Palindrome: " + isPalindrome(inputString));
    }
}
