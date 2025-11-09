public class toLower {
    public static String toLowerCase(String s) {
        char ch = Character.toLowerCase(s.charAt(0));
        String op = "" ;
        for(int i=1;i<s.length();i++)
        {
            op+=Character.toLowerCase(s.charAt(i));
        }
        return ch+op;
    }
    public static void main(String[] args) {
        String str="ADITYA";
        System.err.println(toLowerCase(str));        
    }
}
