public class String_reverse {

    public static void is_reverse(String str)
    {
        String reverse = "";
        int size = str.length();
        for(int i =size-1;i>=0;i--)
        {
            reverse +=str.charAt(i);
        }
        System.err.print(" " +reverse);
    }
    
    public static void main(String args[])
    {
        String str= "aditya";
        is_reverse(str);
    }
}
