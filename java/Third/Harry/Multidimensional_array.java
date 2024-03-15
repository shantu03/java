package Harry;

public class Multidimensional_array {
    public static void main(String[] args) {
//        page 22;
        int [][] arr=new int[5][5];
        int p=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<5;j++,p++)
            {
                if(j-i==2)
                {
                    arr[i][j]='~';
                }
                else {
                arr[i][j]='A'+p;}
            }
        }
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j=j+1)
            {
                if(j-i==2)
                {
                    System.out.println(arr[i][j]);
                }
                else {
                System.out.println((char)arr[i][j]);}

            }
        }
    }
}
