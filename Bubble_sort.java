public class Bubble_sort {
    // public static void isBubble_sort(int number[]){
    //     int temp=0;
    //     for(int i =0;i<number.length;i++)
    //     {   
    //         for(int j=i+1;j<number.length;j++)
    //         {   
    //             if(number[i]>number[j])
    //             {
    //                 temp=number[i];
    //                 number[i]=number[j];
    //                 number[j]=temp;

                    
    //             }
    //         }
    //     }
    //     for(int ele :number)
    //     {
    //         System.err.print(" "+ele);
    //     }

    // }

    // public static void isBubble_sort(int number[]){
    //     int temp =0;
    //     for(int i =0 ;i<number.length;i++)
    //     {
    //         for(int j=0;j<number.length;j++)
    //         {
    //             if(number[i]<number[j])
    //             {
    //                 temp = number[i];
    //                 number[i]=number[j];
    //                 number[j]=temp;
    //             }
    //         }
    //     }

    //     for(int ele : number)
    //     {
    //         System.err.print(" " +ele);
    //     }

    // }

    public static void isBubble_sort(int nums[]){

        int temp=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]<nums[j])
                {
                    temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        for(int ele : nums)
        {
            System.err.print(" "+ ele);
        }

    }
    public static void main(String[] args) {
        int number[]={10,40,12,42,90,39,50};
        isBubble_sort(number);
    }
}
