import java.util.Arrays;
public class leetcode {

    // question : 26. Remove Duplicates from Sorted Array
    public static int RemoveDuplicates(int nums[]) {
        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i + 1;
    }

    public static boolean isVowels(String s) {
        boolean isVowels = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                isVowels = true;
            }
        }
        return isVowels;
    }

    public static String isVowelsReverse(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {

            String s1 = String.valueOf(s.charAt(start));
            String s2 = String.valueOf(s.charAt(end));

            if (!isVowels(s1)) {
                start++;
                continue; // skip non-vowel at start
            }

            if (!isVowels(s2)) {
                end--;
                continue; // skip non-vowel at end
            }

            // Swap characters using substring
            s = s.substring(0, start) + s.charAt(end) + s.substring(start + 1, end) + s.charAt(start)
                    + s.substring(end + 1);

            start++;
            end--;
        }
        return s;
    }

    public static void reverserCharacter(char[] s) {
        int start = 0;
        int end = s.length - 1;
        char temp;
        while (start < end) {
            temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        for (char ele : s) {
            System.err.print(ele);
        }
    }

    public static void reverse(char arr[], int i, int j) {
        char temp;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static String reveserString(String s, int k) {
        char arr[] = s.toCharArray();
        int i = 0;
        int n = arr.length;
        while (i < n) {
            int j = Math.min(i + k - 1, n - 1);
            // understand the size of k
            // means if suppose k size = 10 (i+k-1) 0 + 10 = 10 - 1 = 9
            // but problem here is we don't know what is size of k that is why we use (n-1)
            reverse(arr, i, j);
            // this line use for store the middle element as it is
            i = i + 2 * k;
        }
        return new String(arr);
    }

    // second largest number in array
    public static int SecondLargestElement(int nums[]) {
        int num = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > num && nums[i] != max) {
                num = nums[i];
            }
        }
        return num;
    }

    // thrid largest element in array
    // public static int ThridLargestElement(int nums[]) {
    // // this logic working on only positive number
    // // int size = nums.length;
    // // int nums1[]= new int [size];
    // // Arrays.sort(nums);
    // // nums1[size-3]=nums[size-3];
    // // System.err.println(nums1[size-3]);
    // }
    // find peak element in array
    public static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }

    // rotated array element
    public static void RotateArrayElement(int nums[], int k) {
        int n = nums.length;
        if (n == 0) {
            return;
        }
        k = k % n;
        int res[] = new int[n];
        for (int i = 0; i < n; i++) {
            res[(i + k) % n] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = res[i];
        }
    }

    public static void MoveZero(int nums[]) {
        int nonZero = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp = nums[i];
                nums[i] = nums[nonZero];
                nums[nonZero] = temp;
                nonZero++;
            }
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.err.println();
    }

    public static boolean Monotonic(int nums[]) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                decreasing = false;
            }
            if (nums[i] < nums[i - 1]) {
                increasing = false;
            }
        }
        return increasing || decreasing;
    }

    // Maximum SubArray
    public static int Maximum_SubArray(int nums[]) {
        int currentSum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    // Minimize Maximum Pair Sum in Array
    public static int minPairSum(int nums[]) {
        int i = 0;
        int j = nums.length - 1;
        int result = 0;
        Arrays.sort(nums);
        while (i < j) {
            int sum = nums[i] + nums[j];
            result = Math.max(result, sum);
            i++;
            j--;

        }
        return result;
    }

    public static void Next_Permutation(int nums[]) {
        int n = nums.length;
        int gola = -1;
        for (int i = n - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                gola = i - 1;
                break;
            }
        }

        if (gola != -1) {
            int swap = gola;
            for (int j = n - 1; j >= gola + 1; j--) {
                if (nums[j] > nums[gola]) {
                    swap = j;
                    break;
                }
            }
            int temp = nums[gola];
            nums[gola] = nums[swap];
            nums[swap] = temp;
        }
        Next_Permutation_Reverse(nums, gola + 1, n - 1);
    }

    public static void Next_Permutation_Reverse(int nums[], int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        // question : 26. Remove Duplicates from Sorted Array
        /*
         * Given an integer array nums sorted in non-decreasing order, remove the
         * duplicates in-place such that each unique element appears only once. The
         * relative order of the elements should be kept the same.
         * 
         * Consider the number of unique elements in nums to be k​​​​​​​​​​​​​​. After
         * removing duplicates, return the number of unique elements k.
         * 
         * The first k elements of nums should contain the unique numbers in sorted
         * order. The remaining elements beyond index k - 1 can be ignored.
         */
        int nums[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        RemoveDuplicates(nums);
        for (int n : nums) {
            // System.err.print(n + " ");
        }

        // question 2 : 345. Reverse Vowels of a String
        /*
         * Given a string s, reverse only all the vowels in the string and return it.
         * 
         * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower
         * and upper cases, more than once.
         * Example 1:
         * Input: s = "IceCreAm"
         * Output: "AceCreIm"
         * 
         * Explanation:
         * 
         * The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes
         * "AceCreIm".
         * 
         * Example 2:
         * 
         * Input: s = "leetcode"
         * 
         * Output: "leotcede"
         * 
         */
        // reverse vowels
        String input = "leetcode";
        // System.err.println(isVowelsReverse(input));

        // reverse whole String
        char s[] = { 'h', 'e', 'l', 'l', 'o' };
        // reverserCharacter(s);

        /*
         * Given a string s and an integer k, reverse the first k characters for every
         * 2k characters counting from the start of the string.
         * 
         * If there are fewer than k characters left, reverse all of them. If there are
         * less than 2k but greater than or equal to k characters, then reverse the
         * first k characters and leave the other as original.
         */
        String str = "abcdefg";
        int key = 2;
        // System.err.println('\n'+reveserString(str, key));

        // second largest element in array
        int number[] = { -1, -2, -3 };
        System.err.println(SecondLargestElement(number));

        // thrid largestElement in array
        // System.err.println(ThridLargestElement(number));
        // find peak element in array
        int arr[] = { 1, 2, 3, 1 };
        System.err.println(findPeakElement(arr));

        /*
         * 189. Rotate Array
         * Solved
         * Medium
         * Topics
         * premium lock icon
         * Companies
         * Hint
         * Given an integer array nums, rotate the array to the right by k steps, where
         * k is non-negative.
         */
        int element[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        RotateArrayElement(nums, key);

        // MoveZero
        /*
         * Given an integer array nums, move all 0's to the end of it while maintaining
         * the relative order of the non-zero elements.
         * 
         * Note that you must do this in-place without making a copy of the array.
         * Example 1:
         * 
         * Input: nums = [0,1,0,3,12]
         * Output: [1,3,12,0,0]
         * Example 2:
         * 
         * Input: nums = [0]
         * Output: [0]
         */

        int items[] = { 0, 1, 0, 3, 12 };
        MoveZero(items);

        // Monotonic Array
        /*
         * An array is monotonic if it is either monotone increasing or monotone
         * decreasing.
         * 
         * An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j].
         * An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].
         * 
         * Given an integer array nums, return true if the given array is monotonic, or
         * false otherwise.
         * 
         * 1,3,2
         * 6,5,4,4
         * 1,2,3,4,5
         */
        int num[] = { 1, 2, 4, 1 };
        System.err.println(Monotonic(num));

        // 53. Maximum Subarray
        /*
         * Given an integer array nums, find the subarray with the largest sum, and
         * return its sum.
         * Example 1:
         * 
         * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
         * Output: 6
         */

        int num1[] = { -2, 1 - 3, 4, -1, 2, 1, -5, 4 };
        System.err.println("Maximum SubArray = " + Maximum_SubArray(num1));

        // Minimize Maximum Pair Sum in Array
        /*
         * The pair sum of a pair (a,b) is equal to a + b. The maximum pair sum is the
         * largest pair sum in a list of pairs.
         * 
         * For example, if we have pairs (1,5), (2,3), and (4,4), the maximum pair sum
         * would be max(1+5, 2+3, 4+4) = max(6, 5, 8) = 8.
         * Given an array nums of even length n, pair up the elements of nums into n / 2
         * pairs such that:
         * 
         * Each element of nums is in exactly one pair, and
         * The maximum pair sum is minimized.
         * Return the minimized maximum pair sum after optimally pairing up the
         * elements.
         */
        int elements[] = { 3, 5, 2, 3 };
        // normal way they give 8 maximum number and optimize way they give 7 maximum
        System.err.println("Answer = " + minPairSum(elements));

        // 31 Next Permutation
        /*
         * A permutation of an array of integers is an arrangement of its members into a
         * sequence or linear order.
         * 
         * For example, for arr = [1,2,3], the following are all the permutations of
         * arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
         * The next permutation of an array of integers is the next lexicographically
         * greater permutation of its integer. More formally, if all the permutations of
         * the array are sorted in one container according to their lexicographical
         * order, then the next permutation of that array is the permutation that
         * follows it in the sorted container. If such arrangement is not possible, the
         * array must be rearranged as the lowest possible order (i.e., sorted in
         * ascending order).
         * 
         * For example, the next permutation of arr = [1,2,3] is [1,3,2].
         * Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
         * While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does
         * not have a lexicographical larger rearrangement.
         * Given an array of integers nums, find the next permutation of nums.
         * 
         * The replacement must be in place and use only constant extra memory.
         * 
         * 
         * Example 1:
         * 
         * Input: nums = [1,2,3]
         * Output: [1,3,2]
         * Example 2:
         * 
         * Input: nums = [3,2,1]
         * Output: [1,2,3]
         * Example 3:
         * 
         * Input: nums = [1,1,5]
         * Output: [1,5,1]
         */

        int Permutation[]={1,3,4,5,2};
        Next_Permutation(Permutation);
        for (int ele : Permutation)
        {
            System.err.print(" "+ele);
        }


    }
}
