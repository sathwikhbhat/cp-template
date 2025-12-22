/*
    VALIDATOR INPUT NOTES

    - Input comes as a continuous stream of tokens
    - Brute output is read first, solution output next
    - The validator does NOT know the number of test cases

    if (sc.hasNext()):
        Use this to safely process all test cases until input ends

    hasNextLong():
        Use before nextLong() to avoid NoSuchElementException
        when input is missing or malformed

    hasNextLine():
        Use only when outputs are line-based, and you want
        to consume the rest of the current line

    Rules:
    - Use exactly one Scanner(System.in)
    - Read brute and solution in the same structure
    - Validate logic, not text
    - Exit immediately on failure
*/

import java.util.*;

public class Validator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            while (sc.hasNext()) {

            }
        } catch (Exception e) {
            System.out.println("WA");
        }
    }
}
