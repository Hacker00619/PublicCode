import java.util.Scanner;

public class SumOfHalfPrime {

    public static void isSecure(int n) {

        int low = 1, high = n - 1;
        boolean flag = false;

        while (low < high) {
            if (low + high == n && isHalfPrime(low) && isHalfPrime(high)) {
                flag = true;
            }
            low++;
            high--;
        }
        if (flag) {
            System.out.println("Secure");
        } else {
            System.out.println("Not Secure");
        }

    }

    public static boolean isHalfPrime(int n) {
        int low = 2, high = n;

        for (low = 2; low <= n / 2; low++) {
            if (isPrime(low)) {
                for (high = n / 2; high >= 0; high--) {
                    if (isPrime(high)) {
                        if (low * high == n) {
                            return true;
                        }
                    }
                }
            }
        }

        return false;

    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0 && i != n) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        isSecure(n);

    }
}
