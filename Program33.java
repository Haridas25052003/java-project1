class Program33
{
public static void main(String[]args)
{

  //second max

  int a[]={12,7,2,2,1};

  int min=a[0];

  int secondmin=a[1];

  for(int i=0;i<a.length;i++){

      if(a[i] < min){

         secondmin=min;

         min=a[i];

      }

      else if(a[i] < secondmin && a[i]!=min){

         secondmin=a[i];

      }
   }

   System.out.println(min);
  
   System.out.println(secondmin);

 }
}