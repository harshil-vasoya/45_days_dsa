import java.util.ArrayList;
import java.util.List;

public class day_3_merge_short {
    public static void main(String[] args) {
        int[] nums={10,2,39,8,5,23,1,-1,3};
        mergersort(nums,0,nums.length-1);
        for(int i=0;i< nums.length;i++)
        {
            System.out.print(nums[i]+ " ");
        }

    }
    public static void mergersort(int[] nums,int low, int high)
    {
        if(low>=high)return;
        int mid=(high+low)/2;
        mergersort(nums,low,mid);
        mergersort(nums,mid+1,high);
        merger(nums,low,mid,high);
    }
    public static void merger(int[] nums,int low,int mid, int high)
    {
        List<Integer> temp=new ArrayList<>();
        int leftarryi=low;
        int rightarryi=mid+1;
        while(leftarryi<=mid && rightarryi<=high)
        {
            if(nums[leftarryi]<=nums[rightarryi])
            {
                temp.add(nums[leftarryi++]);
            }
            else
            {
                temp.add(nums[rightarryi++]);
            }
        }
        while (leftarryi<=mid)
        {
            temp.add(nums[leftarryi++]);
        }
        while (rightarryi<=high)
        {
            temp.add(nums[rightarryi++]);
        }
        for (int i = low; i <= high; i++) {
            nums[i] = temp.get(i - low);
        }
    }
}
