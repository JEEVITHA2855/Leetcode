public class Solution {
    public int islandPerimeter(int[][] grid) {
        int p=0;

        for (int i=0;i<grid.length;i++) {
            for (int j=0;j<grid[i].length;j++) {
                if (grid[i][j] == 1) {
                    p+=4;
                    
                    if (i>0 && grid[i-1][j]==1) p-=2; 
                    if (j>0 && grid[i][j-1]==1) p-=2; 
                }}}

        return p;
    }
}
