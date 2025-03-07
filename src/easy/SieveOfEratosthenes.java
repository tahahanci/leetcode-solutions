package easy;

import java.util.ArrayList;
import java.util.List;

public class SieveOfEratosthenes {

    public List<Integer> getPrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }

    public static void main(String[] args) {
        SieveOfEratosthenes eratosthenes = new SieveOfEratosthenes();
        List<Integer> primes = eratosthenes.getPrimes(25);

        for (int prime : primes) {
            System.out.print(prime + " ");
        }
    }
}
