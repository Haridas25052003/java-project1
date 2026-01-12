//check that number is prime or not
class practice30{

      void checkPrime(int a){

           if(a<2){

              System.out.println("not a prime:");

           }

           else{

               if(a%2==0){

                  System.out.println("not a prime:");

              }

              else{

                  System.out.println("it is prime:");

             }

 }
}
}

class Program30{

public static void main(String[]args)
{

      practice30 p=new practice30();

      p.checkPrime(3);

 }
}
