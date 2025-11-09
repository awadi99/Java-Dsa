public class common {
        public static int longestCommonSubsequence(String text1, String text2) {
            int comon =0;
            for(int i =0 ;i<text1.length();i++)
            {   
                char ch = text1.charAt(i);
                for(int j =0;j<text2.length();j++)
                {
                    if(ch == text2.charAt(j))
                    {
                        comon++;
                    }
                }
            }
            return comon;
        }
    
    public static void main(String[] args) {
        String str ="ezupkr";
        String str1 ="ubmrapg";
        System.err.println(longestCommonSubsequence(str1, str));
    }
}
