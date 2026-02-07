import java.util.Arrays;
import java.util.List;
import java.util.*;

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

    // String Valid Palindrome
    public static boolean stringPalindrome(String s) {
        s = s.toLowerCase();
        int p1 = 0;
        int p2 = s.length() - 1;
        while (p1 < p2) {
            char ch1 = s.charAt(p1);
            char ch2 = s.charAt(p2);

            if (!(ch1 >= 'a' && ch1 <= 'z' || ch1 >= '0' && ch1 <= '9')) {
                p1++;
                continue;
            }
            if (!(ch2 >= 'a' && ch2 <= 'z' || ch2 >= '0' && ch2 <= '9')) {
                p2--;
                continue;
            }
            if (ch1 != ch2)
                return false;
            p1++;
            p2--;
        }
        return true;
    }

    // 121. Best Time to Buy and Sell Stock
    public static int buy_Sell_Stock(int prices[]) {
        int maxProfit = 0;
        int buyProfit = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (buyProfit < prices[i]) {
                int profit = prices[i] - buyProfit;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyProfit = prices[i];
            }
        }
        return maxProfit;
    }

    // 258. Add Digits
    // Given an integer num, repeatedly add all its digits until the result has only
    // one digit, and return it.

    static int sum = 0;

    public static int countOfDigit(int num) {
        int count = 0;
        sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
            count++;
        }
        return count;
    }

    public static int addDigit(int num) {
        while (countOfDigit(num) > 1) {
            num = sum;
        }
        return sum;
    }

    // one plus

    public static int[] plusOne(int nums[]) {
        int n = nums.length;
        int i = n - 1;
        while (i >= 0) {
            if (nums[i] < 9) {
                nums[i] += 1;
                return nums;
            }
            // if we get the 9 element
            nums[i] = 0; // 9+1 = 10
            i--;
        }
        nums = new int[nums.length + 1];
        nums[0] += 1;
        return nums;

    }

    public static boolean containsDuplicate(int nums[]) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    // 214 short palindrome

    public static String shortpaliindrome(String s) {
        int n = s.length();
        String rev = new StringBuilder(s).reverse().toString();
        for (int i = 0; i < n; i++) {
            if (s.substring(0, n - i).equals(rev.substring(i))) {
                return rev.substring(0, i) + s;
            }
        }
        return rev + s;
    }

    // 169. Majority Element

    public static int majorityElement(int nums[]) {
        int n = nums.length;
        int count = 0;
        int maj = 0;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count = 1;
                maj = nums[i];// assume
            } else if (nums[i] == maj) {
                count++;
            } else {
                count--;
            }
        }
        return maj;
    }

    public static List<Integer> majority2Element(int nums[]) {
        int n = nums.length;
        int maj1 = 0, maj2 = 0;
        int count1 = 0, count2 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == maj1) {
                count1++;
            } else if (nums[i] == maj2) {
                count2++;
            } else if (count1 == 0) {
                maj1 = nums[i];
                count1 = 1;
            } else if (count2 == 0) {
                maj2 = nums[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        List<Integer> result = new ArrayList<>();
        int freq1 = 0, freq2 = 0;
        for (int num : nums) {
            if (num == maj1) {
                freq1++;
            }
            if (num == maj2) {
                freq2++;
            }
        }
        if (freq1 > n / 3) {
            result.add(maj1);
        }
        if (freq2 > n / 3) {
            result.add(maj2);
        }
        return result;
    }

    public static String common(String s1, String s2) {
        int n = Math.min(s1.length(), s2.length());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                sb.append(s1.charAt(i));
            } else {
                break;
            }
        }
        return sb.toString();
    }

    public static String longestCommonPrefix(String[] strs) {

        String res = strs[0];
        for (int i = 1; i < strs.length; i++) {
            res = common(res, strs[i]);
        }
        return res;
    }

    /* 11. Container With Most Water */

    public static int maxArea(int height[]) {
        int n = height.length;
        int i = 0, j = n - 1;
        int maxWater = 0;
        while (i < j) {
            int w = j - i;
            int h = Math.min(height[i], height[j]);
            int area = w * h;
            maxWater = Math.max(maxWater, area);
            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }
        return maxWater;
    }


    public static boolean containsNearByDuplicate(int [] nums,int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0 ; i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int prevIndex = map.get(nums[i]);
                if(i-prevIndex <=k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
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

        int Permutation[] = { 1, 3, 4, 5, 2 };
        Next_Permutation(Permutation);
        for (int ele : Permutation) {
            System.err.print(" " + ele);
        }

        // String Valid Palindrome
        System.err.println();
        String palindrome = "A,";
        System.err.println("Palindrome = " + stringPalindrome(palindrome));

        // 121. Best Time to Buy and Sell Stock

        // You are given an array prices where prices[i] is the price of a given stock
        // on the ith day.

        // You want to maximize your profit by choosing a single day to buy one stock
        // and choosing a different day in the future to sell that stock.

        // Return the maximum profit you can achieve from this transaction. If you
        // cannot achieve any profit, return 0.

        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.err.println("Max profit = " + buy_Sell_Stock(prices));

        // 258 addDigit
        /*
         *
         * Given an integer num, repeatedly add all its digits until the result has only
         * one digit, and return it.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: num = 38
         * Output: 2
         * Explanation: The process is
         * 38 --> 3 + 8 --> 11
         * 11 --> 1 + 1 --> 2
         * Since 2 has only one digit, return it.
         * Example 2:
         * 
         * Input: num = 0
         * Output: 0
         * 
         * 
         * Constraints:
         * 
         * 0 <= num <= 231 - 1
         */

        int Digit = 38;
        System.err.println("answer = " + addDigit(Digit));

        // 66 Plus one
        /*
         * You are given a large integer represented as an integer array digits, where
         * each digits[i] is the ith digit of the integer. The digits are ordered from
         * most significant to least significant in left-to-right order. The large
         * integer does not contain any leading 0's.
         * 
         * Increment the large integer by one and return the resulting array of digits.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: digits = [1,2,3]
         * Output: [1,2,4]
         * Explanation: The array represents the integer 123.
         * Incrementing by one gives 123 + 1 = 124.
         * Thus, the result should be [1,2,4].
         * Example 2:
         * 
         * Input: digits = [4,3,2,1]
         * Output: [4,3,2,2]
         * Explanation: The array represents the integer 4321.
         * Incrementing by one gives 4321 + 1 = 4322.
         * Thus, the result should be [4,3,2,2].
         * Example 3:
         * 
         * Input: digits = [9]
         * Output: [1,0]
         * Explanation: The array represents the integer 9.
         * Incrementing by one gives 9 + 1 = 10.
         * Thus, the result should be [1,0].
         * 
         * 
         * Constraints:
         * 
         * 1 <= digits.length <= 100
         * 0 <= digits[i] <= 9
         * digits does not contain any leading 0's.
         */

        int digits[] = { 9 };
        digits = plusOne(digits);
        for (int i : digits) {
            System.err.print("[" + i + "]");
        }
        System.err.println();

        // 217 contains Duplicate
        /*
         * Companies
         * Given an integer array nums, return true if any value appears at least twice
         * in the array, and return false if every element is distinct.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: nums = [1,2,3,1]
         * 
         * Output: true
         * 
         * Explanation:
         * 
         * The element 1 occurs at the indices 0 and 3.
         * 
         * Example 2:
         * 
         * Input: nums = [1,2,3,4]
         * 
         * Output: false
         * 
         * Explanation:
         * 
         * All elements are distinct.
         * 
         * Example 3:
         * 
         * Input: nums = [1,1,1,3,3,4,3,2,4,2]
         * 
         * Output: true
         * 
         * 
         * 
         * Constraints:
         * 
         * 1 <= nums.length <= 105
         * -109 <= nums[i] <= 109
         */

        int containsDuplicate[] = { 1, 2, 3, 4 };
        System.err.println("Answer Contains Duplication = " + containsDuplicate(containsDuplicate));

        // 214 shortpalindrome
        /*
         * 
         * Companies
         * You are given a string s. You can convert s to a palindrome by adding
         * characters in front of it.
         * 
         * Return the shortest palindrome you can find by performing this
         * transformation.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: s = "aacecaaa"
         * Output: "aaacecaaa"
         * Example 2:
         * 
         * Input: s = "abcd"
         * Output: "dcbabcd"
         * 
         * 
         * Constraints:
         * 
         * 0 <= s.length <= 5 * 104
         * s consists of lowercase English letters only.
         */

        String n = "aacecaaa ";
        System.err.println(shortpaliindrome(n));

        // 169. Majority Element
        /*
         * Given an array nums of size n, return the majority element.
         * 
         * The majority element is the element that appears more than ⌊n / 2⌋ times. You
         * may assume that the majority element always exists in the array.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: nums = [3,2,3]
         * Output: 3
         * Example 2:
         * 
         * Input: nums = [2,2,1,1,1,2,2]
         * Output: 2
         * 
         * 
         * Constraints:
         * 
         * n == nums.length
         * 1 <= n <= 5 * 104
         * -109 <= nums[i] <= 109
         * The input is generated such that a majority element will exist in the array.
         * 
         * 
         * Follow-up: Could you solve the problem in linear time and in O(1) space?
         */

        int majority[] = { 2, 2, 1, 1, 1, 2, 2 };
        System.err.println("Majority = " + majorityElement(majority));

        // 229. Majority Element II
        /*
         * Given an integer array of size n, find all elements that appear more than ⌊
         * n/3 ⌋ times.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: nums = [3,2,3]
         * Output: [3]
         * Example 2:
         * 
         * Input: nums = [1]
         * Output: [1]
         * Example 3:
         * 
         * Input: nums = [1,2]
         * Output: [1,2]
         * 
         * 
         * Constraints:
         * 
         * 1 <= nums.length <= 5 * 104
         * -109 <= nums[i] <= 109
         * 
         * 
         * Follow up: Could you solve the problem in linear time and in O(1) space?
         * 
         * 
         * Seen this question in a real interview before?
         * 1/5
         */
        int majority2[] = { 2, 1, 1, 3, 1, 4, 5, 6 };
        System.err.println("< Majority > = " + majority2Element(majority2));

        /*
         * 14. Longest Common Prefix
         * Write a function to find the longest common prefix string amongst an array of
         * strings.
         * 
         * If there is no common prefix, return an empty string "".
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: strs = ["flower","flow","flight"]
         * Output: "fl"
         * Example 2:
         * 
         * Input: strs = ["dog","racecar","car"]
         * Output: ""
         * Explanation: There is no common prefix among the input strings.
         * 
         * 
         * Constraints:
         * 
         * 1 <= strs.length <= 200
         * 0 <= strs[i].length <= 200
         * strs[i] consists of only lowercase English letters if it is non-empty.
         */

        String strs[] = { "flower", "flow", "flight" };
        System.err.println(" longestCommonPrefix =  " + longestCommonPrefix(strs));

        /*
         * 11. Container With Most Water
         * 
         * Hint
         * You are given an integer array height of length n. There are n vertical lines
         * drawn such that the two endpoints of the ith line are (i, 0) and (i,
         * height[i]).
         * 
         * Find two lines that together with the x-axis form a container, such that the
         * container contains the most water.
         * 
         * Return the maximum amount of water a container can store.
         * 
         * Notice that you may not slant the container.
         */

        int bar[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.err.println("MaxArea = " + maxArea(bar));

        /*
         * 219. Contains Duplicate II
         * Given an integer array nums and an integer k, return true if there are two
         * distinct indices i and j in the array such that nums[i] == nums[j] and abs(i
         * - j) <= k.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: nums = [1,2,3,1], k = 3
         * Output: true
         * Example 2:
         * 
         * Input: nums = [1,0,1,1], k = 1
         * Output: true
         * Example 3:
         * 
         * Input: nums = [1,2,3,1,2,3], k = 2
         * Output: false
         * 
         * 
         * Constraints:
         * 
         * 1 <= nums.length <= 105
         * -109 <= nums[i] <= 109
         * 0 <= k <= 105
         */

        int target=3;
        int atom []={1,2,3,1};
        System.err.println(containsNearByDuplicate(atom,target));
    }
}
