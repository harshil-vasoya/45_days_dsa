public class day_2_Container_With_Most_Water {
    public static void main(String[] args) {
    int[] heigth={1,8,6,2,5,4,8,3,7};
        System.out.println(solutiom(heigth));
    }
    public static int solutiom(int[] height)
    {
        int max=Integer.MIN_VALUE;
        int left=0;
        int right=height.length - 1;
        while(left<right)
        {
            int minline = Math.min(height[left], height[right]);
            max=Math.max(max,minline*(right-left));
            if(height[left]<height[right])
            {
                left++;
            }
            else
            {
                right--;
            }

        }
        return max;
    }
}
