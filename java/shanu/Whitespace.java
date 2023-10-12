import java.io.*;
import java.util.Scanner;
public class Whitespace {
    public static void main(String[] args){
        try{
            String filepath =args[0];
            File file=new File (filepath);
            String sb="";
            Scanner sc=new Scanner(file);
            while(sc.hasNextLine())
            {
                String temp=sc.nextLine();
                sb+=temp.replaceAll("\\s","9");
                sb=sb+System.lineSeparator();
            }
            FileWriter w=new FileWriter("E:/Code/java/shanu/temp.txt");
            w.write(sb.toString());
            sc.close();
            w.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}