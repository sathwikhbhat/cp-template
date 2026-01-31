import java.io.*;
import java.util.*;

public class Codeforces {
    static final long MOD = 1_000_000_007;
    static final int SIEVE_LIMIT = 200_005;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static int[] spf = new int[SIEVE_LIMIT];

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

        for (int i = 3; (long) i * i <= n; i += 2)
            if ((n % i) == 0)
                return false;

        return true;
    }

    static void sieve() {
        for (int i = 2; i < SIEVE_LIMIT; i++)
            if (spf[i] == 0)
                for (int j = i; j < SIEVE_LIMIT; j += i)
                    if (spf[j] == 0)
                        spf[j] = i;
    }

    static void reverse(int[] arr, int l, int r) {
        while (l < r)
            swap(arr, l++, r--);
    }

    static void reverse(long[] arr, int l, int r) {
        while (l < r)
            swap(arr, l++, r--);
    }

    static void reverse(char[] arr, int l, int r) {
        while (l < r)
            swap(arr, l++, r--);
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void swap(long[] arr, int i, int j) {
        long temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int min(int... vals) {
        int res = vals[0];

        for (int v : vals)
            res = Math.min(res, v);

        return res;
    }

    static int max(int... vals) {
        int res = vals[0];

        for (int v : vals)
            res = Math.max(res, v);

        return res;
    }

    static long min(long... vals) {
        long res = vals[0];

        for (long v : vals)
            res = Math.min(res, v);

        return res;
    }

    static long max(long... vals) {
        long res = vals[0];

        for (long v : vals)
            res = Math.max(res, v);

        return res;
    }

    static void print(Object o) {
        out.print(o);
    }

    static void println(Object o) {
        out.println(o);
    }

    static void print(int[] a) {
        for (int x : a)
            out.print(x + " ");

        out.println();
    }

    static void print(long[] a) {
        for (long x : a)
            out.print(x + " ");

        out.println();
    }

    static void print(Collection<?> c) {
        for (Object x : c)
            out.print(x + " ");

        out.println();
    }

    static void print(PriorityQueue<?> pq) {
        PriorityQueue<?> copy = new PriorityQueue<>(pq);

        while (!copy.isEmpty())
            out.print(copy.poll() + " ");

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
