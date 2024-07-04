//This program uses BigInteger methods for prime numbers in Java

import java.math.BigInteger;
import java.util.Scanner;
public class BigIntegerPrimeNextPrime {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int num = sc.nextInt();
        System.out.println(isPrime(num));
        System.out.println(nextPrime(num));
        sc.close();
    }

    public static boolean isPrime(int num)
    {
        BigInteger a = BigInteger.valueOf(num);
        return a.isProbablePrime(1);
    }

    public static int nextPrime(int num)
    {
        BigInteger b = BigInteger.valueOf(num);
        b = b.nextProbablePrime();
        int a = b.intValue();
        return a;
    }
}