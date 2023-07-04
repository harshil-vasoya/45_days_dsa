import java.util.ArrayList;
import java.util.List;

public class day_3_Spiral_Matrix {
    public static void main(String[] args) {
    int[][] matrix={
            {1,2,3},{4,5,6},{7,8,9}
    };
        System.out.println(solution(matrix));
    }
    public static List<Integer> solution(int[][] matrix)
    {
        List<Integer> ans=new ArrayList<>();
        int left=0;
        int top=0;
        int right=matrix[0].length-1;
        int bottom=matrix.length-1;
        while (true)
        {
            for (int i=left;i<=right;i++)ans.add(matrix[top][i]);
            top++;
            if(top>bottom || left>right)break;
            for(int i=top;i<=bottom;i++)ans.add(matrix[i][right]);
            right--;
            if(top>bottom || left>right)break;
            for (int i=right;i>=left;i--)ans.add(matrix[bottom][i]);
            bottom--;
            if(top>bottom || left>right)break;
            for(int i=bottom;i>=top;i--)ans.add(matrix[i][left]);
            left++;
            if(top>bottom || left>right)break;

        }
        return ans;

    }
}
