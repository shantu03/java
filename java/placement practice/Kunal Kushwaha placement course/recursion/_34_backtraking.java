import java.util.ArrayList;
import java.util.List;

public class _34_backtraking {
    static int n=3;
    static int arr[][]=new int[n][4];
    static List<String> res=new ArrayList<>();
    public static void main(String[] args) {
        
        bac("",n, n);
        System.out.println(res);
        System.out.println(res.size());
        
    }
    static void  bac(String solu, int a,int b) //ONLY DOWN AND RIGHT 
    {
        if(a==1 && b==1) {
            res.add(solu);
            return ;
        }

        if(b>1 && a>1){
            bac(solu+"d",a-1,b-1);
        }
        if(b>1){
            bac(solu+"R",a, b-1);
            
        }
        if(a>1){
            bac(solu+"D",a-1, b);
            
        }

        
    }
    
}
