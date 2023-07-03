public class day_2_Sort_Colors {
    public static void main(String[] args) {
        int[] nums={2,0,2,1,1,0};
        solution(nums);
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+ " ");
        }
    }
    public static void solution(int[] nums) {
        int low = 0, mid = 0, high = nums.length-1;

        while(mid <= high){
            if(nums[mid] == 0 ){
                swap(nums,low, mid );
                low++;
                mid++;
            }else if(nums[mid] == 2){
                swap(nums, mid, high);
                high--;
            }else{
                mid++;
            }
        }
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
