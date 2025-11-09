public class Array_question {
    public static boolean isDuplicate(int number[]) {
        boolean isDuplicate = false;
        for (int i = 0; i < number.length; i++) {
            int num = number[i];
            for (int j = i + 1; j < number.length; j++) {
                if (num == number[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int isRotatedArrayIndex(int key ,int num[])
    {


        int start =0;
        int end=num.length-1;
        int mid =0; 
        int index=0;
        int last=0;
        while(start<=end)
        {
            mid = (start+end)/2;
            if(num[mid]==0)
            {
                index=mid;
            }
            if(num[end]<0)
            {
                end++;
            }
            else{
                start++;
            }
        }
        last=index-1;
        if(key<last){
        while(start<=last)
        {
            mid = (start+last)/2;
            if(num[mid]==key)
            {
                return mid;
            }
            if(num[mid]<key)
            {
                start=mid+1;
            }
            else{
                last=mid-1;
            }
        }
                return mid;
        }
        int position =index+1;
        if(position>key){
        while(position<=end)
        {
            mid = (position+end)/2;
            if(num[mid]==key)
            {
                return mid;
            }
            if(num[mid]<key)
            {
                position=mid+1;
            }
            else{
                end=mid-1;
            }
         }
            return mid;
         } 

         return -1;
    }

    public static void main(String[] args) {
        // Question 1: Given an integer array nums, return true if any value appears at
        // least twice in the array, and return false if every element is distinct.
        // int number[] = { 1, 2, 1, 3, 4, 5 };
        // boolean value = isDuplicate(number);
        // System.err.println(value);

        // Question 2: There is an integer array nums sorted in ascending order (with
        // distinct values).
        // Prior to being passed to your function, nums is possibly rotated at an
        // unknown
        // pivot index k (1 <= k < nums.length) such that the resulting array is
        // [nums[k],
        // nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For
        // example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and
        // become [4,5,6,7,0,1,2].
        // Given the array nums after the possible rotation and an integer target,
        // return the index of target if it is in nums, or -1 if it is not in nums.
        // You must write an algorithm with O(log n) runtime complexity.
        int num[]={4,5,6,7,0,1,2,3};
        int key =6;
       int idx= isRotatedArrayIndex(key, num);
       System.err.println(idx);
    }
}
