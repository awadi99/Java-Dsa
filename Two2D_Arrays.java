public class Two2D_Arrays {
    public static void is2D_Arrays(int number[][])
    {
        for(int i=0;i<number.length;i++)
        {
            for(int j=0;j<number[i].length;j++)
            {
                System.err.print(" "+number[i][j]);
            }
            System.err.println();
        }
    }
    public static void main(String[] args) {
        int number[][]={{1,2,3},{4,5,6},{7,8,9}};
        is2D_Arrays(number);
        
    }
}
