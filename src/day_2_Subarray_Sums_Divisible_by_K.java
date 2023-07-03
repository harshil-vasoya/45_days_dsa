public class day_2_Subarray_Sums_Divisible_by_K {
    public static void main(String[] args) {
        int[] nums={4,5,0,-2,-3,1,2};
        int k=5;
        System.out.println(solution(nums,k));
    }
    public static int solution(int[] A , int K)
    {
        int[] modGroups = new int[K];
        int sum = 0;
        for (int a:A){
            sum += a;
            int group = sum % K;

            if (group < 0) group += K;
            modGroups[group]++;
        }

        int total = modGroups[0];
        for (int x : modGroups){
            System.out.println(x);
            if (x > 1) total += (x*(x-1)) / 2;
        }

        return total  ;
    }
}
