class Program44
{
public static void main(String[]args)
{

    int num=121 , rev=0;

    int temp=num;

    while(num!=0){

       rev*=10;

       rev+=num%10;

       num/=10;

    }

    if(temp==rev){

       System.out.println("it is palindrome");

    }

    else{

       System.out.println("It is not palindrome");

   }
  }
}