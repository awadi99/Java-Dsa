public class Largest_String {

    public static String islarges_String(String item[])
    {
        String largest =item[0];
        for(int i=1;i<item.length;i++)
        {
            if(largest.compareTo(item[i])<0)
            {
                largest = item[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        String item[]={"apple","banana","mango","z"};
        System.err.println(islarges_String(item));
    }
}
