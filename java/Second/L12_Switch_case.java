import java.util.*;
//EMAIL AND PASSWORD CHECKING ---->giving  error in this  code 
public class L12_Switch_case {
	public static String funn()
	{
		Scanner tc=new Scanner(System.in);
		String old="shantanuhulwan123@gmail.com";
		System.out.println("Enter email");
		String email=tc.nextLine();
		System.out.println("Enter password");
		String pass1=tc.nextLine();
		System.out.println("Enter password again");
		String pass2 =tc.nextLine();
		
		if(old==email)
		{
			System.out.println("Welcome user");
			if(pass1==pass2)
				return "Existing";
			else
				return "Invalid";
		}
		else
		{
		return "New";
		}
		
		
		
	}
	public static void main(String[] args) {
		System.out.println("Program for email and password checking with switch case");
		String ans=funn();
		
		switch(ans)
		{
		case "New":
			System.out.println("Please Register");break;
		
		case "Existing":
			System.out.println("Logged in");break;
		
		case "Invalid":
			System.out.println("Wrong password");break;
			
		default:
			System.out.println("something wrong ");break;
		}
	}
}
