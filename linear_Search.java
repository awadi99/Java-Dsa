public class linear_Search {
    public static boolean isLinear_Search(int n ,int number[])
    {
        boolean isLinear_Search=false;
        for(int i=0;i<number.length;i++)
        {
            if(number[i]==n)
            {
                isLinear_Search=true;
            }
        }
        return isLinear_Search;
    }
    public static void main(String[] args) {
        
        int n=102;
        int number[] ={19 ,23,10,89};
        if(isLinear_Search(n, number))
        {
            System.err.println("number is find");
        }
        else{
            System.err.println("number is not find");
        }
    }
}
