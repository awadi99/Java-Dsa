public class kadanes_algorithm {

    // for positive number
    // public static void isKadanes(int number[])
    // {
    //     int current_sum=0;
    //     int max=Integer.MIN_VALUE;
    //     for(int i=0;i<number.length;i++)
    //     {
    //         current_sum +=number[i];
    //         if(current_sum<0)
    //         {
    //             current_sum=0;
    //         }
    //         max=Math.max(current_sum,max);
    //     }
    //     System.err.println(max);
    // }

    // for positive 
    public static int isKadanes(int number[]){

        int current =0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++)
        {
            current +=number[i];
            if(current<0)
            {
                current=0;
            }
            max=Math.max(current,max);
        }
        return max;
    }


    public static void isKadanes_negative(int arr1[])
    {
        int cs=0;
        int max=Integer.MAX_VALUE;
        for(int i=0;i<arr1.length;i++)
        {
            cs+=arr1[i];
        }
        max=Math.min(cs,max);
        System.err.println(max);
    }
    public static void main(String[] args) {
        int number[]={-2,-3,4,-1,-2,1,5,-3};
        System.err.println(isKadanes(number));

        int arr1[]={-2,-3,-4,-1,-2,-1,-5,-3};
        isKadanes_negative(arr1);
    }
}
