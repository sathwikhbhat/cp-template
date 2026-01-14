/*
    RANDOM TEST GENERATOR TEMPLATE

    Purpose:
    - Generate random test cases for stress testing
    - Output must EXACTLY match the problem input format

    Guidelines:
    - Generate small values only (so the brute can handle it)
    - Cover edge cases (0, 1, min, max where possible)
    - Keep randomness simple and controlled

    Rules:
    - Do NOT read input
    - Print valid input only
    - Every generated test must be legal
*/

import java.util.Random;

public class Generator {
    static Random rand = new Random();

    public static void main(String[] args) {

        int t = generate(1, 10);
        System.out.println(t);

        while (t-- > 0) {

        }
    }

    public static int generate(int start, int end) {
        return rand.nextInt(end - start + 1) + start;
    }

}
