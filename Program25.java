//find the first digit of the number
//int n=12345  n=1;

class Practice
{

      int first(int n){

          while(n>9)

                n/=10;

          return n;
      }
}

class Program25
{
public static void main(String[]args)
{

       Practice p=new Practice();

       System.out.println(p.first(12345));

 }
}