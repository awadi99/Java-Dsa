
public class Print_SubArray {

    // public static void isPrint_SubArray(int number[])
    // {
    // int totalparis =0;
    // for(int i=0;i<number.length;i++)
    // {
    // int start =i;
    // for(int j=i;j<number.length;j++)
    // {
    // int end =j;
    // for(int k=start;k<=end;k++)
    // {
    // System.err.print(" "+number[k]);
    // }
    // totalparis++;
    // System.err.println();
    // }
    // System.err.println();
    // }
    // System.err.println("Total number of parise ="+totalparis);
    // }

    public static void isPrint_SubArray(int number[]) {
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = 0; j < number.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.err.print(number[k] + " ");
                }
                System.err.println();
            }
        }
    }

    public static void Print_SubArray_Element(int nums[]) {
        int total = 0, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            total = 0;
            for (int j = 0; j < nums.length; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    System.err.print("(" + nums[k] + ")");
                    sum += nums[k];
                }
                total++;
                System.err.println();
            }
            System.err.print("total sum " + sum);
            System.err.print(" total pairs "+ total);
            System.err.println();
        }

    }

    public static void main(String[] args) {

        int number[] = { 2, 4, 6, 8, 10 };
        // isPrint_SubArray(number);
        Print_SubArray_Element(number);

    }
}
