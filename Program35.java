//remove duplicates

class Program35
{
public static void main(String[]args)
{

     int a[]={10,20,30,30,40,50};

     for(int i=0;i<a.length;i++){

         Boolean unique=true;

         for(int j=0;j<i;j++){

             if(a[i]==a[j]){

             unique=false;

             break;

          }
      }

      if(unique)

        System.out.print(a[i] + " ");
      
    }
  }
}