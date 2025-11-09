public class factorial {
    
    public static int factorial(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        else{
        return n*factorial(n-1);
        }
    }
    public static int fact(int n)
    {   int f=1;
        for(int i=1;i<=n;i++)
        {
              f=f*i;
        }
        return f;

    }
    
    
    public static void main(String[] args) {
        int ans = factorial(5);
        System.err.println(ans);
        System.err.println(fact(5));
    }
}
