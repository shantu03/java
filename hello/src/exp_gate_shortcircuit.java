public class exp_gate_shortcircuit {
    public static void main(String[] args) {
        int x=11;

        if((x--==0)||k())
        {
            System.out.println(x);
        }
    }
    public static boolean k()
    {
        return true;
    }
}
