public class StringUpper {
    public static void main(String[] args)
    {
        String name[] ={"aditya","omkar","yash","krishna","priya"};

        for(int i =0;i<name.length;i++)
        {
                char str = name[i].charAt(i);
                String ch =String.valueOf(str);
                String nam1 = ch.toUpperCase();
                System.err.println(name[i].replaceFirst(ch, nam1));
        }
    }
}