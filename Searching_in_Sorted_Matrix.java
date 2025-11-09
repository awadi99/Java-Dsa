public class Searching_in_Sorted_Matrix {
    public static boolean isSearching_in_Sorted_Matrix(int number[][],int key){
        int row =0;
        int col =number[row].length-1;
        while (row <number.length && col>=0) {
            if(number[row][col]==key)
            {
                System.err.println("Element is found = "+number[row][col] +" Index = " +row+","+col);
                return true;
            }
            else if(key<number[row][col])
            {
                col--;//left
            }
            else{
                row++;
            }
        }
        System.err.println("Element is not found");
        return false;
    }
    public static boolean isSearching_in_Sorted_Matrix2(int number[][] ,int key)
    {
        int col=0;
        int row=number.length-1;
        while(row>=0&&col<number[0].length)
        {
            if(number[row][col]==key)
            {
                System.err.println("Element is found = "+number[row][col] +" Index = " +row+","+col);
                return true;
            }
            else if(key<number[row][col])
            {
                row--;
            }
            else{
                col++;
            }
        }
        System.err.println("Element is not found");
        return false;
    }
    public static void main(String[] args) {
        int nums[][]={
            {10,20,30,40}
            ,{15,25,35,45}
            ,{27,29,37,48}
            ,{32,33,39,50}
        };
        int key =100;
        System.err.println(isSearching_in_Sorted_Matrix(nums, key));
        System.err.println(isSearching_in_Sorted_Matrix2(nums, key));
    }
}
