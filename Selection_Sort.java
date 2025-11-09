public class Selection_Sort {
    // public static void isSelection_Sort(int number[])
    // {
    //     for(int i =0;i<number.length;i++)
    //     {       int min =i;
    //         for(int j =i+1;j<number.length;j++)
    //         {
    //             if(number[min]>number[j])
    //             {
    //                 min=j;
    //             }
    //         }
    //         int temp =number[i];
    //         number[i]=number[min];
    //         number[min]=temp;
    //     }
    //     for(int ele : number)
    //     {
    //         System.err.print(" "+ele);
    //     }
    // }

    // public static void isSelection_Sort(int number[])
    // {
    //     int temp=0;
    //     int min =0;

    //     for(int i=0;i<number.length;i++)
    //     {
    //             min =i;
    //         for(int j=i+1;j<number.length;j++)
    //         {
    //             if(number[min]>number[j])
    //             {
    //                 min =j;
    //             }
    //         }
    //         temp=number[i];
    //         number[i]=number[min];
    //         number[min]=temp;
    //     }

    //     for(int ele : number)
    //     {
    //         System.err.print(" "+ele);
    //     }
    // }

    public static void isSelection_Sort(int nums[])
    {
        int temp=0;
        int min =0;
        for(int i =0;i<nums.length;i++)
        {
            min=i;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[min]>nums[j])
                {
                    min=j;
                }
            }
            temp = nums[i];
            nums[i]=nums[min];
            nums[min]=temp;
        }
        for(int ele : nums)
        {
            System.err.print(" "+ele);
        }
    }
    public static void main(String[] args) {
        int number[]={4,1,5,6,3,7};
        isSelection_Sort(number);
    
    }
}
