class Program59
{
public static void main(String[]args)
{

  int []a={1,2,9,4,5};

  Boolean sorted=true;

  for(int i=0;i<a.length-1;i++){

      if(a[i] > a[i+1]){

         sorted=false;

         break;

      }
   }

   if(sorted)

      System.out.println("sorted");

   else

      System.out.println("not sorted");

 }
} 