public class PrimeNum{
    public static void main(String [] args){
        
        
        for(int i=1;i<100;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++)
        {
            
            if(i%(double)j==0){
                count++;
            }
        }
        if(count<=2){
            System.out.printf("%d\t",i);
        }

        }
    }
}