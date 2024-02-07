import java.util.Scanner;
class Calculator
{
  public static void main(String[] args)
  {
    float a,b;
    int choice;
    Scanner input=new Scanner(System.in);
    System.out.print("Enter the value of a,b values : ");
    a=input.nextFloat();
    b=input.nextFloat();
  System.out.print("Enter 1. ADDITION  2. SUBTRACTION  3. MULTIPLICATION  4. DIVISION : \n");
    choice=input.nextInt();
    //input.close();
    if(choice==1)
    {
      System.out.print("The sum : "+a+" and "+b+" is "+(a+b));
    }
    else if(choice==2)
    {
      System.out.print("The difference : "+a+" and "+b+" is "+(a-b));
    }
    else if(choice==3)
    {
      System.out.print("The product : "+a+" and "+b+" is "+(a*b));
    }
    else if(choice==4)
    {
      System.out.print("The quotient : "+a+" and "+b+" is "+(a/b));
    }
    else
    {
      System.out.print("Enter valid choice!!\nPlease try again!!\n");
    }
  }
}

