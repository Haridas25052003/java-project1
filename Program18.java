//finding the second last digit number
//int num=12345

class SecondLast
{

      int secondLast(int n){

          n/=10;

          int last=n%10;

          return last;

     }
}

class Program18
{
public static void main(String[]args)
{

       SecondLast l=new SecondLast();

       System.out.println(l.secondLast(12345));

 }
}