public class Substring {
    public static String isSubString(int strindex, int endindex, String str ){
        String subStr = "";
        for(int i=strindex;i<endindex;i++){
            subStr+=str.charAt(i);
        }
        return subStr;
    }
    public static void main(String[] args) {
        String  str ="helloworld";
        System.err.println(isSubString(0, 5, str));
        // and String also provide this type of function 
        // that is called of subString function 
        System.err.println(str.substring(0,5));
    }
}