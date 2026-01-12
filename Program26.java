//finding the second digit of the give number
//int num=12345   n=2;

class Practice
{
 
      int second(int n){

          while(n>99)

              n/=10;

              int last=n%10;

         

          return last;

      }

}

class Program26
{
public static void main(String[]args)
{
 
       Practice p=new Practice();

       System.out.println(p.second(12345));

  }
}
      
  
               