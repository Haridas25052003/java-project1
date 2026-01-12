//for checking that the element is prime or not


class practice29{
 
      void checkPrime(int a[]){

           for(int i=0;i<a.length;i++){

             int num=a[i];

             if(num<2){

               System.out.println(num +"not prime");

            }

            else{

                if(num%2==0){

                   System.out.println(num+ "not prime");

                }

                else{

                  System.out.println(num+ "is a prime");

               }
           }
        }
     }

 }
class Program29
{
public static void main(String[]args)
{

      int a[]={11,20,30,40,50};

      practice29 p=new practice29();

      p.checkPrime(a);


 }
}