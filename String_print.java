public class String_print {

    public static void isPrint(String str,String key)
    {
        for(int i=0;i<str.length();i++)
        {
            System.err.print(" "+str.charAt(i));
        }
    }
    public static void main(String[] args) {
        String name="aditya_waghmare";
        String key ="gh";
        isPrint(name, key);
    }
}
