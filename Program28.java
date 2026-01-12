//finding the average of the numbers
//int n=12345

class Practice
{

      double avg(int n){

             int sum=0;

             int last;
 
             int count=0;

             while(n!=0){

                last=n%10;

                sum=sum+last;

                n/=10;

                count++;

             }

             return sum/count;
        }
}

class Program28
{
public static void main(String[]args)
{

       Practice p=new Practice();

       System.out.println(p.avg(12345));

 }
}