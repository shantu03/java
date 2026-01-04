
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class tic_tac_toe {

    public static void main(String[] args) {


        int [][] board=new int[3][3];

        boolean [] place=new boolean[9];
        int[] prio=new int[9];

        List<List<Integer>> pairs=new ArrayList<>();
        pairs.add(new ArrayList<>(Arrays.asList(1,2,3)));
        pairs.add(new ArrayList<>(Arrays.asList(4,5,6)));
        pairs.add(new ArrayList<>(Arrays.asList(7,8,9)));

        pairs.add(new ArrayList<>(Arrays.asList(1,4,7)));
        pairs.add(new ArrayList<>(Arrays.asList(2,5,8)));
        pairs.add(new ArrayList<>(Arrays.asList(3,6,9)));

        
        pairs.add(new ArrayList<>(Arrays.asList(1,5,9)));
        pairs.add(new ArrayList<>(Arrays.asList(3,5,7)));


        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(gameon(place)){
            int move=0;
            do{

                System.out.println("enter move ");
                 move=Integer.parseInt(br.readLine()+"");
            }while(!place[move-1]);
            
            place[move-1]=true;

            //now increment && check max   I THINK HERE IT MAY WRONG 
            
            int max=-1;
            for (List<Integer> list : pairs) {
                for (int p : list) {
                    if(!place[p-1]){
                        prio[p-1]++;
                        max=prio[max]>prio[p-1]?max:(p-1);
                    }
                }
            }

        }
    }
    public static boolean checkvalidmove(int move,boolean place[]){

    }
    public static boolean gameon(boolean [] place){
        for (boolean b : place) {
            if(b==false) return true;
        }
        return false;
    }
}
