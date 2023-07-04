public class day_3_majority_element {
    public static void main(String[] args) {
        int[] nums={2,2,1,1,1,2,2,3,3};
        System.out.println(solution(nums));
    }
    public static int solution(int[] nums)
    {
        int counter=0, ele=0;
        for(int i=0;i<nums.length;i++){
            if(counter==0){ele=nums[i];
                counter++; }
            else if(ele==nums[i]) {
                counter++;
            }
            else counter--;
        }return ele;
    }
}
