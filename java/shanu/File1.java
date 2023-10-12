import java.io.*;
import java.util.ArrayList;
public class File1
{     public static void main(String argd[])	{
		
		try{
            FileInputStream r=new FileInputStream("temp1.txt");
            FileInputStream r2=new FileInputStream("temp2.txt");
            FileOutputStream file=new FileOutputStream("temp.txt");

            int i;
            ArrayList<Integer> arr=new ArrayList<>();

            while((i=r.read())!=-1)
            {
                
                 System.out.print((char)i);
                
                file.write(i);
                // System.lineSeparator();
            }
            while((i=r2.read())!=-1)
            {
                
                System.out.print((char)i);
                
                file.write(i);
                
            }
            System.out.println(arr);
            r.close();
            r2.close();
            file.close();

		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}