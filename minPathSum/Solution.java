package Leetcode.minPathSum;

public class Solution {
    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        if (m<=0) return 0;
        int n = grid[0].length;
        int[][] dp = new int[m][n];

        for (int i = 0;i<m;i++){
            for (int j = 0;j<n;j++){
                if (i==0&&j==0){
                    dp[i][j] = grid[i][j];
                }else if (i==0){
                    dp[i][j] =dp[i][j-1]+grid[i][j];
                }else if (j==0){
                    dp[i][j] =dp[i-1][j]+grid[i][j];
                }else{
                dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j];
                }
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        int[][] a = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(a));

    }
}
