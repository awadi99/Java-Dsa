public class Diagonal_sum {
    public static int IsDiagonalSum(int number[][])
    {
        // approch 1 
        // using  brute force
        int sum =0;
        for(int i =0;i<number.length;i++)
        {
            for(int j=0;j<number[i].length;j++)
            {
                // primary diagonal condition
                if(i==j){
                sum+=number[i][j];
                }
                // secondary diagonal condition
                else if(i+j==number.length-1){   //n-1 overlap element
                    sum+=number[i][j];
                }
            }
        }
        return sum;
    }

    public static int IsDiagonalSum2(int number[][])
    {
        int sum=0;
        for(int i=0;i<number.length;i++)
        {
            // primary diagonal condition
            sum+=number[i][i];
            // secondary diagonal condition
            if(i!=number.length-1-i){ //n overlap element
                sum+=number[i][number.length-i-1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int number[][] = {
            {1, 2, 3,4}
            , {5, 6, 7,8}
            , {9, 10, 11,12}
            , {13, 14, 15,16}
        };
        System.err.println(IsDiagonalSum(number));
        System.err.println(IsDiagonalSum2(number));
    }
}
