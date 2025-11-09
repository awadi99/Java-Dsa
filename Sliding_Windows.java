public class Sliding_Windows {

    public static int Sliding_Windows(int window,int nums[])
    {
        // and find the maximum subarray
        int sum =0;
        for(int  i =0;i<window;i++)
        {
            sum+=nums[i];
        }
        int max = sum;
        for(int i =1;i<=nums.length-window;i++)
        {
            sum = sum - nums[i-1]+nums[i+window-1];
        } 
        return  max = Math.max(max, sum);
    }
    public static void main(String[] args)
    {
        int nums[]={100,200,300,400};
        int key =2;
        System.err.println(Sliding_Windows(key, nums));
    }
}
