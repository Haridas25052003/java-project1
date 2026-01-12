//write a program to check the Armstrong number

class Program16
{
public static void main(String[]args)
{

       int n=153;

       int temp=n,sum=0;

       while(temp>0){

             int d=temp%10;

             sum+=d*d*d;
   
             temp/=10;

       }

       System.out.println(sum==n ?"Armstrong" : "not Armstrong");

 }
}



