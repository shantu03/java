/*
Write a program by creating an 'Employee' class having the following methods and print the final salary.
1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.
*/




import java.util.Scanner;
class Employee{
private int salary,work;
public void getInfo(int salary,int work)
{
if(salary<0 || work<0)
{
System.out.println("Invalid Statement");
}
else
{
this.salary=salary;
this.work=work;
addSal();
}
}

public void addSal()
{
if(this.salary<500){this.salary+=10;}
addWork();
}

public void addWork()
{
if(this.work>6){this.salary+=5;}
result();
}

public void result()
{
System.out.println("Employee Salary : " + this.salary);
}

}



public class Problem4{
public static void main(String[] args)
{
Employee obj=new Employee();
System.out.println("Enter Salary and no. of hrs/day working :  ");
int k=new Scanner(System.in).nextInt();
int j=new Scanner(System.in).nextInt();
obj.getInfo(k,j);
}
}