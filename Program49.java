//Armstrong number

class Program49
{
public static void main(String[]args)
{

  int num=153 , temp=num , sum=0;

  while(num!=0){

    int digit = num%10;

    sum += digit * digit * digit;

    num/=10;

  }

  if(temp==sum){
  
     System.out.println("Armstrong number");

  }

  else {

     System.out.println("not Armstrong");

  }
 }
}