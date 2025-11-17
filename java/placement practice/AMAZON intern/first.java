import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class first {public static void main(String[] args) {

    List<Integer> list=new ArrayList<>();
    list.addAll(Arrays.asList(1,3,1,5));

    

    System.out.println(new first().findmin(list));
}

    int findmin(List<Integer> centers)
    {
        int count=0;
        while (!centers.isEmpty()) {
            int x=findxnoty(centers);
            System.out.println(x);
            System.out.println(centers);
            if(x==-1 || centers.size()==1){
                centers.remove(0);
                count++;
            }else{
                centers.remove(x);
                centers.remove(x);
                count++;
            }
            
        }

        return count;


        
    }
     int findxnoty(List<Integer> centers)
    {
 int x=0;
        while (x<centers.size()-1) {
            if(centers.get(x)!=centers.get(x+1))   return x;

            x++;
        }
    return -1;
}

    
}
