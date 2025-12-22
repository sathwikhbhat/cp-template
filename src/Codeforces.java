import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Codeforces {
    static final long MOD = 1_000_000_007;
    static final int MAX = 200_005;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static int[] spf = new int[MAX];

    public static void main(String[] args) throws IOException {
        int t = ni();

        while (t-- > 0)
            solve();

        out.flush();
    }

// ============================ SOLUTION START ============================

    static void solve() throws IOException {

    }

// ============================= SOLUTION END =============================

    static String ns() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());

        return st.nextToken();
    }

    static int ni() throws IOException {
        return Integer.parseInt(ns());
    }

    static long nl() throws IOException {
        return Long.parseLong(ns());
    }

    static double nd() throws IOException {
        return Double.parseDouble(ns());
    }

    static int[] nia(int n) throws IOException {
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = ni();

        return a;
    }

    static long[] nla(int n) throws IOException {
        long[] a = new long[n];

        for (int i = 0; i < n; i++)
            a[i] = nl();

        return a;
    }

    static double[] nda(int n) throws IOException {
        double[] a = new double[n];

        for (int i = 0; i < n; i++)
            a[i] = nd();

        return a;
    }

    static long gcd(long a, long b) {
        if (b == 0)
            return a;

        return gcd(b, a % b);
    }

    static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    static long add(long a, long b) {
        a += b;

        if (a >= MOD)
            a -= MOD;

        return a;
    }

    static long sub(long a, long b) {
        a -= b;

        if (a < 0)
            a += MOD;

        return a;
    }

    static long mul(long a, long b) {
        return (a * b) % MOD;
    }

    static long power(long a, long b) {
        long res = 1;
        long base = a % MOD;

        while (b > 0) {
            if ((b & 1L) == 1L)
                res = (res * base) % MOD;
            base = (base * base) % MOD;
            b >>= 1;
        }

        return res;
    }

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        if (n == 2)
            return true;

        if (n % 2 == 0)
            return false;

        for (int i = 3; i * i <= n; i += 2)
            if ((n % i) == 0)
                return false;

        return true;
    }

    static void sieve() {
        for (int i = 2; i < MAX; i++)
            if (spf[i] == 0)
                for (int j = i; j < MAX; j += i)
                    if (spf[j] == 0)
                        spf[j] = i;
    }

    static void print(Object o) {
        out.print(o);
    }

    static void println(Object o) {
        out.println(o);
    }

    static void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            out.print(a[i]);
            if (i < a.length - 1)
                out.print(" ");
        }
        out.println();
    }

    static void print(long[] a) {
        for (int i = 0; i < a.length; i++) {
            out.print(a[i]);
            if (i < a.length - 1)
                out.print(" ");
        }
        out.println();
    }

    static void print(List<?> a) {
        for (int i = 0; i < a.size(); i++) {
            out.print(a.get(i));
            if (i < a.size() - 1)
                out.print(" ");
        }
        out.println();
    }

    static void print(int[][] a) {
        for (int[] row : a)
            print(row);
    }

    static void yes(Lang lang) {
        if (lang == Lang.EN)
            out.println("YES");
        else
            out.println("DA");
    }

    static void no(Lang lang) {
        if (lang == Lang.EN)
            out.println("NO");
        else
            out.println("NET");
    }

    enum Lang {EN, RU}
}
