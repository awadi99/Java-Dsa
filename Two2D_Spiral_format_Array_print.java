public class Two2D_Spiral_format_Array_print {
    public static void isTwo2D_Spiral_format_Array_print(int number[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = number.length - 1;
        int endCol = number[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            for (int i = startCol; i <= endCol; i++) { // --> top
                System.err.print(" " + number[startRow][i]);
            }
            for (int i = startRow + 1; i <= endRow; i++) { // --> right
                System.err.print(" " + number[i][endCol]);
            }
            if (startRow < endRow) {
                for (int i = endCol - 1; i >= startCol; i--) { // -->bottom
                    System.err.print(" " + number[endRow][i]);
                }
            }

            if (startCol < endCol) {
                for (int i = endRow - 1; i >= startRow + 1; i--) {
                    System.err.print(" " + number[i][startCol]);
                }
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.err.println();
    }

    public static void main(String[] args) {
        // int number[][] ={
        // {1,2,3,4},
        // {5,6,7,8},
        // {9,10,11,12},
        // {13,14,15,16}};
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        isTwo2D_Spiral_format_Array_print(matrix);
    }
}
