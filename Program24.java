//finding the second last digit of the number
//int n=12345  ans=4;

class Practice
{

      int second(int n){

          n/=10;

          int last=n%10;

          return last;

      }
}

class Program24
{
public static void main(String[]args)
{

       Practice p=new Practice();

       System.out.println(p.second(12345));

 }
}