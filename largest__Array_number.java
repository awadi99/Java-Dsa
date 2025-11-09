public class largest__Array_number {

//     public static int isLargest(int number[])
//     {
//         int isLargest=Integer.MIN_VALUE;
//         for(int i =0;i<number.length;i++)
//         {
//             if(number[i]>isLargest)
//             {
//                 isLargest=number[i];
              
//             }
//         }
//         return isLargest;
//     }


//     public static int isSmallest(int number[])
//     {
//         int isSmallest =Integer.MAX_VALUE;
//         for(int i=0;i<number.length;i++)
//         {
//             if(number[i]<isSmallest)
//             {
//                 isSmallest=number[i];
//             }
//         }
//         return isSmallest;
//     }



public static int Is_maximum(int nums[])
{
    int max =Integer.MIN_VALUE;
    int num =0;
    for(int i =0;i<nums.length;i++)
    {
        if(max<nums[i])
        {   
            max=nums[i];
        }
    }
    for(int i =0;i<nums.length;i++)
    {
        if(nums[i]>num && nums[i]!=max)
        {
            num=nums[i];
        }
    }
    return num;
}
    
    public static void main(String[] args) {
        
        int number[]={11,2,3,4,5,8,9,12};
        // System.err.println(isLargest(number));

        // =============================
        // System.err.println(isSmallest(number));

        System.err.println(Is_maximum(number));


        
    }
}
