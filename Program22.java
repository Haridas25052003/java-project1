//finding the average of the number after the sum
//int sum=12345 sum=15 avg=15/5=3

class Avg
{

      double avg(int n){

             double sum=0;
     
             int count=0;

             while(n!=0){

                   int last=n%10;

                   sum=sum+last;

                   n/=10;

                   count++;

             }

             return sum/count;
        }

 }

class Program22
{
public static void main(String[]args)
{

       Avg a=new Avg();

       System.out.println(a.avg(12345));
 
 }
}

             