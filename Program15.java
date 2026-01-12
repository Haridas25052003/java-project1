//reverse the number

class reverse
{

      int reverseNum(int n){

          int rev=0;

          while(n!=0){

                rev*=10;

                rev+=n%10;

                n=n/10;

          }

          return rev;

      }
}

class Program15
{
public static void main(String[]args)
{

       reverse r=new reverse();

       System.out.println(r.reverseNum(12));

       //r.reverseNum(12);


  }
}
             