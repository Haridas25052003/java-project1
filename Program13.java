//checking that the number is prime or not

class PrimeCheck
{


       void checkPrime(int n){

        
    
        if(n==0 || n==1)

             System.out.println("not prime");

        else

             for(int i=2;i<=n/2;i++){

                 if(n%i==0){

                    System.out.println("is not Prime "+ n);

                    break;

                  }
                 
                  else{

                      System.out.println("it is a prime "+n);

                      break;
                  }

         
       }

 }
}
class Program13
{  
public static void main(String[]args)
{

       //Program13 p=new Program13();
      
       PrimeCheck p=new PrimeCheck(); 

       p.checkPrime(11);

      


  }
}