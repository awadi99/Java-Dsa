public class Trapping_Rain_Water {

    // public static int isTrapping_Rain_Water(int height[]){
    // int n=height.length;
    // int leftmax[]=new int[n];
    // leftmax[0]=height[0];
    // for(int i=1;i<n;i++)
    // {
    // leftmax[i]=Math.max(height[i], leftmax[i-1]);
    // }
    // int rightmax[]=new int[n];
    // rightmax[n-1]=height[n-1];
    // for(int i=n-2;i>=0;i--)
    // {
    // rightmax[i]=Math.max(height[i],rightmax[i+1]);
    // }
    // int trapping_Water =0;
    // for(int i=0;i<n;i++)
    // {
    // int waterlevel=Math.min(leftmax[i],rightmax[i]);
    // trapping_Water+=(waterlevel-height[i])*1;
    // }
    // return trapping_Water;
    // }

    // public static int isTrapping_Rain_Water(int height[])
    // {
    // int n =height.length;

    // int leftmax[] =new int [n];
    // leftmax[0]=height[0];
    // for(int i=1;i<n;i++)
    // {
    // leftmax[i]=Math.max(height[i],leftmax[i-1]);
    // }

    // int rightmax[]=new int [n];

    // rightmax[n-1]=height[n-1];
    // for(int i=n-2;i>=0;i--)
    // {
    // rightmax[i]=Math.max(height[i],rightmax[i+1]);
    // }

    // int trapping_Water=0;
    // for(int i=0;i<n;i++)
    // {
    // int waterlevel=Math.min(leftmax[i],rightmax[i]);
    // trapping_Water+=waterlevel-height[i]*1;
    // }
    // return trapping_Water;
    // }

    // public static int isTrapping_Rain_Water(int height[])
    // {
    // int n =height.length;

    // int leftmax[]= new int[n];
    // leftmax[0]=height[0];
    // for(int i=1;i<n;i++)
    // {
    // leftmax[i]=Math.max(leftmax[i-1],height[i]);
    // }
    // int rightmax[]= new int[n];
    // rightmax[n-1]=height[n-1];
    // for(int i= n-2;i>=0;i--)
    // {
    // rightmax[i]=Math.max(rightmax[i+1],height[i]);
    // }

    // int trapping_Water =0;
    // for(int i=0;i<n;i++)
    // {
    // int waterlevel=Math.min(rightmax[i],leftmax[i]);
    // trapping_Water += waterlevel-height[i];
    // }
    // return trapping_Water;
    // }

    public static int isTrapping_Rain_Water(int heigth[]) {
        int n = heigth.length;
        int leftmax[] = new int[n];
        leftmax[0] = heigth[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(heigth[i], leftmax[i - 1]);
        }

        int rightmax[] = new int[n];
        rightmax[n - 1] = heigth[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(heigth[i], rightmax[i + 1]);
        }

        int trapping_Water = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);

            trapping_Water += (waterlevel - heigth[i]) * 1;
        }
        return trapping_Water;
    }

    public static void main(String[] args) {
        int num[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.err.println("Trapping water is a = " + isTrapping_Rain_Water(num));
    }
}
