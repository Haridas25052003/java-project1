//finding the last digit of the number
//int num=1234   n=4

class Practice
{

      int last(int n){

          int lastnum=n%10;

          return lastnum;

      }
}

class Program23
{
public static void main(String[]args)
{

       Practice p=new Practice();

       System.out.println(p.last(1234));
 
 }
}