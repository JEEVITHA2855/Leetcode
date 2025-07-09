class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length==0) return 0;
        int x=0;
        int r=grid.length;
        int c=grid[0].length;
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if (grid[i][j]=='1'){
                    
                    island(grid,i,j);
                    x++;
                }
            }
        }
        return x;
    }
    public static void island(char[][] grid, int i,int j){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]=='0')
        {
            return;
        }
        grid[i][j]='0';
        island(grid,i+1,j);
        island(grid,i-1,j);
        island(grid,i,j+1);
        island(grid,i,j-1);
    }
}