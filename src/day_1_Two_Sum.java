import java.util.HashMap;
import java.util.Map;

public class day_1_Two_Sum {
    public static void main(String[] args) {
    int[] nums = {2,7,11,15};
    int target = 9;
        int[] ans=solution(nums,target);
        System.out.println(ans[0]+" "+ans[1]);
    }

    public static int[] solution(int[] nums, int target) {
            int n=nums.length;
            Map<Integer,Integer> map=new HashMap<>();
            int[] result=new int[2];
            for(int i=0;i<n;i++){
                if(map.containsKey(target-nums[i])){
                    result[1]=i;
                    result[0]=map.get(target-nums[i]);
                    return result;
                }
                map.put(nums[i],i);
            }
            return result;
        }


}
