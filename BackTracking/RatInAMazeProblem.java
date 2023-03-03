package BackTracking;

public class RatInAMazeProblem {
    public static void main(String[] args) {
        int[][] x= new int[2][2];
        x[0][0]=1;
        x[0][1]=2;
        x[1][0]=3;
        x[1][1]=4;
        ratInAMaze(x);
    }
    public static boolean ratInAMaze(int maze[][]){
        int[][] path= new int[maze.length][maze.length];
        if(maze.length==0){
            return false;
        }
        if(maze.length==1){
            return true;
        }
//        return ratInAMazeHelper(maze,path,0,0);
        boolean z= ratInAMazeHelper(maze,path,0,0);

//        Incase we want to print the first path that we find--->
//        if(z==true){
//            for(int i= 0;i< maze.length;i++){
//                for(int j=0;j< maze.length;j++){
//                    System.out.print(path[i][j]);
//                }
//                System.out.println("");
//            }
//        }

        return z;
    }


    private static boolean ratInAMazeHelper(int maze[][], int path[][],int i,int j){

        if(i<0 || j<0 || i>=maze.length || j>=maze.length){
            return false;
        }

        if(maze[i][j]==0 || path[i][j]==1){
            return false;
        }

        if(i==maze.length-1 && j==maze.length-1){
            path[i][j]=1;
            return true;
        }
        path[i][j]=1;

        boolean top= ratInAMazeHelper(maze,path,i-1,j);
        if(top==true){
            return true;
        }

        boolean right= ratInAMazeHelper(maze,path,i,j+1);
        if(right==true){
            return true;
        }

        boolean bottom= ratInAMazeHelper(maze,path,i+1,j);
        if(bottom==true){
            return true;
        }

        boolean left= ratInAMazeHelper(maze,path,i,j-1);
        if(left==true){
            return true;
        }
        return false;
    }

}
