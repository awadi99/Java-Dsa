public class String_palindrome {
  // this logic are simply check case sensitive
  // this need to be improved
  // to ignore case and spaces
  // example 
  // Aa , .a
    // public static boolean isString_palindrome(String str)
    // { 
    //     int n = str.length();
    //   for(int i=0;i<str.length()/2;i++) 
    //   {
    //     if(str.charAt(i)!=str.charAt(n-1-i))
    //     {
    //         return false;
    //     }
    //   }
    //   return true;
    // }

    public static boolean isString_palindrome(String str)
    {
        int n =str.length();
        str= str.toLowerCase();
        for(int i=0;i<str.length()/2;i++)
        {
          if(str.charAt(i)!=str.charAt(n-1-i))
          {
            return false;
          }
        }
        return true;
    }
    public static void main(String[] args) {
        String str ="noon";
       System.err.println(isString_palindrome(str));
    }
}
