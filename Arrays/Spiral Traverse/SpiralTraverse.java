public class SpiralTraverse {
    public static int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int cnt = 1;
        int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
        int row = 0, col = 0, d = 0;
        while(cnt <= n*n){
            res[row][col] = cnt++;
            int r = Math.floorMod(row + dir[d][0], n);
            int c = Math.floorMod(col + dir[d][1], n);
            if(res[r][c] != 0)
                d=(d+1)%4;
            row += dir[d][0];
            col += dir[d][1];
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 3;
        int[][] res = generateMatrix(n);
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}