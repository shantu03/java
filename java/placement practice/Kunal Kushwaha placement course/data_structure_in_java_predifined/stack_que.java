package data_structure_in_java_predifined;
import java.util.ArrayDeque;
public class stack_que {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }

    public static boolean isValid(String s) {
        ArrayDeque<Character> stack=new ArrayDeque<Character>();
        for(int i=0;i<s.length();i++)
        {
            char k=s.charAt(i);
         if(k=='(' || k=='{' || k=='[')  
         stack.push(k);
         else {
            try{
            if(k==')' && (char)stack.pop()!='('){
                continue; 
                return false;
            }
            else if(k==']' && (char)stack.pop()!='[') return false;
            else {
                if((char)stack.pop()!='{') return false;
            }
            }catch(Exception e) {
                return false;
            }
         }
        }
        return true;
    }
}
