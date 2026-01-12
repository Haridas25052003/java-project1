//check that the number is prime or not

class checkPrime
{

      public void isPrime(int n){

    
             if(n==0 || n==1){

                System.out.println("0 and 1 are not prime");

             }

             else{


                 for(int i=2;i<=n/2;i++){


                     if(n%i==0){

                        System.out.println("it is not prime number "+n);

                        break;

                     }

                     else{

                         System.out.println("it is a prime number "+n);

                         break;

                     }
                  }

              }
           }
       }

 class Program14
{
public static void main(String[]args)
{

        checkPrime p=new checkPrime();

        p.isPrime(7);

 }
}

                     