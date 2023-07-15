import java.util.Scanner;
public class Bank_Management {
	public static void main(String[] args) {
		System.out.println("Enter your name and customer ID");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String Id=sc.nextLine();
		
		Bman obj=new Bman(name,Id);
		obj.menu();
	}
}
class Bman{
	String C_name;
	String C_ID;
	Bman(String name,String Id)
	{
		this.C_name=name;
		this.C_ID=Id;
		System.out.println("Welcome " +"\"" + C_name  + "\"" + "\n"+ "Your ID - " + C_ID);
	}
	double balance=0;
	double t_Status=0;
	String Transfer_id;
	int count=0;
	void deposit(double amount)
	{
		if(!(amount<0))
		{
			balance+=amount;
			t_Status=amount;
		}
	}
	boolean history()
	{
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		if(count==99) 
			{count=0;
			return false;
			
			}
		else if(t_Status==0)
		{
			System.out.println("NO TRANSLATION TAKE PLACE");
			return true;
		}
		else if(t_Status<0)
		{
			System.out.println("Withdrawn amount : " + t_Status);
			return true;
		}
		else if(t_Status>0)
		{
			System.out.println("Amount deposite : " + t_Status);
			return true;
		}
		else return false;
	}
	void transfer(String id,double amount)
	{
		if(balance>=amount)
		{
		count=99;
		Transfer_id=id;
		balance-=amount;
		t_Status=-amount;
		}
		else
		{
			System.out.println("Insufficiant amount");
		}
		
	}
	void withdraw(double amount)
	{
		if(balance>=amount)
		{
			balance-=amount;
			t_Status=-amount;
		}
		else System.out.println("Insufficient balance");
	}
	void menu()
	{
		boolean exit=true;
		
		do {
		System.out.println("Please select opiton "
				+ "\n a)Check Balance\n b)Deposite Money\n c)Withdraw Money"
				+"\n d)Transfer Money\n e)Transition History\n f)exit");
		Scanner tc=new Scanner(System.in);
		char status=tc.next().charAt(0);
		
		switch(status)
		{
		case 'a':
		{
			System.out.println("++++++++++++++++++++++++++++++++++++++++\n Balance is -> "
					+ balance + "\n++++++++++++++++++++++++++++++++++++++++");
		break;
		}
		case 'b':
		{
			System.out.println("Enter amount to deposite money ");
			double damt=tc.nextDouble();
			deposit(damt);
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		
		break;}
		case 'c':
		{
			System.out.println("++++++++++++++++++++++++++++++++++++++\n"
					+"Enter amount to withdraw ");
			double wamt=tc.nextDouble();
			withdraw(wamt);
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
		break;}
		case 'd':
		{
			System.out.println("Enter customer id to transfer money ");
			String cid=tc.next();
			System.out.println("Enter amount ");
			double tamt=tc.nextDouble();
			do {
			System.out.println(tamt + "transfering to " + cid + "\nEnter 1 to confirm or 2 to cancle");
			int k=tc.nextInt();
			System.out.println("+++++++++++++++++++++++++++++++++++++++++");
			if(k==1)
			{
				System.out.println("Amount tranfering.....Please wait");
				transfer(cid,tamt);
				System.out.println("Done");
				
				break;
			}
			else if(k==2)
			{
				System.out.println("Cancel Transfer");
				break;
			}
			else
			{
				System.out.println("Please select correct option ");
			}
			}while(true);
			
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		break;}
		
		case 'e':
		{
			if(history())
			{
		
				
			}
			else
			{
				System.out.println("Money  Transeferd -> "
						+ t_Status +" to " + Transfer_id);
			}
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		break;}
		
		case 'f':
		{
			System.out.println("Thanks for your co-operation"
					+ "+++++++++++++++++++++++++++++++++++++++++++++++++++++");
			
			exit=false;
		break;}
			
		default:
		{
			System.out.println("Please select correct option ->");
		}
		}
		
		}while(exit);
		
	}
	
}