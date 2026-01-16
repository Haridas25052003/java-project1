class Program58
{
public static void main(String[]args)
{

  int a[]={1,2,3,4,5,6,7,8};

  int start=0;
  
  int end=a.length-1;

  for(int i=0;i<a.length-1;i++){

      int temp=a[i];

      a[i]=a[i+1];

      a[i+1]=temp;

      start++;

      end--;
 

  }

  for(int i=0;i<a.length;i++){

      System.out.print(a[i] + " ");

  }
 }
}