
public class palindrome {

    // public static boolean isPalindrome(int number)
    // {
    // int palindrome =number;
    // int reverse =0;
    // while(palindrome !=0)
    // {
    // int reminder=palindrome %10;
    // reverse=reverse*10+reminder;
    // palindrome =palindrome/10;
    // }
    // if(number==reverse)
    // {
    // return true;
    // }
    // return false;
    // }

    // public static boolean isPalindrome(int number){
    // int reminder =0;
    // int reverse=0;
    // int x=number;

    // if(number<0){
    // return false;
    // }
    // while(x!=0){
    // reminder=x%10;
    // reverse=reverse*10+reminder;
    // x=x/10;
    // }
    // return number==reverse;
    // }

    // public static boolean isPalindrome(int n)
    // {
    // if(n<0)
    // {
    // return false;
    // }
    // int reverse=0;
    // int reminder =0;
    // int x=n;

    // while(x!=0)
    // {
    // reminder=x%10;
    // reverse=reverse*10+reminder;
    // x=x/10;
    // }
    // return reverse==n;
    // }

    // public static int print(int n)
    // {
    // int count =0;
    // for(int i=1;i<=n;i++)
    // {
    // if(isPalindrome(i))
    // {
    // count ++;
    // System.err.print(" " + i);
    // }
    // }
    // return count;
    // }

    public static boolean isPalindrome(int n) {
        int reverse = 0;
        int reminder = 0;
        int x = n;

        if (n < 0) {
            return false;
        }

        while (x != 0) {
            reminder = x % 10;
            reverse = reverse * 10 + reminder;
            x = x / 10;
        }

        return n == reverse;
    }

    public static int isPalindromeNumber(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (isPalindrome(i)) {
                System.err.print(" " + i);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        // int number =-121;

        // if(isPalindrome(number))
        // {
        // System.err.println("true");
        // }
        // else{
        // System.err.println("false");
        // }

        int number = 90;
        System.out.println(isPalindrome(number));
        // System.err.print(" count "+print(number));
        System.err.println(" Count " + isPalindromeNumber(number));

    }
}
