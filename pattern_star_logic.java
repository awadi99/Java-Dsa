public class pattern_star_logic {
    public static void main(String[] args) {


        // for (int i = 0; i < 5; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         System.err.print(" * ");
        //     }
        //     System.err.println();
        // }

        // int n =5;
        // for(int i =1;i<=n;i++)
        // {
        // for(int j=1;j<=(n-i+1);j++)
        // {
        // System.err.print(" * ");
        // }
        // System.err.println();
        // }
        int number = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.err.print(" " + number);
            }
            number++;
            System.err.println();
        }

        // char ah ='a';
        // for(int i =0;i<5;i++)
        // {
        // for(int j=0;j<=i;j++)
        // {
        // System.err.print(" "+ah);
        // }
        // ah++;
        // System.err.println();
        // }
        // int n = 5;
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         System.err.print(" * ");
        //     }
        //     System.err.println();
        // }
        // int n=5;
        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=1;j<=(n-i+1);j++)
        //     {
        //         System.err.print(" * ");
        //     }
        //     System.err.println();
        // }
        char ch = 'A';
        for (int i = 0; i <= 5; i++) {
            for (int j = i; j < 5; j++) {

                System.err.print(" " + ch);
                ch++;
            }
            // ch++
            System.err.println();
        }

        // int number=10;
        // for(int i=0;i<5;i++)
        // {
        //     for(int j=i;j<5;j++)
        //     {
        //         System.err.print(number);
        //         number++;
        //     }
        //     System.err.println();
        // }
        int n = 5;
        int a = 1;
//         for(int i =0;i<=n;i++)
//         {
//             for(int j=0;j<i;j++)
//             {
//                 System.err.print("  "+a++);
//             }
//             System.err.println();
//         }

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n- i ; j++) {
        //         System.err.print(" * ");
        //     }
        //     System.err.println();
        // }

        char c = 'A';
        for(int i =0;i<=n;i++)
        {   
            for(int j =1;j<=i;j++)
            {
                // System.err.print(" "+c++); 
                System.err.print(" "+j);
            }
            
            System.err.println();
        }

    

    }
}
