public class splitting { 
    public static void main(String[] args) {


        String s="abcaabcca";
        String part="abc";
        while(s.contains(part))
        {
            s=s.replaceFirst(part,"");
        }

        System.out.println(s);
    }
    
}
