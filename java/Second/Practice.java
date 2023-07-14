import java.util.Scanner;
public class Practice{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		for(int i=k;i>0;i--)
		{
			for(int j=i-1;j>0;j--)
			{
				
				System.out.print("*");
				
			}
			System.out.println("");
		}
	}
}


















//L16
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Practice{
//	public static void main(String[] args) throws IOException {
//		InputStreamReader tc=new InputStreamReader(System.in);
//		BufferedReader sc=new BufferedReader(tc);
//		String name=sc.readLine();
//
//		
//		System.out.println(name);
//	}
//}

//+++++++++++++++++++++++++++++++++++++++++++++++++++
//L16
//import java.util.*;
//public class Practice{
//	public static void main(String[] args) {
//		Scanner sh=new Scanner(System.in);
//		System.out.println("enter two number for addtion ");
//		int a=sh.nextInt();
//		int b=sh.nextInt();
//		System.out.println(a+b);
//		
//	}
//}