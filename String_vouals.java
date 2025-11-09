public class String_vouals {

    public static int isCheck(String str) {
        int count = 0;
        str = str.toLowerCase();
        String vowels = "aeiou"; // no spaces

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (vowels.indexOf(ch) != -1) { // check if ch is a vowel
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(isCheck(str)); // Output: 5
    }
}
