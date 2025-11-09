public class Insertion_Sort {

    // public static void isInsertionSort(int number[])
    // {
    //         for(int i =1;i<number.length;i++)
    //         {
    //             int current=number[i];  //--> temp
    //             int previous=i-1;

    //             while(previous>=0&&number[previous]>current)
    //             {
    //                 number[previous+1]=number[previous];  //[ number[previous+1]=number[preious]] //  [number[4]=number[6]]; for reason acending order
    //                 previous--;
    //             }
    //             number[previous+1]=current;
    //         }
    // }

    // public static void isInsertionSort(int number[])
    // {
    //     for(int i=1;i<number.length;i++)
    //     {
    //         int current=number[i];
    //         int preious=i-1;
    //         while(preious >=0&& number[preious]>current)
    //         {
    //             number[preious+1]=number[preious];
    //             preious--;
    //         }

    //         number[preious+1]=current;
    //     }
    // }


    public static void insertionSort(int nums[])
    {
        
       for(int i =1;i<nums.length;i++)
       {
            int curr = nums[i];
            int preious=i-1;
            while(preious>=0 && nums[preious]>curr)
            {
                nums[preious+1]=nums[preious];
                preious--;
            }
            nums[preious+1]=curr;
       }
       for (int ele:nums)
       {
            System.err.print(" " +ele);
       }
       
    }
    public static void main(String[] args) {
        int number[]={10,76,93,56,43,69};
        // isInsertionSort(number);
        // for(int ele :number)
        // {
        //     System.err.print(" "+ele);
        // }

        insertionSort(number);
    }
    
}
