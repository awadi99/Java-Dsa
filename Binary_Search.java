

public class Binary_Search {

    // public static int isBinary_Search(int key, int number[]) {
    // int start = 0;
    // int end = number.length - 1;
    // while (start <= end) {
    // int mid = (start + end) / 2;
    // if (number[mid] == key) {
    // return mid;
    // }
    // if (number[mid] < key) {
    // start = mid + 1;
    // } else {
    // end = mid - 1;
    // }
    // }
    // return -1;
    // }

    // public static int isBinary_Search(int key,int number[])
    // {
    // int start =0;
    // int end= number.length-1;
    // while(start<=end)
    // {
    // int mid =(start+end)/2;
    // if(number[mid]==key)
    // {
    // return mid;
    // }
    // if(number[mid]<key)
    // {
    // start=mid+1;
    // }
    // else{
    // end=mid-1;
    // }
    // }
    // return -1;
    // }

    // public static int isBinary_Search(int number[],int key)
    // {
    // int start =0;
    // int end =number.length-1;

    // while(start<=end)
    // {
    // int mid = (start+end)/2;
    // if(number[mid]==key)
    // {
    // return number[mid];
    // }
    // if(number[mid]<key)
    // {
    // start = mid+1;
    // }
    // else{
    // end =mid-1;
    // }
    // }
    // return -1;
    // }

    // peak find number arr using binaray search
    public static int isBinary_Search(int number[]) {
        int start = 0;
        int end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (number[mid] > number[mid + 1] && number[mid] > number[mid - 1]) {
                return number[mid];
            } else {
                start = mid + 1;
                end = mid - 1;
            }
        }
        return -1;
    }

    // Question 6:
    // Search for an element in a rotated sorted
    // array using binary search.
    // This problem asks you to find the index of a
    // given element in an array that was originally
    // sorted but then rotated at some pivot. Would
    // you like the code for this solution?

    // public static int is_BS_Search_in_sorted_arr(int nums[],int target)
    // {
    //     int start =0;
    //     int end =nums.length-1;
    //     while(start<=end)
    //     {
    //         int mid = start+(end-start)/2;
    //         if(nums[mid]==target)
    //         {
    //             return mid;
    //         }
    //         if(nums[start]<=nums[mid])
    //         {
    //             if(nums[start]<=target && target <= nums[mid])
    //             {
    //                 end=mid-1;
    //             }
    //             else{
    //                 start = mid+1;
    //             }
    //         }
    //         else{
    //             if(nums[mid]<=target && target <= nums[end])
    //             {
    //                 start=mid+1;
    //             }
    //             else{
    //                 end=mid-1;
    //             }
    //         }
    //     }
    //     return-1;
    // }

    // public static int search(int nums[], int target) {
    //     int start =0;int end =nums.length-1;
    //     while(start<=end)
    //     {
    //         int mid=start+(end-start)/2;
    //         if(nums[mid]==target)
    //         {
    //             return mid;
    //         }
    //         if(nums[start]<=nums[mid])
    //         {
    //             if(nums[start]<=target && target <=nums[mid])
    //             {
    //                 end=mid-1;
    //             }
    //             else{
    //                 start=mid+1;
    //             }
    //         }
    //         else{
    //             if(nums[mid]<=target && target <=nums[end])
    //             {
    //                 start=mid+1;
    //             }
    //             else{
    //                 end=mid-1;
    //             }
    //         }
    //     }return -1;
    // }






    // public static int isBinary_Search(int target,int nums[])
    // {
    //     int start=0;
    //     int end= nums.length-1;

    //     while(start<=end)
    //     {
    //         int mid = start+(end-start)/2;
    //         if(nums[mid]==target)
    //         {
    //             return mid;
    //         }
    //         if(nums[mid]<=target)
    //         {
    //             start=mid+1;
    //         }
    //         else{
    //             end=mid-1;
    //         }
    //     }
    //     return  -1;
    // }


    public static int isSorted(int nums[],int target)
    {
        int start =0;
        int end =nums.length-1;
        while(start<=end)
        {
            int mid = start +(end-start)/2;
            if(nums[mid]==target)
            {
                return mid;
            }

            if(nums[mid]<=target)
            {
                if(nums[start]<=target || target<=nums[mid])
                {
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(nums[mid]<=target || target<= nums[end])
                {
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }




    public static void main(String[] args) {

        // int number[] = { 100, 120, 122, 123, 140, 1143, 4110 };
        // int number[] = { 5, 6, 7, 8, 9, 1, 2, 3, 4 };
        // int key = 140;
        // System.err.println("index of number is " + isBinary_Search(number, key));
        // System.err.print(" " + isBinary_Search(key,number));

        int nums [] ={4,5,6,7,0,1,2};
        int target = 5;
        // System.err.print(" " +is_BS_Search_in_sorted_arr(nums, target));
        // System.err.println(search(nums, target));
        System.err.println(isSorted(nums, target));

    }

}

