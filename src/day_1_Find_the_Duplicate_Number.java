public class day_1_Find_the_Duplicate_Number {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
//        output - 2
        System.out.println(solution(nums));
    }
    public static int solution(int[] nums)
    {
        if (nums.length > 1)
        {
            int slow = nums[0];
            int fast = nums[nums[0]];
            while (slow != fast)
            {
                slow = nums[slow];
                fast = nums[nums[fast]];
            }

            fast = 0;
            while (fast != slow)
            {
                fast = nums[fast];
                slow = nums[slow];
            }
            return slow;
        }
        return -1;
    }
}
