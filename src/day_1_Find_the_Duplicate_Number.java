public class day_1_Find_the_Duplicate_Number {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
//        output - 2
        System.out.println(solution(nums));
    }
    public static int solution(int[] nums)
    {
         for(int i=0;i<nums.length-1;i++)
         {
             int temp=nums[i];
             for(int j=i+1;j<nums.length;j++)
             {
                 int temp2=temp^nums[j];
                 if(temp2==0)
                 return nums[j];
             }
         }
         return -1;
    }
}
