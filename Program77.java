//find the second largest element from the array
class Program77
{
public static void main(String[]args)
{

   int a[]={100,20,30,40,50,60};

   int max=0;

   int secmax=a[0];

   for(int i=0;i<a.length;i++){

       if(a[i] > max){

         secmax=max;

         max=a[i];
     
      }

      else if(a[i] > secmax && a[i]!=max){

           a[i]=secmax;
      }
   }

  System.out.println(max);

  System.out.println(secmax);

 }
}
