import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class rat_in_the_maze {
   static  List<String> res=new ArrayList<>();

    // static int maze[][] = {{1, 0, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1}};
    static int maze[][] = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
    // static int maze[][]=new int[2][2];

    // static int maze[][]=new int[3][3];
    public static void main(String[] args) {
            long k=System.nanoTime();

        // bac("", 0, 0);
        var visit=new boolean[maze.length][maze[0].length];
        alldirection("", 0, 0, visit);



        System.out.println(res);


        System.out.println((float)(System.nanoTime()-k)/1000000);
    }
    static void  bac(String solu, int a,int b)
    {
        
        if(a==maze.length-1 && b==maze[0].length-1) {
            res.add(solu);
            return ;
        }

        // if(b<maze[0].length-1 && a<maze.length-1 &&maze[a][b]==1){
        //     bac(solu+"d",a+1,b+1);
        // }
        if(b<maze[0].length-1 && maze[a][b+1]==1){
            bac(solu+"R",a, b+1);
            
        }
        if(a<maze.length-1&& maze[a+1][b]==1){
            bac(solu+"D",a+1, b);
            
        }
    }    


    static void alldirection(String solu,int a,int b,boolean[][] visited){
        visited[a][b]=!visited[a][b];


if(visited[a][b]==false||maze[a][b]==0) {
    visited[a][b]=!visited[a][b];
    return;
}        
if(a==maze.length-1 && b==maze[0].length-1) {
           visited[a][b]=!visited[a][b];
            res.add(solu);
            return ;
        }


        if(b<maze[0].length-1){
            alldirection(solu+"R",a, b+1,visited);
            
            
        }
        if(a<maze.length-1 ){
            alldirection(solu+"D",a+1, b,visited);
            
        }
        if(a>0 )
        {
            alldirection(solu+"U", a-1, b, visited);
        }
        
        if(b>0 ){
            alldirection(solu+"L", a, b-1, visited);
        }

        visited[a][b]=!visited[a][b];

    }
}
