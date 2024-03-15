package Harry;

import java.util.Scanner;

public class L20_array {
	public static void main(String[] args) {
		_2D();
	//	_1D();

		
	}
	static void _2D()
	{
		int  [][] arr=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter symbol");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("length of array --> " + arr.length + arr[0].length);
	}
	
	
	static void _1D()
	{
		String[] _string = new String[4];
		int[] _int = new int[4];
		double[] _double = new double[4];
		float[] _float = new float[4];
		char[] _char = new char[4];
		boolean[] _boolean = new boolean[4];
	
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("for String");
		for (int i = 0; i < 2; i++) {
			_string[i] = sc.next();
		}
		System.out.println("for int ");
		for (int i = 0; i < 2; i++) {
			_int[i] = sc.nextInt();
		}
		System.out.println("for double");
		for (int i = 0; i < 2; i++) {
			_double[i] = sc.nextDouble();
		}
		System.out.println("for float");
		for (int i = 0; i < 2; i++) {
			_float[i] = sc.nextFloat();
		}
		System.out.println("for char");
		for (int i = 0; i < 2; i++) {
			_char[i] = sc.next().charAt(0);
		}
//		Cannot take input from user
		System.out.println("for boolean");
		for (int i = 0; i < 2; i++) {
			int j = sc.nextInt();
			if (j == 1) {
				_boolean[i] = true;
			} else {
				_boolean[i] = false;
			}
		}

		System.out.println("for String  -->");
		for (int i = 0; i < 4; i++) {
			System.out.println(_string[i]);
		}
		System.out.println("for int  -->");
		for (int i = 0; i < 4; i++) {
			System.out.println(_int[i]);
		}
		System.out.println("for double  -->");
		for (int i = 0; i < 4; i++) {
			System.out.println(_double[i]);
		}
		System.out.println("for float  -->");
		for (int i = 0; i < 4; i++) {
			System.out.println(_float[i]);
		}
		System.out.println("for char  -->");
		for (int i = 0; i < 4; i++) {
			System.out.println(_char[i]);
		}
		System.out.println("for boolean  -->");
		for (int i = 0; i < 4; i++) {
			System.out.println(_boolean[i]);
		}


	}
}
