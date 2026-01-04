

public class permutation {
    public static void main(String[] args) {
        
        per("","abc");
        
    }

    public static void per(String up, String ori)
    {
        if(ori.isEmpty()) {
            System.out.println(up);
            return;
        }
        for (int i = 0; i < ori.length(); i++) {

            String first=ori.substring(0,i);
            String last=ori.substring(i+1);

            per(up+ori.charAt(i),first+last);
            
        }
    }
}
