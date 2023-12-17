import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fun{
public static void main(String[] args)
{
try{
File file1=new File("C:/Users/Shantanu/Downloads/numbers.txt");
Scanner sc=new Scanner(file1);
String temp="";
while(sc.hasNextLine())
{
temp+=sc.nextLine();
}
//temp=temp.replaceAll(","," ");

FileWriter writer=new FileWriter(file1);
writer.write(temp.replaceAll(",",""));
writer.close();

	}catch(IOException e){
	System.out.println("file not found");	
}
}
}