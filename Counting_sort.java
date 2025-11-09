public class Counting_sort {
    public static void isCounting_sort(int number[]) {
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            large = Math.max(large, number[i]);
        }

        int count[] = new int[large + 1];
        for (int i = 0; i < number.length; i++) {
            count[number[i]]++;
        }

        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                number[j] = i;
                j++;
                count[i]--;
            }
        }

    }

    public static void main(String[] args) {
        int number[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        isCounting_sort(number);
        for (int ele : number) {
            System.err.print(" "+ele);
        }
    }
}
