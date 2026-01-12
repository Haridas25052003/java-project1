//finding the first digit of the number
//int n=12345;

class firstNum
{

      int firstDigit(int n){

          while(n>9)

                n/=10;

          return n;

     }
}

class Program19
{
public static void main(String[]args)
{

       firstNum f=new firstNum();

       System.out.println(f.firstDigit(123));

  }
}