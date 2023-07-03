import java.util.ArrayList;
import java.util.List;

public class day_2_Find_All_Duplicates_in_an_Array {
    public static void main(String[] args) {
    int[] nums={4,3,2,7,8,2,3,1};
        System.out.println(solution(nums));
    }

    public static List<Integer> solution(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            int index = Math.abs(nums[i])-1;
            if (nums[index] < 0)
                res.add(Math.abs(index+1));
            nums[index] = -nums[index];
        }
        return res;
    }
}
