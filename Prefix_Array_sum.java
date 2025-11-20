public class Prefix_Array_sum {

    // public static void isPrefix_Array_sum(int number[]) {
    // int max = Integer.MIN_VALUE;
    // int currsum = 0;

    // int prefix[] = new int[number.length];
    // prefix[0] = number[0];
    // // prefix[0]=1
    // // number[0]=1
    // for (int i = 1; i < prefix.length; i++) {
    // prefix[i] = prefix[i - 1] + number[i];
    // // preifix[i=0] 1= prefix[i-1]=-2+number[i=0]=1;
    // // number[]={1, -2 ,6 ,-1 ,3}
    // // prefix[]={1 ,-1,5,4,7} calculate sum array prefix
    // }
    // for(int i=0;i<number.length;i++)
    // {
    // int start=i;
    // for(int j=i;j<number.length;j++)
    // {
    // int end =j ;
    // currsum = start==0 ? prefix[end] : prefix[end] - prefix[start-1];
    // }
    // if(max<currsum)
    // {
    // max=currsum;
    // }
    // }
    // System.err.println(max);
    // }

    public static int isPrefix_Array_sum(int number[]) {
        int currsum = 0;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];
        prefix[0] = number[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + number[i];
        }
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = 0; j < number.length; j++) {
                int end = j;
                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                max = Math.max(max, currsum);
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int number[] = { -2,1,-3,4,-1,2,1,-5,4 };
        System.err.println(isPrefix_Array_sum(number));
    }
}
