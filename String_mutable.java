public class String_mutable {
    public static void main(String[] args) {
        // String is immuatble 
        // but StringBuilder and StringBuffer is mutable
        // way :-1
        StringBuilder sb = new StringBuilder("hi i am StringBuilder");
        System.err.println(sb.toString());
        sb.append("world");
        sb.insert(5, "_");
        System.err.println(sb);

        // way :-2
        StringBuffer str = new StringBuffer("hi i am StringBuffer");
        System.err.println(str);
        str.append("aditya");
        str.insert(5, "_");
        System.err.println(str);
    }
}
