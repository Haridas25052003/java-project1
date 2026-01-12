//finding the sum of the digits 

class Practice 
{
 
      int sumdigit(int n){

          int sum=0;

          int lastdigit;

          while(n!=0){

                lastdigit=n%10;

                sum=sum+lastdigit;

                n/=10;

          }

          return sum;
      }
}

class Program27
{
public static void main(String[]args)
{

       Practice p=new Practice();

       System.out.println(p.sumdigit(12345));

  }
}