package TT2.BackTracking;

public class Rat_Maze_Path {
     final int N=5
             ;
     public boolean printMazePath(int[][] maze){
         int[][] sol=new int[N][N];
         if(!printMazePathUntil(maze,0,0,sol)){
             System.out.println("Rat can't reaches the end ");
             return false;
         }
         printPath(sol);
         return true;
     }

     private boolean printMazePathUntil(int[][] maze,int x,int y,int[][] sol){
         if(x==N-1 && y==N-1 && maze[x][y]==1 ){
             sol[x][y]=1;
             return true;
         }
         if(isSafe(maze,x,y)){
             sol[x][y]=1;

             if(printMazePathUntil(maze,x+1,y,sol)){
                 return true;
             }
             if(printMazePathUntil(maze,x,y+1,sol)){
                 return true;
             }
//             if(printMazePathUntil(maze,x,y-1,sol)){
//                 return true;
//             }
             sol[x][y]=0;
         }
         return false;
     }
    private boolean isSafe(int[][] maze,int x, int y){
         if(x>=0 && x<N && y>=0 && y<N && maze[x][y]==1){
             return true;
         }
         return false;
    }

    private void printPath(int[][] mat){
         for(int i=0;i<N;i++){
             for(int j=0;j<N;j++){
                 System.out.print(mat[i][j]+" ");
             }
             System.out.println();
         }
    }

    public static void main(String[] args) {
        Rat_Maze_Path rat=new Rat_Maze_Path();
        int maze[][]={{ 1, 1, 0, 1, 1 },
                      { 0, 1, 0, 1, 0 },
                      { 0, 1, 1, 1, 1 },
                      { 1, 0, 0, 0, 1 },
                      { 1, 0, 1, 1, 1 } };
        rat.printMazePath(maze);
    }


}
