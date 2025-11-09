public class Reverse_Array {

    // public static void isReverseArray(int number[]) {
    // int start = 0;
    // int end = number.length - 1;
    // for (int num : number) {
    // System.err.print(" " + num);
    // }
    // while (start < end) {
    // int temp = number[start];
    // number[start] = number[end];
    // number[end] = temp;
    // start++;
    // end--;
    // }
    // System.err.println();
    // for (int num : number) {
    // System.err.print(" " + num);
    // }

    // }

    public static void isReverseArray(int number[]) {
        int start = 0;
        int end = number.length - 1;
        while (start < end) {
            int temp = number[start];
            number[start] = number[end];
            number[end] = temp;
            start++;
            end--;
        }
        for (int ele : number) {
            System.err.print("  " + ele);
        }

    }

    public static void main(String[] args) {

        int number[] = { 1, 2, 3, 4, 5 };
        isReverseArray(number);

    }
}
