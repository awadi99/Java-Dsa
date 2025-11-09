
import java.util.Arrays;

public class In_Built_Arraysort {
    public static void isIn_Built_Arraysort(int number[])
    {
        Arrays.sort(number);
        for(int ele :number)
        {
            System.err.print(" "+ele);
        }
    }
    public static void main(String[] args) {
        int number[]={1,2,4,56,5,7,8};
        isIn_Built_Arraysort(number);
    }
}
