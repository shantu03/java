package P_Practice;
import java.util.Scanner;
public class mypractice2 {
    public static void main(String[] args) {
//        Write a Java program to capitalize the first letter of each word in a sentence

        char[] input=new Scanner(System.in).nextLine().toCharArray();
        for(int i=1;i<input.length;i++)
        {
            if(i==1)
            {
                input[i-1]=format(input[i-1]);
            }
            if(input[i-1]==' '){
                input[i]=format(input[i]);
            }
        }
        System.out.println(input);
    }
    static char format(char letter){
        if(letter>='a' && letter<='z')
        {
            letter-=32;
            return letter;
        }
        /*else --->to get lowercase
        {
            letter+=32;
            return letter;
        }*/
        return letter;
    }
}
