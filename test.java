public class test {
        public static boolean isprime(int nums)
    {
        boolean isprime=true;
        
        for(int i=2;i<=nums-1;i++)
        {
            if(nums%i==0)
            {
                isprime=false;
            }
        }
        return isprime;
    }

    public static int Twonums(int nums[][])
    {
        int sum=0;
        int max =Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++)
        {
           for(int j=0;j<nums[i].length;j++)
           {
                if(i==j)
                {
                    sum= nums[i][j];
                    if(isprime(sum))
                    {
                        max=Math.max(max, sum);
                    }
                }
           }
        }
        return max;
    }


    public static void main(String[] args) {
        int nums[][] = {{1,2,3},{4,5,6},{7,8,9}};
        // System.err.println(isprime(nums));
        int num=Twonums(nums);
        System.err.println(num);

        // System.err.println(isprime(num));
    }
}
