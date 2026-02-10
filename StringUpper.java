public class StringUpper {

    public static String comman(String s1, String s2) {
        int n = Math.min(s1.length(),s2.length());
        StringBuilder sb = new StringBuilder();
        for(int i =0 ; i<n; i++){
            if (s1.charAt(i)==s2.charAt(i))
            {
                sb.append(s1.charAt(i));
            }
            else{
                break;
            }
        }
        return sb.toString();
    }

    public static String longestCommonPrefix(String[] strs) {
        String res = strs[0];
        for(int i =1 ; i <strs.length;i++){
            res=comman(res, strs[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        String name[] = { "aditya", "omkar", "yash", "krishna", "priya" };

        for (int i = 0; i < name.length; i++) {
            char str = name[i].charAt(i);
            String ch = String.valueOf(str);
            String nam1 = ch.toUpperCase();
            System.err.println(name[i].replaceFirst(ch, nam1));
        }

        String value[] = { "flower", "flow", "flight" };
        System.err.println(longestCommonPrefix(value));
    }
}