import java.util.*;
class longest_substring_without_repeating_char{
public static void main(String args[])
{
Set<Character> set=new HashSet<>();
String s="bbbbb";

int left=0;
int right=0;
int max=-1;
while(right<s.length())
{
        if(set.contains(s.charAt(right)))
        {
                max=Math.max(max,right-left);
                set.remove(s.charAt(left));
                left++;
        }else{
        set.add(s.charAt(right));
        right++;
        }
}
                max=Math.max(max,right-left);
System.out.println(max);
}
}