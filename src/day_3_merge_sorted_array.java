public class day_3_merge_sorted_array {
    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int m=3;
        int[] nums2={2,5,6};
        int n=3;
    solution(nums1,nums2,m,n);
    for(int i=0;i<nums1.length;i++)
    {
        System.out.println(nums1[i]);
    }
    }
    public static void solution(int[] nums1 , int[] nums2 , int m , int n)
    {
        int i = m - 1, j = n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[i + j + 1] = nums1[i];
                i--;
            } else {
                nums1[i + j + 1] = nums2[j];
                j--;
            }
        }
        while(j>=0) {
            nums1[j] = nums2[j];
            j--;
        }
    }
}
