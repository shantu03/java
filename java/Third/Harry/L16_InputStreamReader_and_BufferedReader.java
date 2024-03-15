package Harry;//INTRODUCTION TO SCANNER CLASS WE ALREADY DISCOVERD


//This only work for String Input with expection 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L16_InputStreamReader_and_BufferedReader {
	public static void main(String[] args) throws IOException {
		InputStreamReader tc = new InputStreamReader(System.in);
		BufferedReader sc= new BufferedReader(tc);
		
		System.out.println("Enter string ");
		String a=sc.readLine();
		
		System.out.println(a);
	}
}
