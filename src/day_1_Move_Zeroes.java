public class day_1_Move_Zeroes {
    public static void main(String[] args) {
//        nums = {0,1,0,3,12}
//        nums={1,3,12,0,0}
        int[] nums={0,1,0,3,12};
        solution(nums);
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }

    }
    public static void solution(int[] nums)
    {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++){
            if(nums[i] != 0){
                nums[count++] = nums[i];
            }
        }
        for (int j = count; j < n; j++){
            nums[j] = 0;
        }
    }
}
