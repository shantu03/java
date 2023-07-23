import java.util.Random;
import java.util.Scanner;

public class rockpaperscissor
{
public static void main(String[] args)
{
System.out.println("Welcome to Rock-Paper-Scissor Game!++++");
game();
}
static void game()
{
String[] choice={"rock","paper","scissor"};
while(true){

System.out.println("Enter your choice : -- >");
String playerchoice=new Scanner(System.in).nextLine();
playerchoice=playerchoice.toLowerCase();

if(!valid(playerchoice)) {
System.out.println("invalid input try again"); continue;}


Random tc=new Random();
int k=tc.nextInt(3);
String computerchoice=choice[k];
System.out.print("***\nComputer_Choice : " +computerchoice+ "\t;Player_Choice : "+ playerchoice + "=======>  ");
result(playerchoice,computerchoice);
if(!playagain()){break;}

}//-->while loop
}

static boolean playagain(){
while(true){
System.out.println("\n Do you wish to play again?:  ");
String wish =new Scanner(System.in).next();
wish=wish.toLowerCase();
if(!(wish.equals("yes")||wish.equals("no"))){System.out.println("invalid input try again !");continue;}

if(wish.equals("yes")){return true;}
else return false;



}
}
static void result(String player,String computer)
{

if(player.equals(computer)){
System.out.println("^^^It Draw^^^");}
else if(player.equals("rock")&&computer.equals("scissor")){System.out.println("^^^Player Win^^^");}
else if(player.equals("paper")&&computer.equals("rock")){System.out.println("^^^Player win^^^");}
else if(player.equals("scissor")&&computer.equals("paper")){System.out.println("^^^Player win^^^");}
else {System.out.println("^^^Computer Win^^^");}

}


static boolean valid(String playerchoice)
{
if(playerchoice.equals("rock")||playerchoice.equals("paper")||playerchoice.equals("scissor")){
return true;}
else return false;
}





















}