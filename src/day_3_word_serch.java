public class day_3_word_serch {
    public static void main(String[] args) {
        String check="ASFC";
        char[] chararry=check.toCharArray();
        char[][] board={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println(solution(board,chararry));

    }
    public static boolean solution(char[][] board , char[] check)
    {
        int y=board.length;
        int x=board[0].length;
        for(int i=0;i<y;i++)
        {
            for(int j=0;j<x;j++)
            {
                if(exit(board,check,i,j,0))return true;
            }
        }
        return false;
    }
    public static boolean exit(char[][] board, char[] word , int y, int x , int j)
    {
        if(j==word.length)return true;
        if(y==board.length || x==board[0].length || y<0 || x<0)return false;
        if(board[y][x]!=word[j])return false;
        board[y][x]^=256;
        return exit(board , word, y+1,x,j+1)||exit(board,word,y-1,x,j+1)||exit(board,word,y,x+1,j+1)||exit(board,word,y,x-1,j+1);

    }

}
