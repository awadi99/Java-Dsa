public class prime_number {

    // public static boolean isPrime(int n)
    // {
    // boolean isPrime =true;
    // for(int i =2;i<=n-1;i++)
    // {
    // if(n%i==0)
    // {
    // isPrime=false;
    // }
    // }
    // return isPrime;
    // }

    // public static void print(int n){

    // for(int i =2;i<=n;i++)
    // {
    // if(isPrime(i)){
    // System.err.print(" "+ i);
    // }
    // }
    // }

    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
    // public static void print(int n)
    // {
    // for(int i=2;i<=n;i++)
    // {
    // if(isPrime(i))
    // {
    // System.err.print(" "+i);
    // }
    // }
    // }

    public static int print(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                count++;
                System.err.print(" " + i);
            }
        }
        return count;
    }

    // public static boolean isPrime(int n)
    // {
    // boolean isPrime =true;
    // for(int i=2;i<=n-1;i++)
    // {
    // if(n%i==0)
    // {
    // isPrime=false;
    // }
    // }
    // return isPrime;
    // }

    public static void main(String[] args) {

        // System.err.println(isPrime(3));

        System.err.println(isPrime(157));

        System.err.print(" count " + print(158));

    }
}
