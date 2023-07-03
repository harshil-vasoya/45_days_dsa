import java.util.*;

public class day_2_3Sum {
    public static void main(String[] args) {
    int[] a={-1,0,1,2,-1,-4};
        System.out.println(solution(a));
    }
    public static List<List<Integer>> solution(int[] a) {
        Set<List<Integer>> ans  = new HashSet<>();
        if(a.length==0) return new ArrayList<>(ans);
        Arrays.sort(a);
        for(int i=0; i<a.length-2;i++){
            int j =i+1;
            int  k = a.length-1;
            while(j<k){
                int sum = a[i]+a[j]+a[k];
                if(sum==0)ans.add(Arrays.asList(a[i],a[j++],a[k--]));
                else if (sum >0) k--;
                else if (sum<0) j++;
            }

        }
        return new ArrayList<>(ans);
    }
}
