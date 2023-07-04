public class day_3_Jump_Game {
    public static void main(String[] args) {
    int[] nums={2,3,1,1,4};
        System.out.println(solution(nums));
    }
    public static boolean solution(int[] nums)
    {
        int reach=0;
        for(int i=0;i<nums.length;i++)
        {
            if(reach<i)
                return false;
            reach=Math.max(reach,i+nums[i]);
        }
        return true;
    }
}
