import java.util.ArrayList;
import java.util.List;

public class _17_letter_combination_of_phone_number {
    public static void main(String[] args) {

        String arr[]={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        System.out.println(per("", "325",arr));




        problem2("", 4);
    }0000
    static List<String> per(String processed,String unprocessed,String[] arr)    
    {
        List<String> outer=new ArrayList<>();
        if(unprocessed.isEmpty())
         {
            outer.add(processed);
            return outer;
        }
        
        int n=unprocessed.charAt(0)-48;
        for (int i = 0; i < arr[n-2].length(); i++) {
            char k=arr[n-2].charAt(i);
            List<String> inner=per(processed+k,unprocessed.substring(1),arr);
            outer.addAll(inner);
        }

        return outer;

    }

    static void problem2(String up,int target){

        if(target==0)
        {
            System.out.println(up);
        }

        for(int i=1;i<=6 && i<=target;i++)
        {
            problem2(up+i, target-i);
        }

    }
}