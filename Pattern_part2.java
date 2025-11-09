public class Pattern_part2 {

    public static void hollow_pattern(int row, int col){
        // outer loop
        for(int i=1;i<=row;i++){
            // inner loop
            for(int j=1;j<=col;j++){
                if(i==1 || i== row || j==1 || j==col)
                {
                    System.err.print("*");
                }
                else{
                    System.err.print(" ");
                }
            }
            System.err.println();
        }
    }


    public static void Inverted_pattern_Rotated(int n){
        // n means = row
        for(int i = 1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.err.print(" ");
            }
            for(int k =1;k<=i;k++)
            {
                System.err.print("*");
            }
            System.err.println();
        }
        
    }

    public static void Inverted_pattern(int n){

        for(int i =0;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.err.print(" "+j);
            }
            System.err.println();

        }
    }

    // even and odd triangle

    public static void Is_even_odd_triangle(int n){

        for(int i =1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    System.err.print(" 1 ");
                }
                else{
                    System.err.print(" 0 ");
                }
            }
            System.err.println();
        }

    }


    public static void IsButterFly_Pattern(int n)
    {
        //  outer loop
        for(int i = 1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {   
                // print star
                System.err.print("*");
            }
            for(int j=1;j<=2*(n-i);j++)
            {
                //  print space
                System.err.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                //  print start
                System.err.print("*");
            }
            System.err.println();
        }

        // mirror reflect outer loop
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                // print star
                System.err.print("*");
            }
            for(int j=1;j<=2*(n-i);j++)
            {
                // print space 
                System.err.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.err.print("*");
            }
            System.err.println();
        }

    }

        public static void Is_pattern(int n){
        for(int i =1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.err.print("1 ");
                System.err.print("0 ");

            }
            System.err.println();
        }

        // inverse
        for(int i =0;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.err.print("1 ");
                System.err.print("0 ");
            }
            System.err.println();
        }

    }

    // public static void Is_Diamond_Pattern(int n)
    // {
    //     // is not a diamond pattern beacuse the my lower loop miss the print one line of loop
    //     //    outer loop
    //     for(int i =1;i<=n;i++)
    //     {
    //         // inner loop for space
    //         for(int j=1;j<=n-i;j++)
    //         {
    //             System.err.print(" ");
    //         }
    //         // inner loop for print star
    //         for(int j=1;j<=i;j++)
    //         {
    //             System.err.print(" *");
    //         }
    //         System.err.println();
    //     }

    //     // inverse diamond
    //     // outer loop
    //     for(int i =1;i<=n;i++)
    //     {
    //         // inner loop for space
    //         for(int j=1;j<=i;j++)
    //         {
    //             System.err.print(" ");
    //         }
    //         // inner inverse loop for print star
    //         for(int j=1;j<=n-i;j++)
    //         {
    //             System.err.print(" *");
    //         }
    //         System.err.println();
    //     }

    // }


    public static void Is_Diamond_Pattern(int n){
        // outer loop
        for(int i=1;i<=n;i++)
        {
            // inner loop
            for(int j=1;j<=n-i;j++)
            {
                System.err.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++)
            {
                System.err.print("*");
            }
            System.err.println();
        }

        // inverse outer loop
        for(int i=n;i>=1;i--)
        {
            // inner loop
            for(int j=1;j<=(n-i);j++)
            {
                System.err.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++)
            {
                System.err.print("*");
            }
            System.err.println();
        }
    }


    public static void Is_turn_Box(int n )
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.err.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                if(j==1|| j==n|| i==1|| i==n)
                {
                    System.err.print("*");
                }
                else{
                    System.err.print(" ");
                }
            }
            System.err.println();
    }
    
    }

    


    public static void main(String[]args)
    {
        // hollow_pattern(4, 5);

        // Inverted_pattern(5);

        // Inverted_pattern_Rotated(4);

        // Is_even_odd_triangle(5);


        // IsButterFly_Pattern(8);


        // Is_pattern(8);

        // Is_Diamond_Pattern(3);

        // Is_turn_Box(4 );
    }

}
