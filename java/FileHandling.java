import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileHandling{
public static void main(String[] args) throws IOException
{
//CREATING 
File newfile=new File("temp.txt");
newfile.createNewFile();


//WRITING
/*FileWriter fwrite=new FileWriter(""E:\Code");
fwrite.write("this is this and that is that");
fwrite.close();*/

//READING
Scanner sc=new Scanner(newfile);
while(sc.hasNext ())
{
String line=sc.nextLine();
System.out.println(line);
}
sc.close();

//DELETING 
System.out.println("ENter 1 to delete file");
int k=new java.util.Scanner(System.in).nextInt();
if(k==1)
{

if(newfile.delete())
{
System.out.println(newfile.getName() + " has deleted successfully");

}
else{
System.out.println("error occured bro ");
}
}
System.out.println("END OF THE PROGRAM ");

}
}