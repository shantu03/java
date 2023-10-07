import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

interface que4 {
    void ques4();
}
public class PracticeSetAdvancedJAVA {
    public static void main(String[] args) throws IOException{

  //      que2();
        que4 que4=new que4() {
            @Override
            public void ques4() {
                System.out.println("question no. 4");
            }
        };
  //      que4.ques4();

  
  //        que5();

		que6();
   
    }

	public static void que6() throws IOException{

	
	File creating =new File("E:/Code/java//que6");

	creating.mkdir();
	String file=creating.getAbsolutePath();
String table[] ={"TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};

for(int i=0;i<table.length;i++)
{
int num=i+2;

table[i]+=".txt";
File myfile=new File(file,table[i]);

myfile.createNewFile();

FileWriter writer=new FileWriter(myfile);
String temp ="";



//System.out.println(num);
for(int j=1;j<11;j++)
{

temp+=num+" x "+j+" = "+(num*j)+"\n";
}
writer.write(temp);
writer.close();
}

}






    public static void que5() throws IOException{

        File newfile=new File("temp.txt");
        newfile.createNewFile();

      //  System.out.println("Enter num ");
     //   int num=new Scanner(System.in).nextByte();

        FileWriter writefile =new FileWriter(newfile);
        
	
for(int num=2;num<31;num++)
{
String temp = "";
        for(int i=1;i<=10;i++)
        {
        temp += num+" x "+i+" = "+(i*num)+"\n";

        }
temp+="\n\n";
        writefile.write(temp);
}
        writefile.close();
        


    }


    /**
     * Do not use this question 2 method
     */
    @Deprecated
    public static void que2() {

        System.out.println("Inside ques 2 method ");
    }
}
