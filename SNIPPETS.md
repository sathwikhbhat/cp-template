# Main.java Helper Methods

This is your main template with built-in utilities for competitive programming. Add your solution logic inside the solve() method.

## Input Methods

Read input efficiently using these methods:

ns(): Returns next token as String
ni(): Returns next token as int
nl(): Returns next token as long
nd(): Returns next token as double

nia(n): Returns array of n integers
nla(n): Returns array of n longs
nda(n): Returns array of n doubles
nca(): Returns next input line as char array

Example:
```java
int n = ni();
int[] arr = nia(n);
long x = nl();
```

## Math Utilities

gcd(a, b): Greatest common divisor
lcm(a, b): Least common multiple
isPow2(x): Check if x is a power of 2
ceilPow2(x): Smallest power of 2 >= x
floorPow2(x): Largest power of 2 <= x

```java
long g = gcd(12, 18);  // 6
if (isPow2(16)) { }    // true
```

## Modular Arithmetic

MOD is set to 1,000,000,007 by default.

modAdd(a, b): (a + b) mod MOD
modSub(a, b): (a - b) mod MOD
modProd(a, b): (a * b) mod MOD
power(a, b): a^b mod MOD
modInverse(a): Modular inverse of a using Fermat's little theorem

```java
long ans = modAdd(x, y);
long prod = modProd(a, b);
long inv = modInverse(7);
long result = power(2, 100);
```

## Number Theory

isPrime(n): Check if n is prime
sieve(): Precompute smallest prime factors for numbers up to SIEVE_LIMIT (200,005)

After calling sieve(), use spf[] array for fast factorization.

```java
sieve();
if (isPrime(17)) { }
int factor = spf[100];
```

## Array Operations

reverse(arr, l, r): Reverse elements from index l to r
swap(arr, i, j): Swap elements at indices i and j

Works with int[], long[], char[] arrays.

```java
reverse(arr, 0, n - 1);
swap(arr, i, j);
```

## Min/Max

min(vals...): Returns minimum of given values
max(vals...): Returns maximum of given values

Overloaded for int and long.

```java
int smallest = min(5, 3, 8);
long largest = max(100L, 200L, 50L);
```

## Binary Search

lowerBound(arr, x): Index of first element >= x
upperBound(arr, x): Index of first element > x

Array must be sorted.

```java
int[] a = {1, 2, 2, 3, 4};
int idx1 = lowerBound(a, 2);  // 1
int idx2 = upperBound(a, 2);  // 3
```

## Output Methods

print(obj): Print without newline
println(obj): Print with newline
print(int[] a): Print array with spaces
print(long[] a): Print array with spaces
print(Collection c): Print collection with spaces
print(int[][] a): Print 2D array row by row
flush(): Flush output

```java
println("Answer: " + ans);
print(result);
flush();
```

## Template Structure

The solve() method is called for each test case. Put your solution logic there:

```java
static void solve() throws IOException {
    int n = ni();
    int[] arr = nia(n);
    // Your solution here
    println(answer);
}
```

Constants available:
- MOD = 1,000,000,007
- SIEVE_LIMIT = 200,005
