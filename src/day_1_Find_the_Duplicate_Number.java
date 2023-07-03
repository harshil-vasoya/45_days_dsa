public class day_1_Find_the_Duplicate_Number {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
//        output - 2
        System.out.println(solution(nums));
    }
    public static int solution(int[] nums)
    {
//         for(int i=0;i<nums.length-1;i++)
//         {
//             int temp=nums[i];
//             for(int j=i+1;j<nums.length;j++)
//             {
//                 int temp2=temp^nums[j];
//                 if(temp2==0)
//                 return nums[j];
//             }
//         }
        int slow = 0;
        int fast = 0;
        int finder = 0;
//        int[] nums = {1,3,4,2,2};

        while (true)
        {
            slow = nums[slow];
            System.out.print(slow + " ");
            fast = nums[nums[fast]];
            System.out.print(fast);


            if (slow == fast)
                break;
            System.out.println();
        }
         return -1;
    }
}
