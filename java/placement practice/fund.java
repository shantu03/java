import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;

import java.time.LocalDate;

public class fund{
public static void main(String args[]){
try{
File fund=new File("fund.txt");
FileReader fr=new FileReader(fund);

LocalDate date=LocalDate.now();


int i;
String data="";
while((i=fr.read())!=-1)
{
data+=(char)i;
}
System.out.println("enter name and amount or exit ");
String newData="Date: \t"+date.toString()+"\nName\t\t\tAmount\n";

String name="";
float amount=0;
float sum=0;
while(true)
{
name=new Scanner(System.in).nextLine();
if(name.equals("exit"))
	break;
try{
amount=new Scanner(System.in).nextFloat();
sum+=amount;
}catch(InputMismatchException e)
{
System.out.println();
}

newData +=name+"\t\t\t"+amount+"\n";
}
newData+="\n total\t\t\t"+sum+"\n\n==============================================================\n\n";


data+="\n"+newData;

FileWriter fw=new FileWriter("fund.txt");
fw.write(data);
fw.close();
fr.close();


System.out.println(data);

}catch(FileNotFoundException e)
{
System.out.println("not found ");
}
catch(IOException e)
{
System.out.println("io exception");
}	
	
}
}