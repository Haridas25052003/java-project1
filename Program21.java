//finding the sum of the digit
//int num=12345 sum=15

class Sum
{

      int sumofDigit(int n){

          int sum=0;

          int lastDigit;

          while(n!=0){

                lastDigit=n%10;

                sum=sum+lastDigit;

                n/=10;

          }

          return sum;
      }
}

class Program21
{
public static void main(String[]args)
{

       Sum s=new Sum();

       System.out.println(s.sumofDigit(12345));

 }
}