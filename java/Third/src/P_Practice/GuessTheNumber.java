package P_Practice;
import java.util.*;
class number{
    private int user,small=0,big=100,prebig,presmall;
    public void setUser(int user)
    {
        if(user>this.random)

        {
            if(user>100)
            {
                this.big=this.prebig;
            }
            else {
            this.prebig=this.big=user;}
            System.out.println("WRONG GUESS --> Number is in between " + this.small + " & " +this.big);

        }
        else
        {
            if(user<this.small)
            {
                this.small=this.presmall;
            }
            else {
            this.presmall=this.small=user;}
            System.out.println("WRONG GUESS ---> Number is in between " + this.small + " & " +this.big);

        }

        takeInput();
    }




    private int score;
    private int random;

    public number()
    {
    this.random=new Random().nextInt(101);
    this.score=0;

    }
    public void takeInput(){
        this.score++;
        System.out.println("Enter number  ");
        this.user=new Scanner(System.in).nextInt();

        isCorrect();
    }
    public boolean playagain()
    {
        String opinion;
        System.out.println("Do you wish to Play again : \"Yes\" or \"No\"");
        opinion=new Scanner(System.in).next();
        opinion=opinion.toLowerCase();
        if(opinion.equals("yes"))
        {
            this.random=new Random().nextInt(101);
            this.score=0;
            return true;
        } else if (opinion.equals("no")) {
            return false;
        }
        else {
            System.out.println("enter valid statement");
            playagain();
        }
        return false;
    }
    public void isCorrect()
    {
    if(user==random)
    {
        System.out.println("Congratulation Score : " + this.score);
        this.prebig=this.big=100;this.presmall=this.small=0;
    }
    else
    {
        
        setUser(this.user);

    }
    }
}
public class GuessTheNumber {
    public static void main(String[] args) {
    number obj=new number();

  while(true) {
      obj.takeInput();
        if(!(obj.playagain()))
        {
            System.out.println("Thanks for playing ");
            break;
        }

  }
    
    }
}