//reverse the number

class Program46
{
public static void main(String[]args)
{

    int num=144, rev=0;

    int temp=num;
  
    while(num!=0){

       rev*=10;

       rev+=num%10;

       num/=10;

    }

    System.out.println("reverse the number: "+rev);

 }
}