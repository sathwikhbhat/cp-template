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

import java.util.*;

public class Generator {
    static Random rand = new Random();

    public static void main(String[] args) {

        int t = rand.nextInt(5) + 1;
        System.out.println(t);

        while (t-- > 0) {

        }
    }
}
