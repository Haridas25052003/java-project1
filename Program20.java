//finding the second digit of the number
//int num=12345 o/p=2

class seconddigit
{

      int secondDigit(int n){

          int last=0;

          while(n>99){

                n=n/10;

                last=n%10;
  
          }

          return last;

      }
}

class Program20
{
public static void main(String[]args)
{

       seconddigit d=new seconddigit();

       System.out.println(d.secondDigit(12345));

 }
}

                