//page 14-15
package Harry;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

/*There are 7 types of operator
* 1. Arithmetic ==> +, - , % , / , *
* 2.Logical ==> &&,||,!
* 3. Unary ==> ++, --, ! , +, -
* 4.Ternary ===> condition?true:false
* 5.Assignment ==> =,+=,-=,/=,%=,*=,<<=,>>=,>>>=, &= , |=, ^=
* 6.Relational ==> ==,!=,<,>,<=,>=
* 7.Shift ==> >>,<<,>>>
* 8.Bitwise ===> & , |, ^
* */
class Artithmatic{
    public Artithmatic()
    {
        System.out.println("ARITHMETIC OPERATOR  ( +, - , % , / , *)  ===>   work on value's"
                + "\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
    }
}
class Logical{
    public Logical()
    {
        System.out.println("LOGICAL OPERATOR(&&,||,!) ===>   work on bool value only"
                + "\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
    }

}
class Unary{
    public Unary(){
        System.out.println("UNARY OPERATOR(++, --, ! , +, -) HERE this work as\t!(operand) , +(value), -(value) "
                + "\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
    }

}
class Ternary{
    public Ternary()
    {
        System.out.println("TERNARY OPERATOR WORK AS  condition?true:false"
                + "\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
    }

}
class Assignment
{
    public Assignment()
    {
        System.out.println("ASSIGNMENT OPERATOR ( =,+=,-=,/=,%=,*=,<<=,>>=,>>>=, &= , |=, ^= ) "
        + "\t we have to learn all other operator "
                + "\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");  //well it simple just revised the topic (or think carefully_)
    }
}
class Relational{
    public Relational()
    {
        System.out.println("RELATIONAL OPERATOR (==,!=,<,>,<=,>= )\t it return relation between statement(usually bool value)"
                + "\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
    }

}
class Shift{
    public Shift()
    {
        System.out.println("SHIFT OPERATOR (<<, >>, >>>)\t"
        );

        int a=10;
        System.out.println("a=10(0b1010) a<<2 -> 2bit left shift(0b101000) ==" + (a<<2));
        System.out.println("a=10(0b1010) a>>2 -> 2bit left shift(0b10) ==" + (a>>2));
        System.out.println("a=10(0b1010) a>>>2 -> >> & >>> are same for positive value \t negative value is scary" + (a>>>2)
                + "\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");

    }

}
class Bitwise{
    public Bitwise()
    {

        System.out.println("BITWISE OPERATOR( &(AND) , |(OR), ^(EX-OR),~(NOT) ) WORK IN BITS ONLY");
        System.out.println("for example --> 10 & 2 ==> (0b1010) & (0b0010) ==> (0b0010) ==> 2\n"
        + "Q] 55 & 22 == " + (55&22) +
                "\nSame for other BITWISE OPERATOR" + "\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
    }
}
public class Operators {
    public static void main(String[] args) {
    Artithmatic obj1=new Artithmatic();
    Logical obj2=new Logical();
    Unary obj3=new Unary();
    Ternary obj4=new Ternary();
    Assignment obj5 =new Assignment();
    Relational obj6 =new Relational();
    Shift obj7=new Shift();
    Bitwise obj8=new Bitwise();
    }
}
