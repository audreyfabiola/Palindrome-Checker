import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class PalindromeQueue {
    private static String buildReverse(String inputString) {
        //Create an empty queue
        Queue<Character> charQueue = new LinkedList<>();
        //Loop through each character in the input and add it to the queue
        for (int i = inputString.length() - 1; i >= 0; i--) {
            charQueue.offer(inputString.charAt(i));
        }

        String result = "";
        //Remove each character from the queue and append it to the result string
        while (!charQueue.isEmpty()) {
            result = result+(charQueue.remove());
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