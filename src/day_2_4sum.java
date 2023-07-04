import java.util.*;

public class day_2_4sum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,3,4,5,6,7,8};
        System.out.println(solution(nums,14));
    }
    public static List<List<Integer>> solution(int[] nums , int target) {

            HashSet<List<Integer>> ans = new HashSet<>();
            Arrays.sort(nums);
            for(int i = 0;i<nums.length;i++){
                for(int j = i+1;j<nums.length-1;j++){
                    int k = j+1;
                    int l = nums.length-1;
                    long sum = nums[i]+nums[j];
                    while(k<l){
                        if(sum+(long)nums[k]+(long)nums[l]==target){
                            List<Integer> res = new ArrayList<>();
                            res.add(nums[i]);
                            res.add(nums[j]);
                            res.add(nums[k]);
                            res.add(nums[l]);
                            ans.add(res);
                            k++;

                        } else if(sum+nums[k]+nums[l]<target){
                            k++;
                        } else{
                            l--;
                        }
                    }
                }
            }
            return new ArrayList<>(ans);
        }

}
//[[1, 2, 3, 8], [1, 3, 3, 7], [2, 3, 3, 6], [1, 2, 4, 7], [1, 3, 4, 6], [2, 3, 4, 5], [1, 2, 5, 6]]