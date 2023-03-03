package BackTracking;

public class RatInMazeAllPaths {
    public static void main(String[] args) {
//        int[][] x= new int[2][2];
//        x[0][0]=1;
//        x[0][1]=1;
//        x[1][0]=1;
//        x[1][1]=1;

        // System.out.println(x[1][1]);
        int[][] x={{1,0,1},{1,1,1},{1,1,1}};
        ratInAMaze(x,3);
    }

    public static void ratInAMaze(int maze[][], int n) {
        int[][] path = new int[n][n];
        solveMaze(maze,path,0,0);
    }

    private static void solveMaze(int maze[][] , int path[][], int i,int j){
        if(i<0 || i>=maze.length || j<0 || j>=maze.length || maze[i][j]==0 || path[i][j]==1){
            return;
        }

        path[i][j]=1;

        if(i==maze.length-1 && j==maze.length-1){
            for(int r=0;r<path.length;r++){
                for(int c=0;c<path.length;c++){
                    System.out.print(path[r][c]+" ");
                }
            }
            System.out.println("");
            path[i][j]=0;
            return;
        }
        // Top
        solveMaze(maze,path,i-1,j);
        // Down
        solveMaze(maze,path,i+1,j);
        // Left
        solveMaze(maze,path,i,j-1);
        // Right
        solveMaze(maze,path,i,j+1);

        path[i][j]=0;
        return;
    }
}
