import java.util.ArrayList;
import java.util.List;

public class day_3_reverse_pairs {
    public static void main(String[] args) {
       int[] nums = {1,3,2,3,1};
        System.out.println(mergersort(nums,0,nums.length-1));

    }
    public static int mergersort(int[] nums,int low, int high)
    {
        int count=0;
        if(low>=high)return count;
        int mid=(high+low)/2;
        count+= mergersort(nums,low,mid);
        count+=mergersort(nums,mid+1,high);

        count+=count(nums,low,mid,high);

        merger(nums,low,mid,high);
        return count;
    }
    public static int count(int[] nums,int low, int mid, int high)
    {
        int lefta=low;
        int count=0;

        int righta=mid+1;
        for(int i=lefta;i<=mid;i++)
        {
            while (righta<=high && nums[i]>2*nums[righta])righta++;
            count+=(righta-(mid+1));

        }
        return count;
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
