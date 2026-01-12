//sort the array in ascending order

class Program36
{
public static void main(String[]args)
{

    int a[]={40,20,10,50,30};

    for(int i=0;i<a.length;i++){

        for(int j=i+1;j<a.length;j++){

            if(a[i] > a[j]){

               int temp=a[i];

               a[i]=a[j];

               a[j]=temp;

            }
         }

     }

     System.out.println("after sorting the array");

     for(int i=0;i<a.length;i++){

         System.out.print(a[i] + " ");

     }

  }
}