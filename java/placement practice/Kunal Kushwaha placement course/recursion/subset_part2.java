// permuation, 

import java.util.ArrayList;
import java.util.List;

public class subset_part2 {
    public static void main(String[] args) {
        

        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());

        int arr[]={1,2,3};

        for (int num : arr) {
            int n=outer.size();

            

            for (int i = 0; i < n; i++) {
                List<Integer> inner=outer.getFirst();

                int k=inner.size();

                for (int j = 0; j < inner.size()+1; j++) {
                    List<Integer> in =new ArrayList<>(inner);
                    in.add(i, num);
                    outer.removeFirst();
                    outer.add(in);
                }
            
        }

        for (var i : outer) {
            System.out.println(i);
            
        }
    }
}
}
