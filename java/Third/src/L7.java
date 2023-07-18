
public class L7 {
public static void main(String[] args) {
	int a=69; //here 69 is literals
	//Literals means whatever value we assign to variable
	System.out.println("INTEGER -> "+Integer.MAX_VALUE + " TO " + Integer.MIN_VALUE);
	System.out.println("BYTE -> " + Byte.MIN_VALUE + " TO " + Byte.MAX_VALUE);
	System.out.println("Char -> " + Character.MIN_VALUE + " to " + Character.MAX_VALUE);

	
//	long p=4654616464685643;  ---> throw error because default it is integer type to avoid this append 'l' or 'L' 
	long p=4654616464685643l;
	float j=75.5f; //default double after appending f it become float
	
	char aa='\"';	//apan direct " assign nahi kru shakat, ya technique la ecape character add mhantat (mazya mate)
	
	char sho='\u0101';		//--> unicode 
	System.out.println(sho);

	String ju="\"this is this\"";
	System.out.println(ju);

}

}
