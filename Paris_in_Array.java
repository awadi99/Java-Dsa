
public class Paris_in_Array {

    public static void isParis_in_Array(int number[]) {
        int tp = 0;
        for (int i = 0; i <= number.length - 1; i++) {
            for (int j = 1; j < number.length - i + 1 - 1; j++) {
                System.err.print("(" + number[i] + "," + number[j] + ")");
                tp++;
            }
            System.err.println();
        }
        System.err.print("Total number of paris =" + tp);
        System.err.println();
    }

    public static void is_Paris_in_Array(int number[]) {
        int tp = 0;
        for (int i = 0; i <= number.length - 1; i++) {
            int curr = number[i];
            for (int j = i + 1; j <= number.length - 1; j++) {
                System.err.print("(" + curr + "," + number[j] + ")");
                tp++;
            }
            System.err.println(); 
        }
        System.err.print("total number of paris =" + tp);
        System.err.println();
    }

    public static void Paris_in_Array(int number[]) {
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                System.err.print("(" + number[i] + "," + number[j] + ")");
            }
            System.err.println();
        }
    }

    public static void Paris_in_Array1(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            for (int j = i+1; j < nums.length; j++) {
                System.err.print("(" + curr + "," + nums[j] + ")");
            }
            System.err.println();
        }

    }


    public static void Paris_of_Array_Element(int nums[])
    {
        for(int i =0;i<nums.length;i++)
        {
            int curr = nums[i];
            for(int j=i+1;j<nums.length;j++)
            {
                System.err.print("("+curr+","+nums[j]+")");
            }
            System.err.println();
        }
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10 };
        // isParis_in_Array(number);
        // is_Paris_in_Array(number);
        // Paris_in_Array(number);
        // Paris_in_Array1(number);
        Paris_of_Array_Element(number);

    }
}
