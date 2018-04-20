/*
* Simplify Fraction
* This program simplifies the fraction given
* Eg: Input : 12 6
*     Output 2/1
*/ 
public class SimplifyFraction
{
  public static void main(String args[])
  {
    int divisor;
    int num1 = 22;
    int num2 = 4;

    for(divisor = num1 < num2 ? num1 : num2; divisor >= 1; divisor--)
    {
      if(num1 % divisor == 0 && num2 % divisor == 0)
      {
        break;
      }
    }
    System.out.print(num1/divisor + "/" + num2/divisor);
  }
}
