//finding the last digit of the number
//int num=12345;

class lastNum
{

      int lastNum(int n){

          int lastnum=n%10;

          return lastnum;

      }
}

class Program17
{
public static void main(String[]args)
{

       lastNum l=new lastNum();

       System.out.println(l.lastNum(12345));

 }
}



           