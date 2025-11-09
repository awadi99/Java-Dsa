public class Maximum_SubArray {
    // public static void isMaxium_SubArray(int number[]) {
    //     int sum = 0;
    //     int max = Integer.MIN_VALUE;

    //     for (int i = 0; i < number.length; i++) {
    //         int start =i;
    //         for (int j = i; j < number.length; j++) {
    //             int end =j;
    //             sum = 0;
    //             for (int k = start; k <= end; k++) {
    //                 sum += number[k];
    //             }
    //             if (max < sum) {
    //                 max = sum;
    //             }
    //             System.err.println("sum ="+sum);
    //         }
    //     }
    //     System.err.println("max ="+max);

    // }

    public static int  isMaxium_SubArray(int number[]){
        int max =Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<number.length;i++){
            for(int j=0;j<number.length;j++)
            {
                sum=0;
                for(int k=i;k<=j;k++){
                    sum+= number[k];
                    System.err.print(number[k]);
                }
                System.err.println();
                if(max<sum){
                    max=sum;
                }
            }
            System.err.print("sum = "+sum);
        }
        return max;
    }

    public static void main(String[] args) {
        int number[] = { -2,-1};
        
        System.err.println("\nMax = "+ isMaxium_SubArray(number));
    }
}
