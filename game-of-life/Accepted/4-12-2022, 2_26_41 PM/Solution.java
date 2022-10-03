// https://leetcode.com/problems/game-of-life

public class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length, n = board[0].length;
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int countLive = 0;
                for (int p = Math.max(i-1,0); p < Math.min(i+2,m); p++) {
                    for (int q = Math.max(j-1,0); q < Math.min(j+2,n); q++) {
                        if (board[p][q]==2||board[p][q]==1) countLive++;
                    }
                }
                countLive -= board[i][j];
                if (board[i][j] == 0 && countLive == 3) board[i][j] = 3;
                if (board[i][j] == 1 && (countLive < 2 || countLive > 3)) board[i][j] = 2; 
                
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] %= 2;
            }
        }
    }
}
/*class Solution {
    public void gameOfLife(int[][] board) {
        int b[][] = board.clone();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                int l=0,z=0;
                if((i-1)>=0){
                        if(b[i-1][j]==1)    l++;
                        else    z++;
                        if((j-1)>=0){
                            if(b[i-1][j-1]==1)  l++;
                            else    z++;
                        }
                        if((j+1)<b[i].length){
                            if(b[i-1][j+1]==1)  l++;
                            else    z++;
                        }
                    }
                    if((i+1)<b.length){
                        if(b[i+1][j]==1)    l++;
                        else    z++;
                        if((j-1)>=0){
                            if(b[i+1][j-1]==1)  l++;
                            else    z++;
                        }
                        if((j+1)<b[i].length){
                            if(b[i+1][j+1]==1)  l++;
                            else    z++;
                        }
                    }
                    if((j-1)>=0){
                        if(b[i][j-1]==1)    l++;
                        else z++;
                    }
                    if((j+1)<b[i].length){
                        if(b[i][j+1]==1)    l++;
                        else    z++;
                    }
                if(board[i][j]==1){
                    if(l<2){
                        board[i][j]=0;
                    }
                    else if(l>3){
                        board[i][j]=0;
                    }
                }
                else{
                    if(l==3){
                        board[i][j]=1;
                    }
                }
                System.out.println(l+"  "+z);
            }
        }
    }
        findsol(board,0,0);
    }
    public void findsol(int[][] board,int i,int j){
        if(i<0 || j>=board.length || i>=board.length || j<0)    return;
        if(board[i][j]==1){
            
        }
        findsol(board,i+1,j);
        findsol(board,i-1,j);
        findsol(board,i,j+1);
        findsol(board,i,j-1);
        findsol(board,i+1,j+1);
        findsol(board,i+1,j-1);
        findsol(board,i-1,j+1);
        findsol(board,i-1,j-1);
    }
}
*/